import java.util.*;
class InsufficientBalance extends Exception{
    InsufficientBalance(){
    System.out.println("Transaction Failed..");
        }
    }
class Bank{
    int balance;
    Bank(int bal){
        balance = bal;
    }
    void deposit(int amt){
        balance = balance + amt;
        System.out.println("Available: "+ balance);
    }
    void withdraw(int amt) throws InsufficientBalance{
    if(balance>amt)
    balance = balance - amt;
    else{
        InsufficientBalance ub = new InsufficientBalance();
        throw ub;
    }
        System.out.println("Available Balance: "+ balance);
    }
}
    class ExceptionDemo{
        public static void main(String args[]) {
            Bank b = new Bank(1000);
            b.deposit(1000);
            try{
                b.withdraw(1500);
                b.withdraw(1000);
            }
            catch(InsufficientBalance ub)
            {
                System.out.println(ub);
            }
        }
    }
