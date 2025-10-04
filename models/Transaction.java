package models;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private int id;
    private String type;
    private BigDecimal amount;
    private String currency;
    private Date date;

    private Account fromAccountId;
    private Account toAccountId;

    public Transaction() {
    }

    public Transaction(String type, BigDecimal amount, String currency, Date date, Account fromAccount, Account toAccount) {
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
        this.fromAccountId = fromAccount;
        this.toAccountId = toAccount;
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

    public Account getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(Account fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public Account getToAccount() {
        return toAccountId;
    }

    public void setToAccount(Account toAccountId) {
        this.toAccountId = toAccountId;
    }
}
