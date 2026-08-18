package diseño;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTextFieldUI;

/**
 * Componente personalizado que extiende de JTextField para crear un campo de texto de entrada
 * con esquinas redondeadas, paleta de colores en tonos pastel y soporte para texto placeholder (guía).
 */
public class JTextFieldRedondeado extends JTextField {

    // Tonos acordes al estilo visual de la interfaz (tonos rosáceos)
    private Color colorFondo = new Color(255, 240, 245);         // Rosa pastel muy claro / blanco rosáceo
    private Color colorBorde = new Color(214, 150, 170);         // Borde rosáceo elegante
    private Color colorTexto = new Color(90, 50, 65);            // Texto oscuro para asegurar una buena lectura
    private Color colorPlaceholder = new Color(160, 120, 135);   // Guía visual suave pero visible
    private String placeholder = "Ingrese su email";

    /**
     * Constructor que inicializa las propiedades visuales y el comportamiento del campo de texto.
     */
    public JTextFieldRedondeado() {
        setUI(new BasicTextFieldUI());
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0)); 
        setForeground(colorTexto);
        setCaretColor(colorTexto);  
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setBorder(new EmptyBorder(12, 18, 12, 18)); // Márgenes internos (padding)
    }

    /**
     * Establece o actualiza el texto de guía (placeholder) cuando el campo se encuentra vacío.
     * 
     * @param placeholder Texto guía a mostrar.
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }

    /**
     * Sobrescribe el método de pintado para renderizar el fondo redondeado, 
     * el borde personalizado y dibujar el placeholder de forma condicional.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        // Activa el suavizado de bordes (Antialiasing) para una mejor calidad visual
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Dibuja el fondo claro redondeado
        g2.setColor(colorFondo);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        // 2. Dibuja el borde fino alrededor
        g2.setColor(colorBorde);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        g2.dispose();

        // 3. Pinta el texto que escribe el usuario (contenido real del JTextField)
        super.paintComponent(g);

        // 4. Pinta el placeholder si el campo está vacío y se ha definido uno
        if (getText().isEmpty() && placeholder != null) {
            Graphics2D gPlaceholder = (Graphics2D) g.create();
            gPlaceholder.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            gPlaceholder.setColor(colorPlaceholder);
            gPlaceholder.setFont(getFont());
            
            FontMetrics fm = gPlaceholder.getFontMetrics();
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent(); // Cálculo para centrado vertical
            
            gPlaceholder.drawString(placeholder, 18, y); // Margen izquierdo de 18 píxeles
            gPlaceholder.dispose();
        }
    }
}