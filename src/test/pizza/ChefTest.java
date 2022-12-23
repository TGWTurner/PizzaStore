package test.pizza;

import com.pizza.Chef;
import com.pizza.Pizza;
import com.pizza.Recipe;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;

public class ChefTest {
    @Test
    public void testChefPreparesPizzaWhenProvidedRecipe() {
        Chef chef = new Chef();
        Recipe mockRecipe = Mockito.mock(Recipe.class);
        List<String> toppings = List.of("pizza topping");


        when(mockRecipe.getToppings()).thenReturn(toppings);

        Pizza actual = chef.prepare(mockRecipe);

        assertThat(actual.getToppings()).isEqualTo(toppings);
    }
}
