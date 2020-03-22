package codes;

import org.w3c.dom.ls.LSOutput;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank= new Bank(123, "saving",350);
        System.out.println(myBank.balance);
        Loan myLoan= new Loan(123,"cash",123.777,0.1,11,12.000 );
CarLoan myCar=new CarLoan(123,"name", 12.000, 0.2, 12, 10.000, 0.4,120);
   myCar.monthlyPayment();
        System.out.println();
    }

}
