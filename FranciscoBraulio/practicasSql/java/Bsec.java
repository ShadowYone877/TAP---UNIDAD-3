import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Bsec {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Alpha";
        String user = "paco_user";
        String password = "123456";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a PostgreSQL!");

            statement = connection.createStatement();

            String query1 = "select * from secundaria.alumnos";
            resultSet = statement.executeQuery(query1);

            System.out.println("Alumnos:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Id docente: " + resultSet.getInt("id_docente"));
                System.out.println("Id materia: " + resultSet.getInt("id_materia"));
            }
 String query2 = "select * from secundaria.docentes";
            resultSet = statement.executeQuery(query2);

            System.out.println("Docentes:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nom_doc"));
                System.out.println("Id materia: " + resultSet.getInt("id_materia"));
                System.out.println("Id grupo: " + resultSet.getInt("id_grupo"));
            }
 String query3 = "select * from secundaria.grupos";
            resultSet = statement.executeQuery(query3);

            System.out.println("Grupos:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Grado: " + resultSet.getInt("grado"));
                System.out.println("Grupo: " + resultSet.getString("grupo"));
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
