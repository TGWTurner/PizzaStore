package test.pizza;

import com.pizza.Recipe;
import com.pizza.RecipeInterface;
import com.pizza.Recipes;
import com.pizza.RecipesInterface;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class RecipesTest {
    @Test
    public void testGetRecipeReturnsRecipeFromStore() {
        Map<String, RecipeInterface> recipesMap = new HashMap<>();
        RecipeInterface mockedRecipe = Mockito.mock(Recipe.class);
        String order = "order";
        recipesMap.put(order, mockedRecipe);

        RecipesInterface recipes = new Recipes(recipesMap);

        var actual = recipes.getRecipe(order);

        assertEquals(mockedRecipe, actual);
    }

    @Test
    public void testGetMenuReturnsListOfRecipeNames() {
        Map<String, RecipeInterface> recipesMap = new HashMap<>();
        RecipeInterface mockedRecipe = Mockito.mock(Recipe.class);
        String order = "order";

        recipesMap.put(order, mockedRecipe);

        RecipesInterface recipes = new Recipes(recipesMap);
        Set<String> expected = new HashSet<>(List.of(order));

        var actual = recipes.getMenu();

        assertEquals(expected, actual);
    }
}
