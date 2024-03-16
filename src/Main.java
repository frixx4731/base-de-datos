import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Obtener conexión a la base de datos
        Connection conexion = Conexion.obtenerConexion();
        if (conexion != null) {
            System.out.println("Conexión exitosa a la base de datos");

            // Ejemplo de consulta a la base de datos
            try {
                String consulta = "SELECT * FROM entidades";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                ResultSet resultado = statement.executeQuery();

                // Mostrar resultados de la consulta
                while (resultado.next()) {
                    int id = resultado.getInt("identidad");
                    String nombre = resultado.getString("nom_entidad");
                    System.out.println("ID: " + id + ", Nombre: " + nombre);
                }

                // Cerrar recursos
                resultado.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Cerrar conexión
            Conexion.cerrarConexion(conexion);
        } else {
            System.out.println("Error al conectar a la base de datos");
        }
    }
}