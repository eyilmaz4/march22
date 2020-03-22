package codes;

public class Bank {
    protected int AccountNumber;
    protected String AccountName;
    protected double balance;

    public Bank(int accountNumber, String accountName, double balance) {
        AccountNumber = accountNumber;
        AccountName = accountName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "AccountNumber=" + AccountNumber +
                ", AccountName='" + AccountName + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void addMoney(double money){
        this.balance+=money;
    }
    public void takeMoney(double money){

       if(money<this.balance)
       { this.balance-=money;
       }
       else{
           System.out.println("balance is not enough");
       }
    }
    public void changeAccountName(String name){
        this.AccountName=name;
    }
}
