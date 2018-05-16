package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenDecorator extends AbstractPizzaDecorator {
    public ChickenDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", with chicken";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(5));
    }
}
