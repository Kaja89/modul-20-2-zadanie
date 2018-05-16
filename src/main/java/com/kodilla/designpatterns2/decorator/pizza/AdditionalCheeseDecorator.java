package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaDecorator {
    public AdditionalCheeseDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", with additional cheese";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(2));
    }
}
