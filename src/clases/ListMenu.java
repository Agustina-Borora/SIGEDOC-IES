package clases;

import panel.MenuItem;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 * Componente personalizado que extiende de JList para gestionar y renderizar 
 * elementos de un menú lateral o de navegación utilizando componentes gráficos (MenuItem).
 * 
 * @param <E> El tipo de elemento que manejará la lista.
 */
public class ListMenu<E extends Object> extends JList<E> {

    // Modelo interno para almacenar y administrar los elementos del menú
    private final DefaultListModel model;

    /**
     * Constructor de la clase ListMenu.
     * Inicializa el modelo de datos por defecto y lo asigna a la lista.
     */
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
    }

    /**
     * Sobrescribe el renderizador de celdas (CellRenderer) de la lista.
     * Permite personalizar la apariencia de cada elemento utilizando un componente gráfico 
     * personalizado (MenuItem) en lugar de un simple texto.
     * 
     * @return Un ListCellRenderer configurado para mostrar objetos de tipo Model_Menu como MenuItem.
     */
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Menu data;
                
                // Valida si el objeto actual es una instancia de Model_Menu
                if (o instanceof Model_Menu) {
                    data = (Model_Menu) o;
                } else {
                    // Si no es un Model_Menu, crea uno por defecto con tipo EMPTY
                    data = new Model_Menu("", o + "", Model_Menu.MenuType.EMPTY);
                }
                
                // Crea y retorna el componente gráfico personalizado para representar el ítem
                MenuItem item = new MenuItem(data);
                return item;
            }
        };
    }

    /**
     * Agrega un nuevo elemento de menú a la lista.
     * 
     * @param data Objeto de tipo Model_Menu que contiene la información del ítem (icono, texto, tipo).
     */
    public void addItem(Model_Menu data) {
        model.addElement(data);
    }
}