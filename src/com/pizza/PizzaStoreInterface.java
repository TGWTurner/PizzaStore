package com.pizza;

import java.util.List;
import java.util.Set;

public interface PizzaStoreInterface {
    PizzaInterface orderPizza(String name);
    Set<String> getMenu();

}
