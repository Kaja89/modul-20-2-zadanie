package com.kodilla.designpatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Homework deques = new Homework("Deques");
        Homework arrayList = new Homework("Array List");
        Mentor adam = new Mentor("Adam", "Nowak");
        Mentor sonia = new Mentor("Sonia", "Kowalska");

        deques.registerObserver(adam);
        deques.registerObserver(sonia);
        arrayList.registerObserver(sonia);

        //When
        deques.addHomework("ArrayDeque");
        deques.addHomework("Test offer method");
        arrayList.addHomework("Write own ArrayList");

        //Then
        Assert.assertEquals(2, adam.getUpdates());
        Assert.assertEquals(3, sonia.getUpdates());
    }

}
