package com.springaicourse.designpatterns.structural.decorator;

/**
 * Base decorator class that implements the core decorator pattern functionality
 * - Implements the same interface (INotifier) as the components it will decorate
 * - Contains a reference to a wrapped INotifier object that it decorates
 * - Delegates core behavior to the wrapped component
 */
public abstract class BaseNotifierDecorator implements INotifier {

    // Reference to the wrapped component that is being decorated
    private final INotifier wrapped;
    // Additional functionality/state that decorators can use
    protected final DatabaseService databaseService;

    /**
     * Constructor takes the component to be decorated
     * This allows decorators to be chained/nested
     */
    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    /**
     * Default implementation delegates to wrapped component
     * Concrete decorators can override to add behavior before/after
     */
    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    /**
     * Delegates to wrapped component to maintain the object interface
     */
    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}