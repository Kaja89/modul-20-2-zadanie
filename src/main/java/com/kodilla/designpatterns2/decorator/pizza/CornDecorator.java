package com.kodilla.designpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class CornDecorator extends AbstractPizzaDecorator {
    public CornDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", corn";
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(3));
    }
}
