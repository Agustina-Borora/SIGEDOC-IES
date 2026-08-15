package diseño;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class JPasswordFieldRedondeado extends JPasswordField {

   
    
    private Color colorFondo = new Color(255, 240, 245);          // Rosa pastel muy claro
    private Color colorBorde = new Color(214, 150, 170);          // Borde rosáceo
    private Color colorTexto = new Color(90, 50, 65);             // Texto oscuro
    private Color colorPlaceholder = new Color(160, 120, 135);    // Guía suave
    private String placeholder = "Ingresa tu contraseña";

    public JPasswordFieldRedondeado() {
        setUI(new BasicPasswordFieldUI());
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

        // 3. Pinta los asteriscos
        super.paintComponent(g);

        // 4. Pinta el placeholder cuando está vacío
        if (getPassword().length == 0 && placeholder != null) {
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