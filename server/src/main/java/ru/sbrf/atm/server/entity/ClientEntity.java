package ru.sbrf.atm.server.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import ru.sbrf.atm.server.model.ClientDto;

@Entity
@Table(name = "clients")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientEntity extends AbstractPersistable<String> {

  @NotBlank
  private String name;

  @OneToMany(mappedBy = "owner")
  private List<AccountEntity> accounts;

  public ClientEntity(String id, String name, List<AccountEntity> accounts) {
    this.setId(id);
    this.name = name;
    this.accounts = accounts;
  }

  public ClientDto toDto() {
    return ClientDto.builder()
        .id(getId())
        .name(name)
        .accounts(accounts).build();
  }
}
