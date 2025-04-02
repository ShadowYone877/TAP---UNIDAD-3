import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Dv {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/vehiculosdb";
        String user = "paco_user";
        String password = "123456";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a PostgreSQL!");

            statement = connection.createStatement();

            String query1 = "select * from flota.marca";
            resultSet = statement.executeQuery(query1);

            System.out.println("Marca:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Pais de origen: " + resultSet.getString("pais_origen"));
                System.out.println("Año_fundacion: " + resultSet.getInt("año_fundacion"));
            }
 String query2 = "select * from flota.modelo";
            resultSet = statement.executeQuery(query2);

            System.out.println("Modelos:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Año: " + resultSet.getInt("año"));
                System.out.println("Marca: " + resultSet.getString("marca_id"));
            }
 String query3 = "select * from flota.vehiculo";
            resultSet = statement.executeQuery(query3);

            System.out.println("Vehiculos:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Placa: " + resultSet.getString("placa"));
                System.out.println("Color: " + resultSet.getString("color"));
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
