package practice.bank_account.model;

public class BankAccount {
    private long id;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    //тип счета, валюта, адресс, контактные данные ,возраст больше 18 , паспортные данные.

    //constructors for all class
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //constructor without field of balance

    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance=0.0;
    }

//client without name


    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner="Anon";
    }
    //constructors of anonymous client and without balance is done


    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        owner="Nameless";
        balance=0.0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }
    //To put money into the account
    public boolean deposit(double sum) {
    balance+=sum;
    return true;
    }

    //Withdraw money from the account
    public boolean withdraw(double sum) {
        if (sum <= balance) {
            balance-=sum;
            return true;
        }
        return false;
    }

}
