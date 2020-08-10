package be.intecbrussel.banking_app_spring.service;

import be.intecbrussel.banking_app_spring.model.BankAccount;
import be.intecbrussel.banking_app_spring.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void saveBankAccount(BankAccount bankAccount){
        bankAccountRepository.save(bankAccount);
    }

    public void depositToBankAccount(int receiverBankAccountId, int senderBankAccountId, double amountToSend){
        Optional<BankAccount> receiverBankAccount = bankAccountRepository.findById(receiverBankAccountId);
        Optional<BankAccount> senderBankAccount = bankAccountRepository.findById(senderBankAccountId);


        if(receiverBankAccount.isPresent() && senderBankAccount.isPresent()){
            BankAccount receiver = receiverBankAccount.get();
            BankAccount sender = senderBankAccount.get();


        }


    }

    public List<BankAccount> getAllBankAccounts() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.addAll(bankAccountRepository.findAll());
        return bankAccounts;
    }
}
