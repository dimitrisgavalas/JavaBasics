package javaClasses;
/*
 *Constructors
 * Getters Setters
 * */
public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("12345", 0.00, "mitsos", "123@123.123", "123456789");
        System.out.println("Empty constructor called");
    }

    //constructor is an easy way of getting rid of setters
    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructpr called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double addFunds){
        this.balance += addFunds;
        System.out.println("Balance = " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (this.balance - withdrawalAmount > 0) {
            this.balance -= withdrawalAmount;
            System.out.println("Balance = " + this.balance);
        }else
            System.out.println("Insufficient funds");
    }

}
