package com.pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeRepository {
    public RecipesInterface getRecipesObject() {
        return new Recipes(getPizzaRecipes());
    }

    private Map<String, RecipeInterface> getPizzaRecipes() {
        //would get from a db
        Map<String, RecipeInterface> recipes = new HashMap<String, RecipeInterface>();

        recipes.put("pepperoni", pepperoniRecipe());
        recipes.put("plain", plainRecipe());
        recipes.put("hawaiian", hawaiianRecipe());

        return recipes;
    }

    private RecipeInterface pepperoniRecipe() {
        List<String> toppings = new ArrayList<String>();

        toppings.add("Tomato");
        toppings.add("Cheese");
        toppings.add("Pepperoni");

        return new Recipe(toppings);
    }

    private RecipeInterface plainRecipe() {
        List<String> toppings = new ArrayList<String>();

        toppings.add("Tomato");
        toppings.add("Cheese");

        return new Recipe(toppings);
    }

    private RecipeInterface hawaiianRecipe() {
        List<String> toppings = new ArrayList<String>();

        toppings.add("Tomato");
        toppings.add("Cheese");
        toppings.add("Pepperoni");
        toppings.add("Pineapple");

        return new Recipe(toppings);
    }

}
