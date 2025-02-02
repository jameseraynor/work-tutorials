package com.springaicourse.designpatterns.behavioral.observer;

import java.util.*;

/**
 * NotificationService implements the Observer pattern to manage event subscriptions and notifications.
 * It maintains a mapping of events to listeners and handles subscription/unsubscription of listeners
 * as well as notification distribution.
 */
public class NotificationService {

    /**
     * Map storing the relationship between events and their registered listeners.
     * Key: Event type
     * Value: List of listeners subscribed to that event
     */
    private final Map<Event, List<Listener>> customers;

    /**
     * Constructor initializes the customers map and creates empty listener lists
     * for each possible event type defined in the Event enum.
     */
    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    /**
     * Subscribes a listener to receive notifications for a specific event type.
     * @param eventType The type of event to subscribe to
     * @param listener The listener to be notified when the event occurs
     */
    public void subscribe(Event eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }

    /**
     * Unsubscribes a listener from receiving notifications for a specific event type.
     * @param eventType The type of event to unsubscribe from
     * @param listener The listener to be removed from the notification list
     */
    public void unsubscribe(Event eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }

    /**
     * Notifies all listeners registered for a specific event type.
     * Calls the update method on each listener subscribed to the given event.
     * @param eventType The type of event that occurred
     */
    public void notifyCustomers(Event eventType) {
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }

}