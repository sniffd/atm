package ru.sbrf.atm.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.atm.server.model.AccountDto;
import ru.sbrf.atm.server.model.ClientDto;
import ru.sbrf.atm.server.service.AccountService;
import ru.sbrf.atm.server.service.ClientService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {

  private ClientService clientService;
  private AccountService accountService;

  @GetMapping("/clients/{accountId}")
  public ResponseEntity<AccountDto> getAccount(@PathVariable String accountId) {
    return new ResponseEntity<>(accountService.getAccount(accountId), HttpStatus.OK);
  }

  @GetMapping("/clients/{clientId}")
  public ResponseEntity<ClientDto> getClient(@PathVariable String clientId) {
    return new ResponseEntity<>(clientService.getClient(clientId), HttpStatus.OK);
  }
}
