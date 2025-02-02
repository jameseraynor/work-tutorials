package com.springaicourse.designpatterns.behavioral.observer;

/**
 * A record class that implements the Listener interface to handle email notifications. This
 * listener is responsible for sending email messages when events occur.
 *
 * <p>a record is a special kind of class in Java that provides a compact and immutable way to
 * define simple data classes. It automatically generates a constructor, getters, and other methods
 * based on the fields defined in the record. Records are immutable, meaning their state cannot be
 * changed after creation.
 *
 *
 *
 * @param email The email address where notifications will be sent
 */
public record EmailMsgListener(String email) implements Listener {

  /**
   * Updates the listener with a new event and sends an email notification. This method is called
   * whenever the subject notifies its observers of a state change.
   *
   * @param eventType The type of event that occurred and needs to be communicated @Override from
   *     Listener interface
   */
  @Override
  public void update(Event eventType) {
    // Actually send the mail to the specified email address
    // In a real implementation, this would connect to an email service
    System.out.println("Sending mail to " + email + " concerning " + eventType);
  }
}
