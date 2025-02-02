package com.springaicourse.designpatterns.behavioral.visitor;

import com.springaicourse.designpatterns.behavioral.visitor.model.*;
import com.springaicourse.designpatterns.behavioral.visitor.model.Client;

import java.util.List;

/**
 * Visitor implementation for sending insurance-related messages to different types of clients.
 * Implements the Visitor interface to provide specific messaging behavior for each client type.
 */
public class InsuranceMessagingVisitor implements Visitor {

  /**
   * Sends insurance-related messages to a list of clients. Uses the visitor pattern to determine
   * the appropriate message for each client type.
   *
   * @param clients List of clients to send insurance messages to
   */
  public void sendInsuranceMails(List<Client> clients) {
    for (Client client : clients) {
      client.accept(this);
    }
  }

  /**
   * Sends theft insurance related message to a bank client. Banks receive specialized messaging
   * about protecting against theft.
   *
   * @param bank The bank client to send message to
   */
  public void visit(Bank bank) {
    System.out.println("Sending mail about theft insurance to " + bank.getName());
  }

  /**
   * Sends employee and equipment insurance related message to a company client. Companies receive
   * messaging about protecting their employees and equipment.
   *
   * @param company The company client to send message to
   */
  public void visit(Company company) {
    System.out.println("Sending employees and equipment insurance mail to " + company.getName());
  }

  /**
   * Sends medical insurance related message to a resident client. Residents receive messaging about
   * personal medical coverage.
   *
   * @param resident The resident client to send message to
   */
  public void visit(Resident resident) {
    System.out.println("Sending mail about medical insurance to " + resident.getName());
  }

  /**
   * Sends fire and food insurance related message to a restaurant client. Restaurants receive
   * specialized messaging about fire safety and food coverage.
   *
   * @param restaurant The restaurant client to send message to
   */
  public void visit(Restaurant restaurant) {
    System.out.println("Sending mail about fire and food insurance to " + restaurant.getName());
  }
}
