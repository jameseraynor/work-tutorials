package com.springaicourse.designpatterns.behavioral.iterator;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a vertex in a graph data structure.
 * Each vertex contains data of generic type T and maintains a list of adjacent vertices.
 */
@Data
public class Vertex<T> {

    /**
     * The data stored in this vertex.
     * Marked as final since it should not change after initialization.
     *
     * T is  the generic type parameter representing the data type of the vertex.
     * This allows the Vertex class to work with different data types.
     */
    private final T data;

    /**
     * Flag indicating whether this vertex has been visited during graph traversal.
     * Used in algorithms like DFS and BFS.
     */
    private boolean visited;

    /**
     * List of adjacent vertices that this vertex is connected to.
     * Excluded from toString() to prevent infinite recursion when printing.
     * Implemented as a LinkedList for efficient insertions and deletions.
     */
    @ToString.Exclude
    private List<Vertex<T>> neighbors = new LinkedList<>();


}