//2.  Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber."
// Include a method to deposit money into the account and a method to withdraw money from the account.
public class BankAccount {
double balance;
String accountNumber;

public BankAccount() {

}

public BankAccount(double balance, String accountNumber) {
    this.balance = balance;
    this.accountNumber = accountNumber;
}

public void deposit(double amount,String accountNumber) {

    if(accountNumber != null) {
        this.balance += amount;
    } else if ( accountNumber == null) {
        this.balance=amount;

    }

    System.out.println("Deposit Amount: " + amount);
}

public void withdraw(double amount,String accountNumber) {
    if(accountNumber != null) {
        this.balance -= amount;
        System.out.println("Withdraw Amount: " + amount);
    }else if ( accountNumber == null) {
        System.out.println("Account number not found");
    }


}


}
