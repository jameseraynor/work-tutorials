package com.springaicourse.designpatterns.behavioral.memento;

/**
 * TextArea class implements the Memento pattern to provide undo functionality
 * for text content. It allows taking snapshots of its state and restoring
 * from previous snapshots.
 */
public class TextArea {
    // Stores the current text content
    private String text;

    /**
     * Sets the text content of the text area
     * @param text The text to set
     */
    public void set(String text) {
        this.text = text;
    }

    /**
     * Gets the current text content
     * @return The current text
     */
    public String getText() {
        return text;
    }

    /**
     * Creates a new Memento object containing the current text state
     * @return A new Memento instance with the current text
     */
    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    /**
     * Restores the text state from a Memento
     * @param memento The Memento to restore from. If null, text will be set to null
     */
    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    /**
     * Inner class that stores the state of the TextArea at a point in time
     * Implementation of the Memento pattern
     */
    public static class Memento {
        // Immutable field to store the saved text state
        private final String text;

        /**
         * Private constructor ensures Mementos can only be created by TextArea
         * @param textToSave The text state to save
         */
        private Memento(String textToSave) {
            text = textToSave;
        }

        /**
         * Private method to access saved text, only accessible by TextArea
         * @return The saved text state
         */
        private String getSavedText() {
            return text;
        }
    }
}