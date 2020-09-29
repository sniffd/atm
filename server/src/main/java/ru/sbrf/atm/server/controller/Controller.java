package ru.sbrf.atm.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.atm.server.model.ClientDto;
import ru.sbrf.atm.server.service.ClientService;

@RestController
@AllArgsConstructor
public class Controller {

  private ClientService clientService;

//  @GetMapping("/clients/{clientId}/balance")
//  public ResponseEntity<Long> getBalance(@PathVariable String clientId) {
//    return new ResponseEntity<>()
//  }

  @GetMapping("/clients/{clientId}")
  public ResponseEntity<ClientDto> getBalance(@PathVariable String clientId) {
    return new ResponseEntity<>(clientService.getClient(clientId), HttpStatus.OK);
  }

}
