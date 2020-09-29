package ru.sbrf.atm.server.exceptions;

public class ClientAlreadyExistException extends RuntimeException {

  public ClientAlreadyExistException() {
    super();
  }

  public ClientAlreadyExistException(String message) {
    super(message);
  }

  public ClientAlreadyExistException(String message, Throwable cause) {
    super(message, cause);
  }

  public ClientAlreadyExistException(Throwable cause) {
    super(cause);
  }

  protected ClientAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
