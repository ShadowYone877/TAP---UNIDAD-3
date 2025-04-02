import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Itiz {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/ITIZ";
        String user = "paco_user";
        String password = "123456";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a PostgreSQL!");

            statement = connection.createStatement();

            String query1 = "select * from gestion_escolar.estudiantes";
            resultSet = statement.executeQuery(query1);

            System.out.println("Estudiantes:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Carrera: " + resultSet.getString("carrera"));
            }
 String query2 = "select * from  gestion_escolar.materias";
            resultSet = statement.executeQuery(query2);

            System.out.println("Materias:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Creditos: " + resultSet.getInt("creditos"));
            }
 String query3 = "select * from gestion_escolar.profesores";
            resultSet = statement.executeQuery(query3);

            System.out.println("Profesores:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Apellido: " + resultSet.getString("apellido"));
                System.out.println("Especialidad: " + resultSet.getString("especialidad"));
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
