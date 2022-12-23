package com.pizza;

import java.util.Set;

public class PizzaStore implements PizzaStoreInterface {
    private final RecipesInterface recipes;

    public PizzaStore(RecipeRepository data) {
        this.recipes = data.getRecipesObject();
    }

    public PizzaInterface orderPizza(String name) {
        ChefInterface chef = new Chef();
        name = name.toLowerCase();

        RecipeInterface recipe = recipes.getRecipe(name);
        return chef.prepare(recipe);
    }

    public Set<String> getMenu() {
        return recipes.getMenu();
    }

}


