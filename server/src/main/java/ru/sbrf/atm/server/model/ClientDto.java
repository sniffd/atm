package ru.sbrf.atm.server.model;

import java.util.List;
import lombok.Builder;
import ru.sbrf.atm.server.entity.AccountEntity;

@Builder
public class ClientDto {

  private String id;

  private String name;

  private List<AccountEntity> accounts;
}
