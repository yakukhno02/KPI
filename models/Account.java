package models;

import java.math.BigDecimal;

public class Account {
    private int id;
    private String IBAN;
    private BigDecimal balance;
    private String currency;
    private String type;

    private int customerId;

    public Account(int id, String IBAN, BigDecimal balance, String currency, String type, Integer customerId) {
        this.id = id;
        this.IBAN = IBAN;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.customerId = customerId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}