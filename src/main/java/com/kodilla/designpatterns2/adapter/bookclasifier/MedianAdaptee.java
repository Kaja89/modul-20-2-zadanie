package com.kodilla.designpatterns2.adapter.bookclasifier;

import com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.Statistics;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        //tutaj powinien otoczyc metody z libB
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
