package com.pizza;

import java.util.*;

public class Recipes implements RecipesInterface {
    private Map<String, RecipeInterface> recipes;
    public Recipes(Map<String, RecipeInterface> recipes) {
        this.recipes = recipes;
    }
    public RecipeInterface getRecipe(String name) {
        return recipes.get(name);
    }

    public Set<String> getMenu() {
        return recipes.keySet();
    }
}
