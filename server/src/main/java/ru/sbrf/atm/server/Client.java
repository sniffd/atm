//package ru.sbrf.atm.server;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import ru.sbrf.atm.server.exceptions.AccountAlreadyExistException;
//import ru.sbrf.atm.server.exceptions.AccountNotFoundException;
//
//@Builder
//@AllArgsConstructor
//@RequiredArgsConstructor
//@EqualsAndHashCode
//public class Client {
//
//  @Getter
//  @NotBlank
//  private String name;
//  @Getter
//  @NotBlank
//  private String id;
//  @Builder.Default
//  private Map<String, Account> accounts = new HashMap<>();
//
//
//  public void addAccount(@NotBlank String key, @NotNull Account account) {
//    if (accounts.containsKey(key)) {
//      throw new AccountAlreadyExistException("Счет с таким ключом уже существует");
//    }
//    accounts.put(key, account);
//  }
//
//  public Account getAccount(@NotBlank String key) {
//    Optional<Account> account = Optional.ofNullable(accounts.get(key));
//    return account.orElseThrow(AccountNotFoundException::new);
//  }
//
//  public Map<String, Account> getAccounts() {
//    return Collections.unmodifiableMap(accounts);
//  }
//}
