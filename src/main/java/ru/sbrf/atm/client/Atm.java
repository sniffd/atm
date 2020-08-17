package ru.sbrf.atm.client;

import ru.sbrf.atm.server.Bank;
import ru.sbrf.atm.server.Client;
import ru.sbrf.atm.server.Currency;

public class Atm {
  private Bank bank;
  private Client client;

  public Atm(Bank bank, Client client) {
    this.bank = bank;
    this.client = client;
  }

  public long getBalance(Currency currency) {
    return client.getAccount(currency).getBalance();
  }

  public void addMoney(long value, Currency currency) {
    client.getAccount(currency).addAmount(value);
  }
}
