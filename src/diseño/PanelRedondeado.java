
package diseño;




import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PanelRedondeado extends JPanel {
    private int radioEsquina = 15; // Ajusta este número si lo querés más o menos redondo

    public PanelRedondeado() {
        setOpaque(false); // Hace transparentes las esquinas de fondo sobrantes
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // Suavizado de bordes para que no se vea pixelado:
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radioEsquina, radioEsquina);
        super.paintComponent(g);
    }
}
