package ru.sbrf.atm.server.service;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sbrf.atm.server.exceptions.ClientNotFoundException;
import ru.sbrf.atm.server.model.ClientDto;
import ru.sbrf.atm.server.repository.ClientRepository;

@Service
@AllArgsConstructor
public class ClientService {

  private ClientRepository clientRepository;

  public ClientDto getClient(@NotBlank String clientId) {
    return clientRepository.findById(clientId).orElseThrow(ClientNotFoundException::new).toDto();
  }
}
