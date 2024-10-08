import java.util.*;
interface RBI{
    int rate =2;
    void calculateInterest();
}


abstract class BankAccountEx1
{
    Scanner sc=new Scanner(System.in);
    static int amount,balance,balance1;
    static int mobile,accountNumber;
    static String name;
    abstract void deposit();

    abstract void withdraw();

    public void inputCustData()
    {
        System.out.println("Enter Account Number :");
        accountNumber=sc.nextInt();
        System.out.println("Enter Name :");
        name=sc.next();
        System.out.println("Enter Mobile number :");
        mobile=sc.nextInt();
    }
    public void showCustData()
    {
        System.out.println("<------------Details-------------->");
        System.out.println("Account Number :"+ accountNumber);
        System.out.println("Name :"+ name);
        System.out.println("Mobile Number :"+ mobile);
        System.out.println("Balance for Current Account:"+balance1);
        System.out.println("Balance for Savings account:"+balance);
        System.out.println("-------------------------------------");

    }
}



class SavingsAccountEx1 extends BankAccountEx1
{
    public void deposit()
    {
        System.out.println("Enter amount");
        amount=sc.nextInt();
        balance=balance+amount;
    }
    public void withdraw()
    {
        System.out.println("Enter amount :");
        amount=sc.nextInt();
        if(balance-amount<1000)
        {
            System.out.println("Minimum account balance should be 1000");
        }
        else
        {
            System.out.println("Withdrawal is possible");
            balance=balance-amount;
        }
        balance=balance-amount;
    }



}

class Intrestman extends  SavingsAccountEx1 implements  RBI {
    int saRate =4 ;
    public void calculateInterest() {
        if(saRate>=rate){
            double money = BankAccountEx1.balance;
            System.out.println("The interest rate on your balance will be : " +money*(saRate/10) );
        }
    }
}

class Intrestman2 extends  CurrentAccountEx1 implements  RBI {
    int saRate =2 ;
    public void calculateInterest() {
        if(saRate>=rate){
            double money = BankAccountEx1.balance;
            System.out.println("The interest rate on your balance will be : " +money*(saRate/10) );
        }
    }
}
class CurrentAccountEx1 extends SavingsAccountEx1
{
    public void deposit()
    {
        System.out.println("Enter amount");
        amount=sc.nextInt();
        balance1=balance1+amount;
    }
    public void withdraw()
    {
        System.out.println("Enter amount :");
        amount=sc.nextInt();
        if(balance-amount<1000)
        {
            System.out.println("Minimum account balance should be 1000");
        }
        else {

            System.out.println("Withdrawal is possible");
            balance=balance-amount;
        }
        balance1=balance1-amount;
    }
}

class Banking extends CurrentAccountEx1
{
    public static void main(String args[])
    {
        while(true)
        {
            {
                CurrentAccountEx1 C=new CurrentAccountEx1();
                SavingsAccountEx1 S= new SavingsAccountEx1();
                Intrestman K = new Intrestman();
                Intrestman2 L = new Intrestman2();
                Scanner sc1=new Scanner(System.in);
                System.out.println("1. Input Data ");
                System.out.println("2. Show info ");
                System.out.println("3. Deposit amount on savings account ");
                System.out.println("4. Withdraw money from savings account ");
                System.out.println("5. Deposit money on current account");
                System.out.println("6. Withdraw money from current account");
                System.out.println("7.Calculate intrest Saving account");
                System.out.println("8. Calculate intrest current account");
                System.out.println("9. EXIT");
                int choice=sc1.nextInt();
                switch(choice)
                {
                    case 1: S.inputCustData();
                        break;
                    case 2: S.showCustData();
                        break;
                    case 3: S.deposit();
                        break;
                    case 4: S.withdraw();
                        break;
                    case 5: C.deposit();
                        break;
                    case 6: C.withdraw();
                        break;
                    case 7: K.calculateInterest();
                    break;
                    case 8:L.calculateInterest();
                    break;

                    default: System.exit(0);
                        break;



                }

            }
        }
   }
}