package ua.serf.microservices.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ua.serf.microservices.account.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
