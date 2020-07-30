package ru.sbrf.atm.server;

import java.util.HashMap;
import java.util.Map;

public class Client {
  private String name;
  private long id;
  private Map<Currency, Account> accounts;

  public Client(String name, long id) {
    this.name = name;
    this.id = id;
    this.accounts = new HashMap<Currency, Account>();
  }

  public Map<Currency, Account> getAccounts() {
    return accounts;
  }

  public void addAccount(Account account) {
    accounts.put(account.getCurrency(), account);
  }

  public Account getAccount(Currency currency) {
    return accounts.get(currency);
  }
}
