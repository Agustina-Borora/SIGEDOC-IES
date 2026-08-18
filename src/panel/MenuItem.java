package panel;

import clases.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * Componente personalizado que extiende de JPanel para representar 
 * una opción individual dentro del menú lateral. 
 * Permite renderizar iconos, textos de opciones, títulos de sección y efectos visuales de selección o hover.
 */
public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    private boolean over;

    /**
     * Constructor que inicializa el elemento del menú basándose en los datos provistos.
     * Configura el diseño visual según el tipo de elemento (MENU, TITLE o EMPTY).
     * 
     * @param data Objeto de tipo Model_Menu que contiene la información del ítem.
     */
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        
        // Evalúa el tipo de elemento para configurar su apariencia
        if (data.getType() == Model_Menu.MenuType.MENU) {
            lbIcon.setIcon(data.toIcon());
            lbName.setText(data.getName());
        } else if (data.getType() == Model_Menu.MenuType.TITLE) {
            lbIcon.setText(data.getName());
            lbIcon.setFont(new Font("sansserif", 1, 12));
            lbName.setVisible(false); // Oculta la etiqueta secundaria si es un título
        } else {
            lbName.setText(" "); // Espacio vacío por defecto
        }
    }

    /**
     * Define si el elemento se encuentra seleccionado (clic/activo).
     * 
     * @param selected true si está seleccionado, false en caso contrario.
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    /**
     * Define si el cursor del mouse se encuentra posicionado sobre el elemento (efecto hover).
     * 
     * @param over true si el mouse está encima, false en caso contrario.
     */
    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        lbIcon.setForeground(new java.awt.Color(255, 255, 255));

        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

/**
     * Sobrescribe el método de pintado para dibujar un fondo translúcido y redondeado 
     * cuando el elemento está seleccionado o el usuario pasa el mouse por encima (hover).
     * 
     * @param grphcs Objeto gráfico utilizado para renderizar.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Asigna un color semitransparente dependiendo de si está seleccionado o en hover
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80)); // Mayor opacidad para selección activa
            } else {
                g2.setColor(new Color(255, 255, 255, 20)); // Menor opacidad para efecto hover
            }
            
            // Dibuja un rectángulo redondeado con márgenes laterales
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
