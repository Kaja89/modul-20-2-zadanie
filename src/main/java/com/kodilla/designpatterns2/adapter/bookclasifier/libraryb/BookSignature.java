package com.kodilla.designpatterns2.adapter.bookclasifier.libraryb;

public class BookSignature {
    private final String signature;

    public BookSignature(final String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }
}