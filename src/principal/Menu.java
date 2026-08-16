
package principal;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import diseño.PanelRedondeado;
import javax.swing.border.EmptyBorder;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(Menu.MAXIMIZED_BOTH);
         activarFilaMenu(PanelDocentes, LabelDocentes);
        }
private void activarFilaMenu(javax.swing.JPanel panelActivo, javax.swing.JLabel textoActivo) {
    
    // 1. Definimos los colores base (Fondo rosa y blanco)
    java.awt.Color fondoRosa = new java.awt.Color(255, 204, 204);
    java.awt.Color colorTextoNormal = new java.awt.Color(250, 250, 250);
    
    // 2. Reseteamos todos los paneles al fondo rosa y texto normal
    PanelDocentes.setBackground(fondoRosa);
    PanelCarrera.setBackground(fondoRosa);
    PanelMaterias.setBackground(fondoRosa);
    PanelHorarios.setBackground(fondoRosa);
    PanelDesignaciones.setBackground(fondoRosa);
    PanelUsuario.setBackground(fondoRosa);
    
    LabelDocentes.setForeground(colorTextoNormal);
    LabelCarrera.setForeground(colorTextoNormal);
    LabelMaterias.setForeground(colorTextoNormal);
    LabelHorarios.setForeground(colorTextoNormal);
    LabelDesignaciones.setForeground(colorTextoNormal);
    LabelUsuario.setForeground(colorTextoNormal);

    // 3. Aplicamos el estilo al elemento seleccionado (Fondo blanco o más claro y letra rosa fuerte para destacar)
    panelActivo.setBackground(Color.WHITE); // O un tono transparente si tu panel lo soporta
    textoActivo.setForeground(new java.awt.Color(180, 50, 50)); // Color de texto destacado
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorPrincipal = new javax.swing.JPanel();
        ContenedorMenu = new javax.swing.JPanel();
        TextoMenu = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        PanelDocentes = new diseño.PanelRedondeado();
        LabelDocentes = new javax.swing.JLabel();
        PanelCarrera = new diseño.PanelRedondeado();
        LabelCarrera = new javax.swing.JLabel();
        PanelMaterias = new diseño.PanelRedondeado();
        LabelMaterias = new javax.swing.JLabel();
        PanelHorarios = new diseño.PanelRedondeado();
        LabelHorarios = new javax.swing.JLabel();
        PanelDesignaciones = new diseño.PanelRedondeado();
        LabelDesignaciones = new javax.swing.JLabel();
        PanelUsuario = new diseño.PanelRedondeado();
        LabelUsuario = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        ContenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        ContenedorMenu.setBackground(new java.awt.Color(255, 204, 204));
        ContenedorMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoMenu.setBackground(new java.awt.Color(255, 204, 204));

        LabelMenu.setBackground(new java.awt.Color(255, 255, 255));
        LabelMenu.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        LabelMenu.setForeground(new java.awt.Color(255, 255, 255));
        LabelMenu.setText("Menu");

        javax.swing.GroupLayout TextoMenuLayout = new javax.swing.GroupLayout(TextoMenu);
        TextoMenu.setLayout(TextoMenuLayout);
        TextoMenuLayout.setHorizontalGroup(
            TextoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoMenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(LabelMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TextoMenuLayout.setVerticalGroup(
            TextoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextoMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMenu)
                .addContainerGap())
        );

        ContenedorMenu.add(TextoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, 591, -1));

        PanelDocentes.setBackground(new java.awt.Color(255, 204, 204));
        PanelDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDocentesMouseClicked(evt);
            }
        });

        LabelDocentes.setBackground(new java.awt.Color(255, 255, 255));
        LabelDocentes.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelDocentes.setForeground(new java.awt.Color(255, 255, 255));
        LabelDocentes.setText("Docentes");
        LabelDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelDocentesLayout = new javax.swing.GroupLayout(PanelDocentes);
        PanelDocentes.setLayout(PanelDocentesLayout);
        PanelDocentesLayout.setHorizontalGroup(
            PanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDocentesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDocentesLayout.setVerticalGroup(
            PanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDocentesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 257, 591, 80));

        PanelCarrera.setBackground(new java.awt.Color(255, 204, 204));
        PanelCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCarreraMouseClicked(evt);
            }
        });

        LabelCarrera.setBackground(new java.awt.Color(255, 255, 255));
        LabelCarrera.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelCarrera.setForeground(new java.awt.Color(255, 255, 255));
        LabelCarrera.setText("Carreras");

        javax.swing.GroupLayout PanelCarreraLayout = new javax.swing.GroupLayout(PanelCarrera);
        PanelCarrera.setLayout(PanelCarreraLayout);
        PanelCarreraLayout.setHorizontalGroup(
            PanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarreraLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCarreraLayout.setVerticalGroup(
            PanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCarreraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 342, 591, -1));

        PanelMaterias.setBackground(new java.awt.Color(255, 204, 204));
        PanelMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMateriasMouseClicked(evt);
            }
        });

        LabelMaterias.setBackground(new java.awt.Color(255, 255, 255));
        LabelMaterias.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelMaterias.setForeground(new java.awt.Color(255, 255, 255));
        LabelMaterias.setText("Materias");
        LabelMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelMateriasLayout = new javax.swing.GroupLayout(PanelMaterias);
        PanelMaterias.setLayout(PanelMateriasLayout);
        PanelMateriasLayout.setHorizontalGroup(
            PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMateriasLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMateriasLayout.setVerticalGroup(
            PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMateriasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 427, 591, -1));

        PanelHorarios.setBackground(new java.awt.Color(255, 204, 204));
        PanelHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelHorariosMouseClicked(evt);
            }
        });

        LabelHorarios.setBackground(new java.awt.Color(255, 255, 255));
        LabelHorarios.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelHorarios.setForeground(new java.awt.Color(255, 255, 255));
        LabelHorarios.setText("Horarios");

        javax.swing.GroupLayout PanelHorariosLayout = new javax.swing.GroupLayout(PanelHorarios);
        PanelHorarios.setLayout(PanelHorariosLayout);
        PanelHorariosLayout.setHorizontalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHorariosLayout.setVerticalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHorariosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 512, 591, -1));

        PanelDesignaciones.setBackground(new java.awt.Color(255, 204, 204));
        PanelDesignaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelDesignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDesignacionesMouseClicked(evt);
            }
        });

        LabelDesignaciones.setBackground(new java.awt.Color(255, 255, 255));
        LabelDesignaciones.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelDesignaciones.setForeground(new java.awt.Color(255, 255, 255));
        LabelDesignaciones.setText("Designaciones");

        javax.swing.GroupLayout PanelDesignacionesLayout = new javax.swing.GroupLayout(PanelDesignaciones);
        PanelDesignaciones.setLayout(PanelDesignacionesLayout);
        PanelDesignacionesLayout.setHorizontalGroup(
            PanelDesignacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDesignacionesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelDesignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDesignacionesLayout.setVerticalGroup(
            PanelDesignacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDesignacionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelDesignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelDesignaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 597, 591, -1));

        PanelUsuario.setBackground(new java.awt.Color(255, 204, 204));
        PanelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelUsuarioMouseClicked(evt);
            }
        });

        LabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuario");
        LabelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 682, 591, -1));

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cerrar Sesion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorMenu.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 802, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContenedorPrincipalLayout = new javax.swing.GroupLayout(ContenedorPrincipal);
        ContenedorPrincipal.setLayout(ContenedorPrincipalLayout);
        ContenedorPrincipalLayout.setHorizontalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addComponent(ContenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenedorPrincipalLayout.setVerticalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(ContenedorMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(ContenedorPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDocentesMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelDocentes, LabelDocentes);
    }//GEN-LAST:event_PanelDocentesMouseClicked

    private void PanelCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCarreraMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelCarrera, LabelCarrera);
    }//GEN-LAST:event_PanelCarreraMouseClicked

    private void PanelMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMateriasMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelMaterias, LabelMaterias);
    }//GEN-LAST:event_PanelMateriasMouseClicked

    private void PanelHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHorariosMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelHorarios, LabelHorarios);
    }//GEN-LAST:event_PanelHorariosMouseClicked

    private void PanelDesignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDesignacionesMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelDesignaciones, LabelDesignaciones);
    }//GEN-LAST:event_PanelDesignacionesMouseClicked

    private void PanelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUsuarioMouseClicked
        // TODO add your handling code here:
        activarFilaMenu(PanelUsuario, LabelUsuario);
    }//GEN-LAST:event_PanelUsuarioMouseClicked


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorMenu;
    private javax.swing.JPanel ContenedorPrincipal;
    private javax.swing.JLabel LabelCarrera;
    private javax.swing.JLabel LabelDesignaciones;
    private javax.swing.JLabel LabelDocentes;
    private javax.swing.JLabel LabelHorarios;
    private javax.swing.JLabel LabelMaterias;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelCarrera;
    private javax.swing.JPanel PanelDesignaciones;
    private javax.swing.JPanel PanelDocentes;
    private javax.swing.JPanel PanelHorarios;
    private javax.swing.JPanel PanelMaterias;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JPanel TextoMenu;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
