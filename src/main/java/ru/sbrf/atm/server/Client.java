package ru.sbrf.atm.server;

public class Client {
  private String name;
  private long id;
  private Account account;

  public Client(String name, long id, Account account) {
    this.name = name;
    this.id = id;
    this.account = account;
  }

  public Account getAccount() {
    return account;
  }
}
