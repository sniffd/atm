package ru.sbrf.atm.server;

public class Account {
  private Currency currency;
  private long amount;

  public Account(Currency currency, Long amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public Currency getCurrency() {
    return currency;
  }

  public long getAmount() {
    return amount;
  }

  public void addAmount(long value) {
    amount += value;
  }
}
