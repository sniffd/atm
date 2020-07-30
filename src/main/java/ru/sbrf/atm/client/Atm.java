package ru.sbrf.atm.client;

import ru.sbrf.atm.server.Bank;
import ru.sbrf.atm.server.Client;

public class Atm {
  private Bank bank;
  private Client client;

  public Atm(Bank bank, Client client) {
    this.bank = bank;
    this.client = client;
  }

  public long getBalance() {
    return client.getAccount().getAmount();
  }
}
