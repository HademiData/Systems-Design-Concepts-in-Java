import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {

    // A structured way to store, retrieve, and manage data. Examples include 
    // SQL databases (MySQL, PostgreSQL) and NoSQL databases (MongoDB, Cassandra).

    // Using JDBC to interact with an SQL database.


    class DatabaseExample {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Users (id INT, name VARCHAR(50))");
                System.out.println("Database connected and table created!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
}
