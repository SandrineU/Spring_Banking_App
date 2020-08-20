package be.intecbrussel.banking_app_spring.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class BankAccount {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Version
    private int version;

    private double balance;

    private double previousTransaction;

    private String customerName;

    private String customerLastName;

    @GeneratedValue
    private double bankAccNr;

    public BankAccount() {

    }

    public BankAccount(int customerId, String customerName, String customerLastName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public double getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(double previousTranasaction) {
        this.previousTransaction = previousTranasaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBankAccNr() {
        return bankAccNr;
    }

    public void setBankAccNr(double bankAccNr) {
        this.bankAccNr = bankAccNr;
    }
}

