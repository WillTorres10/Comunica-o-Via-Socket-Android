package com.example.will.socketcliente;

import android.media.MediaRecorder;
import android.os.AsyncTask;
import android.widget.TextView;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SendMessage extends AsyncTask<Void, Void, String> {

    String dstAddress;
    int dstPort;
    String response = "";
    TextView textResponse;
    Socket socket;
    String X, Y, Z;

    SendMessage(String addr, int port, TextView textResponse) {
        dstAddress = addr;
        dstPort = port;
        X = null;
        Y = null;
        Z = null;
        this.textResponse = textResponse;
    }

    @Override
    protected String doInBackground(Void... arg0) {

        try {
            socket = new Socket(dstAddress, dstPort);

            try {
                OutputStream outStream = socket.getOutputStream();

                //PrintWriter out = new PrintWriter(outStream);

                //String toSend = "X: "+X+" Y: "+Y+" Z: "+Z;
                //Gerando o OutputStream
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                Integer cont = 0;
                while(true) {
                    if(isCancelled())
                        break;
                    TimeUnit.SECONDS.sleep(3);
                    // Gerando Arraylist com os valores do sensor
                    ArrayList<String> mandar = new ArrayList<String>();
                    mandar.add(X);
                    mandar.add(Y);
                    mandar.add(Z);

                    //Mandando mensagem

                    oos.writeObject(mandar);


                    //out.print(toSend + cont +"\r\n");
                    //out.flush();
                    //cont++;
                }



            }catch (IOException e){
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public void desconectar() throws Throwable {
        if(socket.isConnected()){
            socket.close();
        }
        this.finalize();
    }

    @Override
    protected void onPostExecute(String result) {
        textResponse.setText(response);
        super.onPostExecute(result);
    }


}