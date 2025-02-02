package com.springaicourse.designpatterns.structural.facade.thirdparty;

/**
 * Factory class implementing the Factory Method pattern for cryptocurrency services
 * This class centralizes the creation of different cryptocurrency service implementations
 */
public class CryptoFactory {
  /**
   * Factory method that returns the appropriate CryptoService implementation based on currency type
   * This method encapsulates the object creation logic and provides a single point of access
   *
   * @param currency The cryptocurrency code (e.g. "BTC", "ETH")
   * @return The corresponding CryptoService implementation
   */
  public static CryptoService getCryptoService(String currency) {
    // Check for Bitcoin currency code
    if (currency.equals("BTC")) {
      return new BitcoinService();
    }
    // Check for Ethereum currency code
    else if (currency.equals("ETH")) {
      return new EtherumService();
    }
    // Default case returns Bitcoin service
    else {
      // More Stuff
      return new BitcoinService();
    }
  }
}