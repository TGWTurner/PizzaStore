package com.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Customer {
    List<PizzaInterface> pizzas = new ArrayList<PizzaInterface>();

    public void order(PizzaStoreInterface store, List<String> order)
    {
        for (String name : order) {
            tryToOrderPizzaByName(store, name);
        }

        inspectPizzaToppings();
    }

    private boolean tryToOrderPizzaByName(PizzaStoreInterface store, String name) {
        Set<String> menu = store.getMenu();
        if (menu.contains(name)) {
            pizzas.add(store.orderPizza(name));
            return true;
        }
        return false;
    }

    private void inspectPizzaToppings()
    {
        for (PizzaInterface pizza : pizzas) {
            System.out.println(pizza.getToppings());
        }
    }

}
