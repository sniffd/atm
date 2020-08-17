package ru.sbrf.atm.client;

import java.util.Date;

public class Card {

  private final String number;
  private String pin;
  private Date expireDate;

  public Card(String number, String pin, Date expireDate) {
    this.number = number;
    this.pin = pin;
    this.expireDate = expireDate;
  }
}
