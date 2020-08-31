package ru.sbrf.atm.server;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import ru.sbrf.atm.server.exceptions.ClientAlreadyExistException;
import ru.sbrf.atm.server.exceptions.ClientNotFoundException;

@NoArgsConstructor
@AllArgsConstructor
public class Bank {

  @Builder.Default
  private Map<String, Client> clients = new HashMap<>();

  public Client getClient(String clientId) {
    Optional<Client> client = Optional.ofNullable(clients.get(clientId));
    return client.orElseThrow(ClientNotFoundException::new);
  }

  public void addClient(String clientId, Client client) {
    if (clients.containsKey(clientId)) {
      throw new ClientAlreadyExistException("Клиент с таким id уже существует");
    } else if (clients.containsValue(client)) {
      throw new ClientAlreadyExistException("Такой клиент уже существует");
    }
    clients.put(clientId, client);
  }
}
