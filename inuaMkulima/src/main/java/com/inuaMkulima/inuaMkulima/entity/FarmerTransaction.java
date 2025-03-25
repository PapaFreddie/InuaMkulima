package com.inuaMkulima.inuaMkulima.entity;

@Entity
@Table(name = "farmer_transactions")
public class FarmerTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String amount;
    private String balance;

    public FarmerTransaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "FarmerTransaction{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }

    public FarmerTransaction(Long id, String balance, String amount) {
        this.id = id;
        this.balance = balance;
        this.amount = amount;
    }
}
