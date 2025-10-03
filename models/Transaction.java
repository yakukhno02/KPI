package models;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private int id;
    private String type;
    private BigDecimal amount;
    private String currency;
    private Date date;

    private Account fromAccount;
    private Account toAccount;

    public Transaction() {
    }

    public Transaction(String type, BigDecimal amount, String currency, Date date, Account fromAccount, Account toAccount) {
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}
