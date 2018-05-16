package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HavanaDecorator extends AbstractPizzaDecorator {
    public HavanaDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", ham, pineapple";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(4));
    }
}
