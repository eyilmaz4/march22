package codes;

public class CarLoan extends Loan{
     double APR;
   int CreditScore;

    public CarLoan(int accountNumber, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount, double APR, int creditScore) {
        super(accountNumber, accountName, balance, interestRate, numOfPayment, loanAmount);
        this.APR = APR;
        CreditScore = creditScore;
    }
    public void monthlyPayment(){
        double result=super.loanAmount*this.APR/super.numOfPayment-(this.CreditScore/10);
        System.out.println("montly payment"+result);
    }
    public void totalPayment(){
        double result= super.loanAmount*super.interestRate;
        System.out.println("total payment:"+result);
    }
}
