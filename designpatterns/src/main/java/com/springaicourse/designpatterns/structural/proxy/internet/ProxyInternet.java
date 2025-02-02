package com.springaicourse.designpatterns.structural.proxy.internet;

import java.util.ArrayList;
import java.util.List;

/**
 * ProxyInternet implements the Proxy design pattern for controlling access to Internet resources
 * The Proxy pattern provides a surrogate or placeholder for another object to control access to it
 * In this case, it acts as a protective proxy that filters access to certain websites
 */
public class ProxyInternet implements Internet {

  // List of banned sites that should be blocked
  private static final List<String> bannedSites;

  // Reference to the real subject (RealInternet) that this proxy protects
  private final Internet internet = new RealInternet();

  // Static initialization block to populate banned sites
  static {
    bannedSites = new ArrayList<>();
    bannedSites.add("banned.com");
  }

  /**
   * Proxy method that controls access to the real internet connection
   * Demonstrates the key aspect of the proxy pattern by adding access control
   * before delegating to the real subject
   *
   * @param host The website host to connect to
   */
  @Override
  public void connectTo(String host) {
    // Check access control logic
    if (bannedSites.contains(host)) {
      System.out.println("Access Denied to " + host);
      return;
    }
    // Delegate the actual connection to the real subject
    internet.connectTo(host);
  }
}