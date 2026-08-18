package diseño;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

/**
 * Componente personalizado que extiende de JPasswordField para crear un campo de contraseña
 * con esquinas redondeadas, un estilo estético en tonos pastel y soporte para texto placeholder (guía).
 */
public class JPasswordFieldRedondeado extends JPasswordField {

    // Paleta de colores para el diseño del campo de texto de contraseña
    private Color colorFondo = new Color(255, 240, 245);         // Rosa pastel muy claro para el fondo
    private Color colorBorde = new Color(214, 150, 170);         // Tono rosáceo para el borde exterior
    private Color colorTexto = new Color(90, 50, 65);            // Color oscuro para los asteriscos/texto
    private Color colorPlaceholder = new Color(160, 120, 135);   // Tono suave para el texto guía
    private String placeholder = "Ingresa tu contraseña";

    /**
     * Constructor que inicializa el estilo visual del campo de contraseña.
     */
    public JPasswordFieldRedondeado() {
        setUI(new BasicPasswordFieldUI());
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));  
        setForeground(colorTexto);
        setCaretColor(colorTexto);  
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setBorder(new EmptyBorder(12, 18, 12, 18)); // Márgenes internos (padding)
    }

    /**
     * Establece un texto de guía (placeholder) personalizado cuando el campo está vacío.
     * 
     * @param placeholder El texto guía a mostrar.
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }

    /**
     * Sobrescribe el método de pintado para renderizar el fondo redondeado, 
     * el borde personalizado y dibujar el placeholder si no hay texto ingresado.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        // Activa el suavizado de bordes (Antialiasing)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Dibuja el fondo claro redondeado
        g2.setColor(colorFondo);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        // 2. Dibuja el borde fino alrededor
        g2.setColor(colorBorde);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        g2.dispose();

        // 3. Pinta los asteriscos nativos del campo de contraseña
        super.paintComponent(g);

        // 4. Pinta el texto placeholder de manera condicional cuando está vacío
        if (getPassword().length == 0 && placeholder != null) {
            Graphics2D gPlaceholder = (Graphics2D) g.create();
            gPlaceholder.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            gPlaceholder.setColor(colorPlaceholder);
            gPlaceholder.setFont(getFont());
            
            FontMetrics fm = gPlaceholder.getFontMetrics();
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent(); // Centrado vertical
            
            gPlaceholder.drawString(placeholder, 18, y); // Margen izquierdo de 18 píxeles
            gPlaceholder.dispose();
        }
    }
}