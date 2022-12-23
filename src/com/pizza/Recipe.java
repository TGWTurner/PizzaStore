package com.pizza;

import java.util.List;

public class Recipe implements RecipeInterface {
    private final List<String> toppings;

    public Recipe(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
