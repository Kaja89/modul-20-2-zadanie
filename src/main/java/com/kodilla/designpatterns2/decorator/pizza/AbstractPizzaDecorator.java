package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements BasicPizza {

    private final BasicPizza basicPizza;

    protected AbstractPizzaDecorator(BasicPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public String getPizzaDescription() {
        return basicPizza.getPizzaDescription();
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return basicPizza.getPizzaPrice();
    }
}
