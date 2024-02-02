package ua.serf.microservices.bill.repository;

import org.springframework.data.repository.CrudRepository;
import ua.serf.microservices.bill.entity.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {
}
