
package principal;

import javax.swing.JFrame;


public class Login extends javax.swing.JFrame {


public Login() {
    initComponents();
    
    // Configuración general de la ventana
    setSize(1000, 800);
    setLocationRelativeTo(null);
    setResizable(false);
    
    // Configurar la tarjeta translúcida
    PanelLogin.setBounds(275, 75, 450, 650);
    PanelLogin.setOpaque(true);
    PanelLogin.setBackground(new java.awt.Color(255, 255, 255, 140));
    PanelLogin.putClientProperty("JComponent.roundRect", true);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        txtEmail = new diseño.JTextFieldRedondeado();
        txtPassword = new diseño.JPasswordFieldRedondeado();
        btnIniciarSesion = new diseño.JButtonRedondeado();
        lblBienvenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 250));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setAlignmentX(275.0F);
        PanelLogin.setAlignmentY(75.0F);
        PanelLogin.setPreferredSize(new java.awt.Dimension(450, 650));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblBienvenido.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenido");
        lblBienvenido.setAlignmentX(125.0F);
        lblBienvenido.setAlignmentY(30.0F);
        lblBienvenido.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblBienvenido))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblBienvenido)
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        LabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(LabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
         // 1. Crear la instancia de la ventana del menu
        Menu Principal = new Menu(); 
 
        // 2. Hacer visible el Menu
        Principal.setVisible(true); 
 
        // 3. Cerrar la ventana de Login actual 
        this.dispose(); 
   
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

   
public static void main(String args[]) {
    // 1. Configurar FlatLaf antes de iniciar la interfaz (puedes usar FlatDarkLaf o FlatLightLaf)
    com.formdev.flatlaf.FlatDarkLaf.setup();
    // (Opcional recomendado) Activar propiedades globales para bordes redondeados
    // FlatLaf soporta bordes suaves y estilo moderno por defecto si se configuran UIManager:
    javax.swing.UIManager.put("Component.arc", 15); // Radio de redondeo general
    javax.swing.UIManager.put("TextComponent.arc", 15);
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
