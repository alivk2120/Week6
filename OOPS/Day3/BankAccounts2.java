/*Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.*/
import java.util.Scanner;
class BankAccount{
  double balance,interestRate;
}
class CheckingAccount extends BankAccount{
  Scanners new Scanner(System.in);
  double transactionFee;
  void withdraw(){
    System.out.println("Enter the amount to withdraw");
    double amount=s.nextDouble();
    balance=balance-amount;
    if(balance<=0){
      System.out.println("amount should be less than balance");
    }
    else{
      System.out.println("balance is :"+balance);
    }
  }
}

class SavingsAccount extends BankAccount{
  double minBalance;
  double interest=balance*interestRate/100;
  balance=balance+interest;
 System.out.println("Balance after interest is :"+balance);
}
class BankAccounts2{
  public static void main(String args[]){
    
  }
}