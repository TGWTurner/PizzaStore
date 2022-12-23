package com.pizza;

public class Chef implements ChefInterface {
    public Pizza prepare(RecipeInterface recipe){
        //here's where we build the pizza according to the recipe
        Pizza pizza = new Pizza();
        pizza.setToppings(recipe.getToppings());
        return pizza;
    }
}
