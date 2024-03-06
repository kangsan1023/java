import java.sql.*;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/kimbap_game";
    private static final String USER = "KIMBAP";
    private static final String PASSWORD = "KIMBAP";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            IngredientDAO ingredientDAO = new IngredientDAO(connection);

            List<Ingredient> ingredients = ingredientDAO.getAllIngredients();

            for (Ingredient ingredient : ingredients) {
                System.out.println(ingredient.getName() + ": " + ingredient.getQuantity());
            }

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}