package ru.sbrf.atm.server;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import ru.sbrf.atm.client.auth.Key;
import ru.sbrf.atm.server.exceptions.AccountAlreadyExistException;
import ru.sbrf.atm.server.exceptions.AccountNotFoundException;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Client {

  @Getter
  @NonNull
  private String name;
  @Getter
  @NonNull
  private String id;
  @Builder.Default
  private Map<Key, Account> accounts = new HashMap<>();


  public void addAccount(Key key, Account account) {
    if (accounts.containsKey(key)) {
      throw new AccountAlreadyExistException("Счет с таким ключом уже существует");
    }
    accounts.put(key, account);
  }

  public Account getAccount(Key key) {
    Optional<Account> account = Optional.ofNullable(accounts.get(key));
    return account.orElseThrow(AccountNotFoundException::new);
  }

  public Map<Key, Account> getAccounts() {
    return Collections.unmodifiableMap(accounts);
  }
}
