package panel;

import clases.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 * Componente personalizado que extiende de JPanel para representar el menú de navegación lateral.
 * Incluye un encabezado institucional y una lista dinámica poblada con opciones y títulos de menú.
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Constructor del componente Menu.
     * Inicializa los componentes gráficos, configura transparencias en contenedores 
     * para permitir que se luzca el fondo degradado, y carga los ítems del menú.
     */
    public Menu() {
        initComponents();
        setOpaque(false);
        jScrollPane1.setOpaque(false); 
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setOpaque(false); 
        listMenu1.setOpaque(false);
        init();
    }
    
    /**
     * Inicializa y agrega los elementos del menú utilizando objetos de tipo Model_Menu.
     * Define opciones de navegación (Escritorio, Profesores, Carreras, etc.), 
     * separadores y títulos de sección.
     */
    private void init() {
        listMenu1.addItem(new Model_Menu("4", "Escritorio", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Profesores", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Carreras", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Materias", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        listMenu1.addItem(new Model_Menu("", "Otros", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "Horarios", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Designaciones", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("8", "Usuarios", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "Cerrar sesion", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMenu1 = new clases.ListMenu<>();

        Encabezado.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGEDOS-IES");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(listMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

/**
     * Sobrescribe el pintado de los componentes hijos para aplicar un fondo 
     * con un degradado lineal (GradientPaint) en tonos rosados/fucsias y esquinas redondeadas.
     * 
     * @param grphcs Objeto gráfico utilizado para renderizar.
     */
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Define el degradado vertical desde un tono claro (#FBD3E9) hasta un tono más oscuro (#BB377D)
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#FBD3E9"), 0, getHeight(), Color.decode("#BB377D"));
        g2.setPaint(g);
        
        // Dibuja el fondo del panel con bordes redondeados
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private clases.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}

