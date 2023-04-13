import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);
    int accountNo;
    double balance;

    BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void withdraw() {
        System.out.println("Enter Amount to withdraw");
      double withdraw=sc.nextDouble();
        balance = balance - withdraw;
        displayBalance();

    }

    void deposit() {
        System.out.println("Enter Amount to deposit");
      double depo=sc.nextDouble();
        balance = balance + depo;
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Balance is " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account number ");
        int accNo = s.nextInt();
        System.out.println("Enter Balance");
        double balance = s.nextDouble();

        BankAccount ba = new BankAccount(accNo, balance);
        ba.withdraw();
        ba.deposit();
    }
}