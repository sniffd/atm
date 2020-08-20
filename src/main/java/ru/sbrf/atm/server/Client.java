package ru.sbrf.atm.server;

import java.util.HashMap;
import java.util.Map;
import ru.sbrf.atm.client.CardKey;

public class Client {
  private String name;
  private long id;
  private Map<CardKey, Account> accounts;

  public Client(String name, long id) {
    this.name = name;
    this.id = id;
    this.accounts = new HashMap<CardKey, Account>();
  }

  public Map<CardKey, Account> getAccounts() {
    return accounts;
  }

  public void addAccount(CardKey card, Account account) {
    accounts.put(card, account);
  }

  public Account getAccount(CardKey card) {
    return accounts.get(card);
  }
}
