import java.util.Scanner;
class Loan{
   scanner s=new scanner(system.in);
  double LoanAmount;
  double interestRate;
  int timePeriod;
  Loan(double LoanAmount,double interestRate){
      this.loanamount=loanamount;
      this.interestRate=interestRate;
  }

  void paymentPeriod(){
   System.out.println("Enter amount how much YOU are going to pay monthly");
    int emi=s.nextInt();
    int count=0;
    double interest=loanAmount*interestRate/100;
    loanAmount=loanAmount+interest;
    while(loanAmount>0){
      loanAmount=loanAmount-emi;
      count=count+1;
    }
    timeperiod=count;
    System.out.println("The timeperiod required for your loan amount is"+timeperiod+"months.");
  }
}
class BankLoan{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the Loan Amount");
    double interestRate=s.nextDouble();
    System.out.println("enter the Interest Rate");
    double interestRate=s.nextDouble();
    Loan obj=new Loan(loanamount,interestRate);
    obj.paymentPeriod();
  }
}
      
    
      
      
    
  
   
