package com.springaicourse.designpatterns.behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Editor class implementing the Memento pattern to provide undo functionality
 * for text editing operations. It maintains a history of text states using
 * a double-ended queue (Deque) data structure.
 */
public class Editor {

    // TextArea instance to handle the actual text content
    private final TextArea textArea;

    // Queue to store the history of text states as Memento objects
    private final Deque<TextArea.Memento> stateHistory;

    /**
     * Constructor initializes a new TextArea and an empty state history queue
     */
    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    /**
     * Writes new text to the TextArea and saves the state in history
     * @param text The text to be written
     */
    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    /**
     * Restores the previous state by removing the most recent state
     * from history and applying the last remaining state.
     * Does nothing if history is empty.
     */
    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.pollLast(); // Remove the current state
        textArea.restore(stateHistory.peekLast()); // Restore the previous state
    }

    /**
     * Prints the current text content to standard output
     */
    public void printText() {
        System.out.println(textArea.getText());
    }
}