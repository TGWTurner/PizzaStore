package com.pizza;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        RecipeRepository data = new RecipeRepository();
        PizzaStore store = new PizzaStore(data);
        Customer customer = new Customer();

        List<String> order = Arrays.asList(
            "pepperoni",
            "plain",
            "hawaiian"
        );

        customer.order(store, order);

    }
}
