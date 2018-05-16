package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class CapriciosaDecorator extends AbstractPizzaDecorator {
    public CapriciosaDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", ham, mushroom";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(4));
    }
}
