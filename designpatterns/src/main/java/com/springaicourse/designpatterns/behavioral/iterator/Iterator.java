package com.springaicourse.designpatterns.behavioral.iterator;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();

}