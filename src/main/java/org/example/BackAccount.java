package org.example;

public class BackAccount {
    int acc_no;
    String name;
    double amount;

    public BackAccount(int i, String nameAccount, double v) {
        this.acc_no =i;
        this.name =nameAccount;
        this.amount = v;
    }

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
