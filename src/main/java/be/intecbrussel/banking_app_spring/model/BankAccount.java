package be.intecbrussel.banking_app_spring.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;


public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double bankAccNr;

    @Version
    private int version;

    @ManyToOne
    private Client client;

    private double balance;

    private double previousTransaction;

    public BankAccount() {

    }

    public BankAccount(Client client, double balance, double previousTransaction) {
        this.client = client;
        this.balance = balance;
        this.previousTransaction = previousTransaction;
    }

    public double getBankAccNr() {
        return bankAccNr;
    }

    public void setBankAccNr(double bankAccNr) {
        this.bankAccNr = bankAccNr;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(double previousTransaction) {
        this.previousTransaction = previousTransaction;
    }
}