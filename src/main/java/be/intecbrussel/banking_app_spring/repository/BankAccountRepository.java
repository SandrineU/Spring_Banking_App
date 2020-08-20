package be.intecbrussel.banking_app_spring.repository;

import be.intecbrussel.banking_app_spring.model.BankAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

    @Override
    List<BankAccount> findAll();
}
