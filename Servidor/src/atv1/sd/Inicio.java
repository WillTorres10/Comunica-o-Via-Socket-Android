package atv1.sd;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Inicio extends javax.swing.JFrame {
  
    private double x1N, y1N, z1N, x2N, y2N, z2N, x3N, y3N, z3N,mediax,mediay,mediaz;
    private String mediaxx,mediayy,mediazz;
    
    
    public Inicio() {
        initComponents();
        setSize(500,500);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fecharPrograma = new javax.swing.JButton();
        ipd1 = new javax.swing.JTextField();
        z3 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        statusD2 = new javax.swing.JTextField();
        ipd2 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        ipd3 = new javax.swing.JTextField();
        statusD1 = new javax.swing.JTextField();
        statusD3 = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        mediat = new javax.swing.JPanel();
        mediaX = new javax.swing.JTextField();
        mediaY = new javax.swing.JTextField();
        mediaZ = new javax.swing.JTextField();
        Dispositivo1 = new javax.swing.JPanel();
        Dispositivo3 = new javax.swing.JPanel();
        Dispositivo2 = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        ipendereco = new javax.swing.JLabel();
        temperaturaba = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        temperaturaba1 = new javax.swing.JLabel();
        temperaturaba2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(1);
        getContentPane().setLayout(null);

        fecharPrograma.setBackground(new java.awt.Color(255, 204, 204));
        fecharPrograma.setForeground(new java.awt.Color(255, 255, 255));
        fecharPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Cancel_16px_9.png"))); // NOI18N
        fecharPrograma.setActionCommand("sair");
        fecharPrograma.setBorder(null);
        fecharPrograma.setBorderPainted(false);
        fecharPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(fecharPrograma);
        fecharPrograma.setBounds(610, 0, 50, 30);

        ipd1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd1);
        ipd1.setBounds(140, 170, 110, 30);

        z3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        z3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(z3);
        z3.setBounds(420, 320, 110, 30);

        x1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(x1);
        x1.setBounds(140, 260, 110, 30);

        statusD2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD2);
        statusD2.setBounds(280, 140, 110, 30);

        ipd2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd2);
        ipd2.setBounds(280, 170, 110, 30);

        z2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        z2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(z2);
        z2.setBounds(280, 320, 110, 30);

        ipd3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd3);
        ipd3.setBounds(420, 170, 110, 30);

        statusD1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD1);
        statusD1.setBounds(140, 140, 110, 30);

        statusD3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD3);
        statusD3.setBounds(420, 140, 110, 30);

        z1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        z1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(z1);
        z1.setBounds(140, 320, 110, 30);

        y1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        y1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(y1);
        y1.setBounds(140, 290, 110, 30);

        x2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(x2);
        x2.setBounds(280, 260, 110, 30);

        y2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        y2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(y2);
        y2.setBounds(280, 290, 110, 30);

        y3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        y3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(y3);
        y3.setBounds(420, 290, 110, 30);

        x3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(x3);
        x3.setBounds(420, 260, 110, 30);

        mediat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MÉDIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N

        mediaX.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mediaX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        mediaY.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mediaY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        mediaZ.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mediaZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout mediatLayout = new javax.swing.GroupLayout(mediat);
        mediat.setLayout(mediatLayout);
        mediatLayout.setHorizontalGroup(
            mediatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mediaX, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediaY, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediaZ, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mediatLayout.setVerticalGroup(
            mediatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediatLayout.createSequentialGroup()
                .addGroup(mediatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediaY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediaZ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(mediat);
        mediat.setBounds(130, 420, 410, 60);

        Dispositivo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPOSITIVO 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        getContentPane().add(Dispositivo1);
        Dispositivo1.setBounds(130, 120, 130, 250);

        Dispositivo3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPOSITIVO 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        getContentPane().add(Dispositivo3);
        Dispositivo3.setBounds(410, 120, 130, 250);

        Dispositivo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPOSITIVO 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        getContentPane().add(Dispositivo2);
        Dispositivo2.setBounds(270, 120, 130, 250);

        status.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(100, 150, 29, 13);

        ipendereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipendereco.setText("Ip Address");
        getContentPane().add(ipendereco);
        ipendereco.setBounds(80, 180, 48, 13);

        temperaturaba.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba.setText("Z");
        getContentPane().add(temperaturaba);
        temperaturaba.setBounds(110, 330, 10, 14);

        titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo1.setText("SISTEMAS DISTRIBUIDOS - REDES DE SENSORES");
        getContentPane().add(titulo1);
        titulo1.setBounds(200, 40, 280, 30);

        temperaturaba1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba1.setText("X");
        getContentPane().add(temperaturaba1);
        temperaturaba1.setBounds(110, 270, 10, 14);

        temperaturaba2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba2.setText("Y");
        getContentPane().add(temperaturaba2);
        temperaturaba2.setBounds(110, 300, 10, 14);

        setSize(new java.awt.Dimension(677, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharProgramaActionPerformed
           System.exit(0);
    }//GEN-LAST:event_fecharProgramaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                
                
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dispositivo1;
    private javax.swing.JPanel Dispositivo2;
    private javax.swing.JPanel Dispositivo3;
    private javax.swing.JButton fecharPrograma;
    private javax.swing.JTextField ipd1;
    private javax.swing.JTextField ipd2;
    private javax.swing.JTextField ipd3;
    private javax.swing.JLabel ipendereco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mediaX;
    private javax.swing.JTextField mediaY;
    private javax.swing.JTextField mediaZ;
    private javax.swing.JPanel mediat;
    private javax.swing.JLabel status;
    private javax.swing.JTextField statusD1;
    private javax.swing.JTextField statusD2;
    private javax.swing.JTextField statusD3;
    private javax.swing.JLabel temperaturaba;
    private javax.swing.JLabel temperaturaba1;
    private javax.swing.JLabel temperaturaba2;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    // End of variables declaration//GEN-END:variables
    
    public void setxyz1(String x1, String y1, String z1){
        this.x1.setText(x1);
        this.y1.setText(y1);
        this.z1.setText(z1);
        x1N = Double.parseDouble(x1);
        y1N = Double.parseDouble(y1);
        z1N = Double.parseDouble(z1);
    }
    
    public void setxyz2(String x1, String y1, String z1){
        this.x2.setText(x1);
        this.y2.setText(y1);
        this.z2.setText(z1);
        x2N = Double.parseDouble(x1);
        y2N = Double.parseDouble(y1);
        z2N = Double.parseDouble(z1);
    }
    
    public void setxyz3(String x1, String y1, String z1){
        this.x3.setText(x1);
        this.y3.setText(y1);
        this.z3.setText(z1);
        x3N = Double.parseDouble(x1);
        y3N = Double.parseDouble(y1);
        z3N = Double.parseDouble(z1);
    }
    
    public void setValue(String x, String y, String z, int opcao){
        switch(opcao){
            case 1: this.setxyz1(x,y,z); mediaG(); break;
            case 2: this.setxyz2(x,y,z); mediaG(); break;
            case 3: this.setxyz3(x,y,z); mediaG(); break;
        }
    }
    
    public void setIP(String ip, int opcao){
        switch(opcao){
            case 1: this.ipd1.setText(ip); this.statusD1.setText("Conectado"); break;
            case 2: this.ipd2.setText(ip); this.statusD2.setText("Conectado"); break;
            case 3: this.ipd3.setText(ip); this.statusD3.setText("Conectado"); break;
        }
    }
    
    public void desconectIP(int opcao){
        switch(opcao){
            case 1: this.ipd1.setText(""); this.statusD1.setText("Desconectado"); break;
            case 2: this.ipd2.setText(""); this.statusD2.setText("Desconectado"); break;
            case 3: this.ipd3.setText(""); this.statusD3.setText("Desconectado"); break;
        }
    }
    
    public void mediaG(){
        mediax = (x1N+x2N+x3N)/3;
        mediaxx = Double.toString(mediax);
        this.mediaX.setText(mediaxx);
        
        mediay = (y1N+y2N+y3N)/3;
        mediayy = Double.toString(mediay);
        this.mediaY.setText(mediayy);
        
        mediaz = (z1N+z2N+z3N)/3;
        mediazz = Double.toString(mediaz);
        this.mediaZ.setText(mediazz);
    }

}
