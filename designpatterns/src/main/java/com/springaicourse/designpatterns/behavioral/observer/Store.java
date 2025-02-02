package com.springaicourse.designpatterns.behavioral.observer;

import static com.springaicourse.designpatterns.behavioral.observer.Event.NEW_ITEM;
import static com.springaicourse.designpatterns.behavioral.observer.Event.SALE;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }
}
