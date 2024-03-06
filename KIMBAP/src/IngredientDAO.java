import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IngredientDAO {
    private Connection connection;

    public IngredientDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Ingredient> getAllIngredients() throws SQLException {
        List<Ingredient> ingredients = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM ingredients");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int quantity = resultSet.getInt("quantity");
            Ingredient ingredient = new Ingredient(id, name, quantity);
            ingredients.add(ingredient);
        }

        resultSet.close();
        statement.close();

        return ingredients;
    }
}