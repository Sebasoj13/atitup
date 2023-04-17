package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    private Connection connection;

    public ConexionDB(String databaseName) throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + databaseName);
            System.out.println("Conexion");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de SQLite: " + e.getMessage());
        }
        
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void realizarConsulta(String consulta) {

        try {
            PreparedStatement stmt = connection.prepareStatement(consulta);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar la categoría conceptual: " + e.getMessage());
        }
    }

    public ResultSet consultarDatos(String consulta) {
    	ResultSet resultado = null;
        try {
        	Statement statement = connection.createStatement();
            resultado = statement.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return resultado;
    }
    
}

