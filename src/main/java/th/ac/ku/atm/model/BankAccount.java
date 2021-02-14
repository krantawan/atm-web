package th.ac.ku.atm.model;

public class BankAccount {
    private int id;
    private int customerId;
    private String type;
    private double balance;

    public BankAccount(int id, int customerId, String type, double balance){
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

}
