package com.springaicourse.designpatterns.behavioral.iterator;

import java.util.List;

/**
 * Main application class demonstrating the Iterator pattern with a graph traversal This traverses
 * the elements without exposing the internal structure of the graph it encapsulates the details of
 * complex data structures by exposing simple methods to access the collection elements
 * applies the single responsibility and open-closed principles
 * each iteration algorithm is encapsulated in a separate class
 * allows for easy addition of new algorithms without modifying the existing code
 */
public class IteratorApp {
  public static void main(String[] args) {

    // Create vertices with integer values 0-6
    Vertex<Integer> v0 = new Vertex<>(0);
    Vertex<Integer> v1 = new Vertex<>(1);
    Vertex<Integer> v2 = new Vertex<>(2);
    Vertex<Integer> v3 = new Vertex<>(3);
    Vertex<Integer> v4 = new Vertex<>(4);
    Vertex<Integer> v5 = new Vertex<>(5);
    Vertex<Integer> v6 = new Vertex<>(6);

    // Set up the graph connections between vertices
    // v0 connects to v1, v5, v6
    v0.setNeighbors(List.of(v1, v5, v6));
    // v1 connects to v3, v4, v5
    v1.setNeighbors(List.of(v3, v4, v5));
    // v4 connects to v2, v6
    v4.setNeighbors(List.of(v2, v6));
    // v6 connects back to v0, creating a cycle
    v6.setNeighbors(List.of(v0));

    // Create a depth-first iterator starting from vertex v0
    DepthFirstIterator<Integer> dfs = new DepthFirstIterator<>(v0);
    // Traverse the graph using the iterator and print each vertex
    while (dfs.hasNext()) {
      System.out.println(dfs.getNext());
    }
  }
}
