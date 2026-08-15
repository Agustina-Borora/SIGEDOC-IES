package diseño;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class JButtonRedondeado extends JButton {

    // Tonos rosa/fucsia para el botón
    private Color colorNormal = new Color(214, 90, 127);       // Rosa principal
    private Color colorHover = new Color(227, 110, 146);       // Al pasar el mouse (más claro)
    private Color colorPresionado = new Color(181, 71, 105);   // Al hacer clic (más oscuro)
    private Color colorActual;

    public JButtonRedondeado() {
        colorActual = colorNormal;
        
        setText("INICIAR SESIÓN");
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFont(new Font("SansSerif", Font.BOLD, 14));
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                colorActual = colorHover;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                colorActual = colorNormal;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                colorActual = colorPresionado;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                colorActual = mouseContains(e.getPoint()) ? colorHover : colorNormal;
                repaint();
            }
        });
    }

    private boolean mouseContains(Point p) {
        return getBounds().contains(p);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo rosa redondeado
        g2.setColor(colorActual);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);

        g2.dispose();
        super.paintComponent(g);
    }
}