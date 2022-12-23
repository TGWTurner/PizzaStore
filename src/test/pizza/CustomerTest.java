package test.pizza;

import com.pizza.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

public class CustomerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testCustomerGetsCorrectOrder() {
        Customer customer = new Customer();
        List<String> order = List.of("order");
        List<String> toppings = List.of("pizza topping");
        Set<String> menu = new HashSet<String>(order);

        PizzaStoreInterface mockedStore = Mockito.mock(PizzaStore.class);
        PizzaInterface mockedPizza = Mockito.mock(Pizza.class);

        //TODO: Move to state setting method
        when(mockedStore.orderPizza("order")).thenReturn(mockedPizza);
        when(mockedStore.getMenu()).thenReturn(menu);
        when(mockedPizza.getToppings()).thenReturn(toppings);

        customer.order(mockedStore, order);

        String actual = getOutput();
        String expected = toppings.toString();

        assertThat(actual).isEqualTo(expected);
    }

    private String getOutput() {
        return outputStreamCaptor.toString().trim();
    }
}
