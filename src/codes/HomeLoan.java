package codes;

public class HomeLoan extends Loan{
    double PMI;

    public HomeLoan(int accountNumber, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount, double PMI) {
        super(accountNumber, accountName, balance, interestRate, numOfPayment, loanAmount);
        this.PMI = PMI;
    }
    public void monthlyPayment(){
        double result=super.loanAmount*super.interestRate/super.numOfPayment+this.PMI;
        System.out.println("monthly payment"+result);
    }
    public void totalPayment(){
        double result=super.loanAmount*super.interestRate+this.PMI*super.numOfPayment;
    }
}
