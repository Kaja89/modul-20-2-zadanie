package com.kodilla.designpatterns2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
