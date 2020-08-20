package be.intecbrussel.banking_app_spring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Version
    private int version;

    @OneToMany
    private List<BankAccount> bankAccounts;

    private int idCardNumber;
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String address;

    public Client() {
    }

    public Client(int idCardNumber, String name, String lastName, String dateOfBirth, String address) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
