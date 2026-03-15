/*
Q4. A banking system has three classes:
    1. Account
    2. SavingsAccount
    3. PremiumSavings
Relationships:
     SavingsAccount inherits Account
     PremiumSavings inherits SavingsAccount
The Account class contains:
    double balance
    The PremiumSavings class calculates interest (7%).
The final interest must be printed as an integer using casting.
*/

package lab6tasks;

public class Account {
    double balance = 576450.56;
    void displayBalance(){
        System.out.println("Current balance: " + balance);;
    }
}

class SavingsAccount extends Account{
    void displaySavings(){
        System.out.println("This is a savings account, Current savings: " + balance);
    }
}

class PremiumSavings extends SavingsAccount{
    void displayInterest(){
        double interest = balance * 0.07;
        System.out.println("Final Interest is: " + (int)interest);
    }
}

class MAINNNN{
    public static void main(String[] args) {
        PremiumSavings s1 = new PremiumSavings();
        s1.displayBalance();
        s1.displaySavings();
        s1.displayInterest();
    }
}