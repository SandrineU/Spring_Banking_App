package be.intecbrussel.banking_app_spring.service;

import be.intecbrussel.banking_app_spring.model.BankAccount;
import be.intecbrussel.banking_app_spring.repository.BankAccountRepository;
import com.sun.xml.bind.v2.runtime.reflect.opt.OptimizedAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


@Service
public class BankAccountService {


    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void saveBankAccount(BankAccount bankAccount) {
        bankAccount.setBankAccNr(ThreadLocalRandom.current().nextDouble());
        bankAccountRepository.save(bankAccount);
    }

    public void transactionToBankAccount(int receiverBankAccountId, int senderBankAccountId, double amountToSend) {
        Optional<BankAccount> receiverBankAccount = bankAccountRepository.findById(receiverBankAccountId);
        Optional<BankAccount> senderBankAccount = bankAccountRepository.findById(senderBankAccountId);


        if (receiverBankAccount.isPresent() && senderBankAccount.isPresent()) {
            BankAccount receiver = receiverBankAccount.get();
            BankAccount sender = senderBankAccount.get();

            if (sender.getBalance() <= amountToSend) {
                System.out.println("U broke");

            } else {
                double newBalance = receiver.getBalance() + amountToSend;
                receiver.setBalance(newBalance);
                receiver.setPreviousTransaction(+amountToSend);

                double newBalanceS = sender.getBalance() - amountToSend;
                sender.setBalance(newBalanceS);
                sender.setPreviousTransaction(-amountToSend);

                bankAccountRepository.save(receiver);
                bankAccountRepository.save(sender);

            }

        }


    }

    public List<BankAccount> getAllBankAccounts() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.addAll(bankAccountRepository.findAll());
        return bankAccounts;
    }
}
