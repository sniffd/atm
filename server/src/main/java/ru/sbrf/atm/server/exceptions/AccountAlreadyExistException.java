package ru.sbrf.atm.server.exceptions;

public class AccountAlreadyExistException extends RuntimeException {

  public AccountAlreadyExistException() {
    super();
  }

  public AccountAlreadyExistException(String message) {
    super(message);
  }

  public AccountAlreadyExistException(String message, Throwable cause) {
    super(message, cause);
  }

  public AccountAlreadyExistException(Throwable cause) {
    super(cause);
  }

  protected AccountAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
