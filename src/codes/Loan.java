package codes;

public class Loan extends Bank {

    protected double interestRate;
    protected int numOfPayment;
    protected double loanAmount;

    public Loan(int accountNumber, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numOfPayment = numOfPayment;
        this.loanAmount = loanAmount;
    }
    public void monthlyPayment(){
     double   result=this.loanAmount*this.interestRate/this.numOfPayment;
        System.out.println("monthly payment:"+result);
    }
    public void totalPayment(){
        double result= this.loanAmount*this.interestRate;
        System.out.println("total payment:"+result);
    }
}
