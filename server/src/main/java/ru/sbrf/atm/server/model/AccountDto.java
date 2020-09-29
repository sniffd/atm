package ru.sbrf.atm.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.sbrf.atm.server.Currency;

@Data
@AllArgsConstructor
@Builder
public class AccountDto {

  String id;

  private Currency currency;

  private long balance;

  private ClientDto owner;
}
