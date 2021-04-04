package cl.test.serviceexample.database.repositories;

import cl.test.serviceexample.database.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
