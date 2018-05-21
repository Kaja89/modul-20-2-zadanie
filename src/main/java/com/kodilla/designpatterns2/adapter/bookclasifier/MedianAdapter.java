package com.kodilla.designpatterns2.adapter.bookclasifier;


import com.kodilla.designpatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.designpatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.Book> newBooks = new HashMap<>();
        for (Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.Book newBook = new com.kodilla.designpatterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            newBooks.put(bookSignature, newBook);
        }
        return medianPublicationYear(newBooks);
    }
}
