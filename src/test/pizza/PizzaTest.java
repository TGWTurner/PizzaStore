package test.pizza;

import com.pizza.Pizza;
import com.pizza.PizzaInterface;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testCanSetAndGetPizzaToppings() {
        PizzaInterface pizza = new Pizza();
        List<String> toppings = Arrays.asList("pizza toppings");

        pizza.setToppings(toppings);

        List<String> actual = pizza.getToppings();

        assertThat(actual).isEqualTo(toppings);
    }
}
