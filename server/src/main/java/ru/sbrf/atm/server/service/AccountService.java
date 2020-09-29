package ru.sbrf.atm.server.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sbrf.atm.server.exceptions.AccountNotFoundException;
import ru.sbrf.atm.server.model.AccountDto;
import ru.sbrf.atm.server.repository.AccountRepository;

@Service
@AllArgsConstructor
public class AccountService {

  private AccountRepository accountRepository;

  public AccountDto getAccount(String accountId) {
    return accountRepository.findById(accountId).orElseThrow(AccountNotFoundException::new).toDto();
  }
}
