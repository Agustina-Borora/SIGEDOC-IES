package clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Clase modelo que representa la estructura de datos de un elemento del menú.
 * Almacena información sobre el icono, el nombre y el tipo de elemento (título, opción de menú o espacio vacío).
 */
public class Model_Menu {

    // Atributos privados que definen las propiedades del ítem de menú
    private String icon;
    private String name;
    private MenuType type;

    /**
     * Constructor con parámetros para inicializar todos los campos del modelo.
     * 
     * @param icon Nombre del archivo de imagen asociado al ítem.
     * @param name Texto o etiqueta que se mostrará en el menú.
     * @param type Tipo de elemento según la enumeración MenuType.
     */
    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    /**
     * Constructor por defecto sin parámetros.
     */
    public Model_Menu() {
    }

    /**
     * Obtiene el nombre o identificador del icono.
     * 
     * @return El nombre del icono.
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Establece el nombre del icono.
     * 
     * @param icon Nuevo nombre del icono.
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Obtiene el nombre o texto del elemento de menú.
     * 
     * @return El texto del menú.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el texto del elemento de menú.
     * 
     * @param name Nuevo texto para el menú.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el tipo de elemento del menú.
     * 
     * @return El tipo de menú (TITLE, MENU o EMPTY).
     */
    public MenuType getType() {
        return type;
    }

    /**
     * Establece el tipo de elemento del menú.
     * 
     * @param type Nuevo tipo de menú.
     */
    public void setType(MenuType type) {
        this.type = type;
    }

    /**
     * Convierte la cadena del icono en un objeto Icon de Swing buscando la imagen 
     * en el paquete de recursos del proyecto (/imagen/).
     * 
     * @return Un objeto ImageIcon si se encuentra la imagen, o null en caso contrario.
     */
    public Icon toIcon() {
        if (icon == null || icon.trim().isEmpty()) {
            return null;
        }
        java.net.URL imgURL = getClass().getResource("/imagen/" + icon + ".png");
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Icono no encontrado: imagen/" + icon + ".png");
            return null;
        }
    }

    /**
     * Enumeración que define los diferentes tipos de elementos que pueden existir en el menú.
     */
    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}