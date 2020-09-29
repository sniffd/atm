package ru.sbrf.atm.server.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ClientDto {

  private String id;

  private String name;

  private List<AccountDto> accounts;
}
