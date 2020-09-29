package ru.sbrf.atm.server.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import ru.sbrf.atm.server.Currency;

@Entity
@Table(name = "accounts")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AccountEntity extends AbstractPersistable<String> {

  private Currency currency;

  private long balance;

  @NotNull
  @ManyToOne(optional = false)
  private ClientEntity owner;

  public AccountEntity(String id, Currency currency, long balance, ClientEntity owner) {
    this.setId(id);
    this.currency = currency;
    this.balance = balance;
    this.owner = owner;
  }
}
