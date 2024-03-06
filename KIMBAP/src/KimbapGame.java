import java.sql.*;

public class KimbapGame {
    
    private static final String URL = "jdbc:mysql://localhost:3306/kimbap_game";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            
            statement = connection.createStatement();

            
            resultSet = statement.executeQuery("SELECT * FROM ingredients");

            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ingredient_name"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
    }
}