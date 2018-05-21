package com.kodilla.designpatterns2.adapter.bookclassifier;

import com.kodilla.designpatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.designpatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<Book> bookSetInOldSystem = new HashSet<>();
        Book book1 = new Book("Adam Mickiewicz", "Pan Tadeusz", 1987, "3726746");
        Book book2 = new Book("Henryk Sienkiewicz", "Ogniem i mieczem", 1962, "1234567");
        Book book3 = new Book("Bolesław Prus", "Lalka", 1980, "3434");
        Book book4 = new Book("Bolesław Prus", "Lalka", 1950, "987654");
        Book book5 = new Book("Bolesław Prus", "Lalka", 2010, "987654");

        bookSetInOldSystem.add(book1);
        bookSetInOldSystem.add(book2);
        bookSetInOldSystem.add(book3);
        bookSetInOldSystem.add(book4);
        bookSetInOldSystem.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(bookSetInOldSystem);

        //Then
        Assert.assertEquals(1980, result);
    }
}
