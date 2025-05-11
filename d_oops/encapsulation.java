package d_oops;
import java.util.*;

class BackAccount{
    private String accountHolder;
    private int balance;
    public void setAccountHolder(String name){
        accountHolder = name;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
        }
    }
    public void withdraw(int amount){
        if(balance>=amount){
            balance = balance-amount;
        }else{
            System.out.println("low balance");
        }
    }
    public int getBalance(){
        return balance;
    }
}
public class encapsulation {
    public static void main(String[] args){
        BackAccount myAccount = new BackAccount();
        myAccount.setAccountHolder("Ayush Prem");
        myAccount.deposit(1000);
        myAccount.withdraw(200);
        System.out.println("UserName: "+myAccount.getAccountHolder());
        System.out.println("Current Balance: "+myAccount.getBalance());

    }
}
