package de.aittr.g_27_shop_project.exeption_handling.exceptions;

import de.aittr.g_27_shop_project.domain.interfaces.Customer;

public class CustomerNotFoundException extends RuntimeException {

  public CustomerNotFoundException(String message) {
    super(message);
  }
}
