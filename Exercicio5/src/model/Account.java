package model;

public class Account {

    private int number;
    private String name;
    private double balance;
    private static double TAX = 5;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= (value + TAX);
    }

    @Override
    public String toString() {
        return "Account "
            + number
            + ", Holder: "
            + name
            + ", Balance: $"
            + String.format("%.2f", balance);
    }
    
}
