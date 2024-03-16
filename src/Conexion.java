import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/inegi2020";
    // Usuario y contraseña de la base de datos
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "123456";

    // Método para obtener la conexión a la base de datos
    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    // Método para cerrar la conexión a la base de datos
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
