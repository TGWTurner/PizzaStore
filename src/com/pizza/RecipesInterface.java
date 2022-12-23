package com.pizza;

import java.util.Set;

public interface RecipesInterface {
    RecipeInterface getRecipe(String name);
    Set<String> getMenu();
}
