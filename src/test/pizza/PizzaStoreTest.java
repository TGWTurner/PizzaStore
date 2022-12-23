package test.pizza;

import com.pizza.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

public class PizzaStoreTest {
    @Test
    public void testStoreGetsRecipesAtCreation() {
        RecipeRepository mockedData = Mockito.mock(RecipeRepository.class);
        RecipesInterface mockedRecipes = Mockito.mock(Recipes.class);
        Set<String> menu = new HashSet<String>(List.of("menu"));

        when(mockedData.getRecipesObject()).thenReturn(mockedRecipes);
        when(mockedRecipes.getMenu()).thenReturn(menu);

        PizzaStoreInterface store = new PizzaStore(mockedData);

        Set<String> actual = store.getMenu();

        assertThat(actual).isEqualTo(menu);
    }

    @Test
    public void testOrderPizzaReturnsCorrectPizza() {
        RecipeRepository mockedData = Mockito.mock(RecipeRepository.class);
        RecipesInterface mockedRecipes = Mockito.mock(Recipes.class);
        RecipeInterface mockedRecipe = Mockito.mock(Recipe.class);
        String order = "order";
        List<String> toppings = List.of("pizza toppings");

        when(mockedData.getRecipesObject()).thenReturn(mockedRecipes);
        when(mockedRecipes.getRecipe(order)).thenReturn(mockedRecipe);
        when(mockedRecipe.getToppings()).thenReturn(toppings);

        PizzaStoreInterface store = new PizzaStore(mockedData);

        List<String> actual = store.orderPizza(order).getToppings();

        assertThat(actual).isEqualTo(toppings);
    }
}
