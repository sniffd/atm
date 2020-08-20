package ru.sbrf.atm.client;

import java.util.Date;

public class CardKey implements Key{

  private final String number;
  private String pin;
  private Date expireDate;

  public CardKey(String number, String pin, Date expireDate) {
    this.number = number;
    this.pin = pin;
    this.expireDate = expireDate;
  }

  public String getKeyString() {
    return number + pin + expireDate.toString();
  }
}
