package test.pizza;

import com.pizza.RecipeRepository;
import com.pizza.Recipes;
import com.pizza.RecipesInterface;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RecipeRepositoryTest {
    @Test
    public void testReturnsInstanceOfRecipes() {
        RecipeRepository data = new RecipeRepository();

        RecipesInterface recipes = data.getRecipesObject();

        assertThat(recipes).isInstanceOf(Recipes.class);
    }
}
