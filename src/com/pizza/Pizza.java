package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements PizzaInterface {
    List<String> toppings = new ArrayList<>();

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
