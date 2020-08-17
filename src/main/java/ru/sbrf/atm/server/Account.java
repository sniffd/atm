package ru.sbrf.atm.server;

public class Account {
  private Currency currency;
  private long balance;

  public Account(Currency currency, Long balance) {
    this.currency = currency;
    this.balance = balance;
  }

  public Currency getCurrency() {
    return currency;
  }

  public long getBalance() {
    return balance;
  }

  public void addAmount(long value) {
    balance += value;
  }
}
