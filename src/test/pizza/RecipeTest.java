package test.pizza;

import com.pizza.Recipe;
import com.pizza.RecipeInterface;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RecipeTest {
    @Test
    public void testGetToppingsReturnsToppingsProvidedAtCreation() {
        List<String> toppings = List.of("pizza toppings");

        RecipeInterface recipe = new Recipe(toppings);

        assertThat(recipe.getToppings()).isEqualTo(toppings);
    }
}
