package ru.sbrf.atm.server.repository;

import ru.sbrf.atm.server.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, String> {

}
