package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements BasicPizza{
    @Override
    public String getPizzaDescription() {
        return "Dough, tomato sauce, cheese";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return new BigDecimal(15);
    }
}
