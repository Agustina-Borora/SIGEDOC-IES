package Principal; 

//Connection para poder gestionar la conexión a la base de datos
import java.sql.Connection; 
//DriverManager, que se encarga de conectar la app con el driver de la BD
import java.sql.DriverManager; 
//SQLException para manejar los errores específicos de bases de datos
import java.sql.SQLException; 

public class Conexion { 
    
    // Ruta de conexión (URL): indica que usa MySQL, en el servidor local (localhost), puerto 3306 y la base de datos "laboratorio"
    private static final String URL = "jdbc:mysql://localhost:3306/ies7_docentes"; 
    // Define el usuario administrador por defecto de MySQL (root)
    private static final String USER = "root"; 
    // Define la contraseña del usuario (en este caso está vacía)
    private static final String PASSWORD = ""; 

    public static Connection conectar() { 
        
        // Bloque try: intenta ejecutar el código que puede lanzar un error (excepción)
        try { 
            // Usa el DriverManager para establecer y devolver la conexión usando la URL, usuario y contraseña
            return DriverManager.getConnection(URL, USER, PASSWORD); 
        // Bloque catch: si ocurre un error de tipo SQLException en el try, lo captura aquí
        } catch (SQLException e) { 
            // Imprime en la consola un mensaje de error junto con el detalle específico del problema (e.getMessage())
            System.out.println("Error de conexión: " + e.getMessage()); 
            // Devuelve null en caso de que la conexión haya fallado
            return null; 
        }
    } 
    
} 
