package com.kodilla.designpatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderdecorator {
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder){
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(35));//hardcoded
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
