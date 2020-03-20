package com.netcracker.shop.exception.model;


/**
 * The type Violation.
 */
public class Violation {

  private String message;

  /**
   * Instantiates a new Violation.
   *
   * @param message the message
   */
  public Violation(String message) {
    this.message = message;
  }

  /**
   * Gets message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}
