package diseño;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 * Componente personalizado que extiende de JButton para crear un botón con esquinas redondeadas
 * y efectos visuales de cambio de color al interactuar con el ratón.
 */
public class JButtonRedondeado extends JButton {

    // Definición de la paleta de colores (Tonos rosa/fucsia)
    private Color colorNormal = new Color(214, 90, 127);      // Color base del botón
    private Color colorHover = new Color(227, 110, 146);       // Color al pasar el mouse (efecto hover)
    private Color colorPresionado = new Color(181, 71, 105);   // Color al hacer clic
    private Color colorActual;

    /**
     * Constructor que inicializa el estilo del botón y los eventos de mouse.
     */
    public JButtonRedondeado() {
        colorActual = colorNormal;
        
        // Configuración estética inicial
        setText("INICIAR SESIÓN");
        setOpaque(false);
        setContentAreaFilled(false); // Evita el renderizado por defecto de Swing
        setFocusPainted(false);      // Elimina el marco de foco
        setBorderPainted(false);     // Elimina el borde por defecto
        setForeground(Color.WHITE);  // Color del texto
        setFont(new Font("SansSerif", Font.BOLD, 14));
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor a mano al pasar por encima

        // Listener para manejar los cambios de color según la interacción del usuario
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                colorActual = colorHover; // Cambia a color claro al entrar
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                colorActual = colorNormal; // Regresa al color base al salir
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                colorActual = colorPresionado; // Cambia a color oscuro al presionar
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Al soltar el clic, verifica si el mouse sigue dentro del área para definir el color
                colorActual = mouseContains(e.getPoint()) ? colorHover : colorNormal;
                repaint();
            }
        });
    }

    /**
     * Verifica si el punto del mouse está contenido dentro de los límites del botón.
     */
    private boolean mouseContains(Point p) {
        return getBounds().contains(p);
    }

    /**
     * Renderiza el componente gráficamente con esquinas redondeadas.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        // Activa el suavizado de bordes (Antialiasing) para que las esquinas se vean suaves
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja el fondo redondeado con el color actual
        g2.setColor(colorActual);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);

        g2.dispose();
        super.paintComponent(g); // Dibuja el texto del botón por encima
    }
}