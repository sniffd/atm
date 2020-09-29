package ru.sbrf.atm.client.auth.impl;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import ru.sbrf.atm.client.auth.Key;

@AllArgsConstructor
@EqualsAndHashCode
public class CardKey implements Key {

  private String number;
  private String pin;
  private Date expireDate;

  public String getKeyString() {
    return number + pin + expireDate.toString();
  }
}
