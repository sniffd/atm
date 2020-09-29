package ru.sbrf.atm.server.repository;

import ru.sbrf.atm.server.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, String> {

}
