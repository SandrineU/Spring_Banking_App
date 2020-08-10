package be.intecbrussel.banking_app_spring.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Version
    private int version;

    private BigDecimal balance;

    private int previousTransaction;

    private String customerName;

    private String customerLastName;

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


    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTranasaction) {
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public double getBankAccNr() {
        return bankAccNr;
    }

    public void setBankAccNr(double bankAccNr) {
        this.bankAccNr = bankAccNr;
    }
}

