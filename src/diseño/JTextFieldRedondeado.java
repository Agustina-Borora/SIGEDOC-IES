package diseño;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTextFieldUI;

public class JTextFieldRedondeado extends JTextField {

    // Tonos acorde al fondo claro de la tarjeta
    private Color colorFondo = new Color(255, 240, 245);          // Rosa pastel muy claro / blanco rosáceo
    private Color colorBorde = new Color(214, 150, 170);          // Borde rosáceo elegante
    private Color colorTexto = new Color(90, 50, 65);             // Texto oscuro para buena lectura
    private Color colorPlaceholder = new Color(160, 120, 135);    // Guía suave pero visible
    private String placeholder = "Ingrese su email";

    public JTextFieldRedondeado() {
        setUI(new BasicTextFieldUI());
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0)); 
        setForeground(colorTexto);
        setCaretColor(colorTexto); 
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setBorder(new EmptyBorder(12, 18, 12, 18));
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Dibuja el fondo claro redondeado
        g2.setColor(colorFondo);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        // 2. Dibuja el borde fino
        g2.setColor(colorBorde);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        g2.dispose();

        // 3. Pinta el texto que escribe el usuario
        super.paintComponent(g);

        // 4. Pinta el placeholder cuando está vacío
        if (getText().isEmpty() && placeholder != null) {
            Graphics2D gPlaceholder = (Graphics2D) g.create();
            gPlaceholder.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            gPlaceholder.setColor(colorPlaceholder);
            gPlaceholder.setFont(getFont());
            
            FontMetrics fm = gPlaceholder.getFontMetrics();
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            
            gPlaceholder.drawString(placeholder, 18, y);
            gPlaceholder.dispose();
        }
    }
}