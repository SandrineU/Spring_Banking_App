package be.intecbrussel.banking_app_spring.repository;

import be.intecbrussel.banking_app_spring.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
