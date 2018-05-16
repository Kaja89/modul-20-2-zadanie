package com.kodilla.designpatterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaDecoratorTestSuite {
    @Test
    public void testCapriciosaDecoratorGetDescription() {
        //Given
        BasicPizza basicPizza = new BasicPizzaOrder();
        basicPizza = new CapriciosaDecorator(basicPizza);

        //When
        String description = basicPizza.getPizzaDescription();

        //Then
        System.out.println(description);
        Assert.assertEquals("Dough, tomato sauce, cheese, ham, mushroom", description);
    }

    @Test
    public void testCapriciosaDecoratorGetPrice() {
        //Given
        BasicPizza basicPizza = new BasicPizzaOrder();
        basicPizza = new CapriciosaDecorator(basicPizza);

        //When
        BigDecimal price = basicPizza.getPizzaPrice();

        //Then
        System.out.println("Price: " + price);
        Assert.assertEquals(new BigDecimal(19), price);
    }

    @Test
    public void testHavanaWithAdditionsGetPrice() {
        //Given
        BasicPizza basicPizza = new BasicPizzaOrder();
        basicPizza = new HavanaDecorator(basicPizza);
        basicPizza = new ChickenDecorator(basicPizza);
        basicPizza = new CornDecorator(basicPizza);
        basicPizza = new AdditionalCheeseDecorator(basicPizza);

        //When
        BigDecimal price = basicPizza.getPizzaPrice();

        //Then
        System.out.println("Price: " + price);
        Assert.assertEquals(new BigDecimal(29), price);
    }

    @Test
    public void testHavanaWithAdditionsGetDescription() {
        //Given
        BasicPizza basicPizza = new BasicPizzaOrder();
        basicPizza = new HavanaDecorator(basicPizza);
        basicPizza = new ChickenDecorator(basicPizza);
        basicPizza = new CornDecorator(basicPizza);
        basicPizza = new AdditionalCheeseDecorator(basicPizza);

        //When
        String description = basicPizza.getPizzaDescription();

        //Then
        System.out.println(description);
        Assert.assertEquals("Dough, tomato sauce, cheese, ham, pineapple, with chicken, corn, with additional cheese", description);
    }

}
