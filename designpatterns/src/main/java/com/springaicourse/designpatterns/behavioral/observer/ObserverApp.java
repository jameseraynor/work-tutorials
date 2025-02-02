package com.springaicourse.designpatterns.behavioral.observer;

import static com.springaicourse.designpatterns.behavioral.observer.Event.NEW_ITEM;
import static com.springaicourse.designpatterns.behavioral.observer.Event.SALE;

/**
 * Main application class demonstrating the Observer pattern implementation allows you to change or
 * take action a set of object when and if the state of one of them changes this can be done even if
 * the modifiable set of objects is not known in advance the observer pattern is also called pub-sub
 * pattern it is used to notify the change in the state of one object to other objects the subject
 * maintains a list of observers and notifies them when there is a change in the state of the
 * subject
 *
 * <p>subscribers can be introduced without having to change the publishers code, and vice versa if
 * there's a publisher interface
 *
 */
public class ObserverApp {
  public static void main(String[] args) {

    // Create a new store instance
    Store store = new Store();

    // Subscribe various listeners to different events
    // Subscribe email listener for NEW_ITEM events
    store.getService().subscribe(NEW_ITEM, new EmailMsgListener("geekific@like.com"));
    // Subscribe same email for SALE events
    store.getService().subscribe(SALE, new EmailMsgListener("geekific@like.com"));
    // Subscribe another email for SALE events
    store.getService().subscribe(SALE, new EmailMsgListener("geekific@subs.com"));
    // Subscribe mobile app listener for NEW_ITEM events
    store.getService().subscribe(NEW_ITEM, new MobileAppListener("GeekificLnS"));

    // Trigger notification for new item promotion
    store.newItemPromotion();

    // Separator for console output
    System.out.println("==========================================");

    // Trigger notification for sale promotion
    store.salePromotion();

    // Separator for console output
    System.out.println("==========================================");

    // Unsubscribe one email listener from SALE events
    store.getService().unsubscribe(SALE, new EmailMsgListener("geekific@like.com"));
    // Trigger another sale promotion after unsubscribe
    store.salePromotion();
  }
}
