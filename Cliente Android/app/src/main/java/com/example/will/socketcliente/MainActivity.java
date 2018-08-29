package com.example.will.socketcliente;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText host, port;
    TextView sensorPort;
    SendMessage send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        //Sensor mProx = mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        Sensor mGiros = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        //mSensorManager.registerListener(new ProxSensor(), mProx, SensorManager.SENSOR_DELAY_FASTEST);
        mSensorManager.registerListener(new GirosSensor(), mGiros, SensorManager.SENSOR_DELAY_FASTEST);
        host = findViewById(R.id.ip);
        port = findViewById(R.id.porta);
        sensorPort = findViewById(R.id.sensor);


    }

    public void conectarServidor(View v) {

        send = new SendMessage(
                this.host.getText().toString(),
                Integer.parseInt(this.port.getText().toString()),
                sensorPort
        );
        send.execute();

    }

    public void desconectarServidor(View v) throws Throwable {

        send.desconectar();

    }

    class GirosSensor implements SensorEventListener {
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        public void onSensorChanged(SensorEvent event) {
            //if sensor is unreliable, return void
            if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE) {
                return;
            }

            //else it will output the Roll, Pitch and Yawn values
            sensorPort.setText(
                    "Orientation X (Roll) :" + Float.toString(event.values[2]) + "\n" +
                            "Orientation Y (Pitch) :" + Float.toString(event.values[1]) + "\n" +
                            "Orientation Z (Yaw) :" + Float.toString(event.values[0])
            );
            try {
                send.X = Float.toString(event.values[2]);
                send.Y = Float.toString(event.values[1]);
                send.Z = Float.toString(event.values[0]);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }


}


