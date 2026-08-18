package panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * Componente personalizado que extiende de JPanel para crear contenedores 
 * con bordes y esquinas redondeadas, ideal para estructurar tarjetas o secciones en la interfaz.
 */
public class PanelBorder extends javax.swing.JPanel {

    /**
     * Constructor del componente PanelBorder.
     * Inicializa los componentes visuales y establece el panel como transparente 
     * para que el pintado personalizado de las esquinas redondeadas luzca correctamente.
     */
    public PanelBorder() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

/**
     * Sobrescribe el método de pintado para renderizar un fondo con esquinas redondeadas 
     * utilizando las propiedades de color y suavizado de bordes (Antialiasing).
     * 
     * @param grphcs Objeto gráfico utilizado para renderizar.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        // Activa el antialiasing para que las esquinas redondeadas se vean suaves y sin dientes de sierra
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Asigna el color de fondo actual del panel
        g2.setColor(getBackground());
        
        // Dibuja un rectángulo con esquinas redondeadas con un radio de 15x15 píxeles
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
