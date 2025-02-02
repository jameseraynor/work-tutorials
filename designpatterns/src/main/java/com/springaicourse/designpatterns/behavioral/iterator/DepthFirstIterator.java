package com.springaicourse.designpatterns.behavioral.iterator;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Implementation of a Depth-First Search iterator for traversing graph vertices.
 * Uses a stack data structure to keep track of vertices to visit.
 * @param <T> The type of data stored in the vertices
 */
public class DepthFirstIterator<T> implements Iterator<T> {

    // The starting vertex for the traversal
    private final Vertex<T> startVertex;

    // Stack to keep track of vertices to visit in DFS order
    private final Deque<Vertex<T>> stack = new LinkedList<>();

    /**
     * Constructor that initializes the iterator with a starting vertex
     * @param startVertex The vertex to begin the traversal from
     */
    public DepthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        stack.push(startVertex);
    }

    /**
     * Checks if there are more vertices to visit
     * @return true if there are unvisited vertices in the stack, false otherwise
     */
    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * Gets the next unvisited vertex in the DFS traversal
     * @return The next unvisited vertex, or null if no more vertices to visit
     */
    @Override
    public Vertex<T> getNext() {
        // Return null if stack is empty
        if (!hasNext()) {
            return null;
        }

        // Get the next vertex from top of stack
        Vertex<T> current = stack.pop();

        // If vertex hasn't been visited yet
        if (!current.isVisited()) {
            current.setVisited(true);
            // Add all unvisited neighbors to stack
            current.getNeighbors().forEach(stack::push);
            return current;
        }

        // If vertex was already visited, recursively get next vertex
        return getNext();
    }

    /**
     * Resets the iterator to start traversal from beginning
     * Clears the stack and adds back the start vertex
     */
    @Override
    public void reset() {
        stack.clear();
        stack.push(startVertex);
    }

}