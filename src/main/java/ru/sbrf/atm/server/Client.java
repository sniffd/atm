package ru.sbrf.atm.server;

import java.util.HashMap;
import java.util.Map;
import ru.sbrf.atm.client.Card;

public class Client {
  private String name;
  private long id;
  private Map<Card, Account> accounts;

  public Client(String name, long id) {
    this.name = name;
    this.id = id;
    this.accounts = new HashMap<Card, Account>();
  }

  public Map<Card, Account> getAccounts() {
    return accounts;
  }

  public void addAccount(Card card, Account account) {
    accounts.put(card, account);
  }

  public Account getAccount(Card card) {
    return accounts.get(card);
  }
}
