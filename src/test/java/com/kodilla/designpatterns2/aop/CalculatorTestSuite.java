package com.kodilla.designpatterns2.aop;

import com.kodilla.designpatterns2.aop.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd(){
        //Given
        //When
        double result = calculator.add(5, 50);
        //Then
        Assert.assertEquals(55, result, 0);
    }

    @Test
    public void testSubtract(){
        //Given
        //When
        double result = calculator.sub(30, 40);
        //Then
        Assert.assertEquals(-10, result, 0);
    }

    @Test
    public void testMultiply(){
        //Given
        //When
        double result = calculator.mul(2, 6);
        //Then
        Assert.assertEquals(12, result, 0);
    }

    @Test
    public void testDivide(){
        //Given
        //When
        double result = calculator.div(12, 3);
        //Then
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void factorial(){
        //Given
        //When
       BigDecimal result = calculator.factorial(new BigDecimal(5));
        //Then
        Assert.assertEquals(new BigDecimal(120), result);
    }
}
