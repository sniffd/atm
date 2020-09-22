package ru.sbrf.atm.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.sbrf.atm.client.auth.Key;
import ru.sbrf.atm.server.Bank;

@Setter
@Getter
@AllArgsConstructor
public class Atm {

  private Bank bank;

  public long getBalance(Key key) {
    return bank.getClient(key.getKeyString()).getAccount(key).getBalance();
  }

  public void addMoney(long value, Key key) {
    bank.getClient(key.getKeyString()).getAccount(key).changeBalance(value);
  }
}
