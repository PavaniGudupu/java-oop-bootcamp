import java.util.*;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    
    public void setBalance(double balance){
        if (balance >= 1000) {
            this.balance = balance;
        } else {
            this.balance = 1000;
        }
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int accountNumber = sc.nextInt();
        String accountHolderName = sc.next();
        double balance = sc.nextDouble();
        
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountHolderName(accountHolderName);
        account.setBalance(balance);
        
        System.out.println("Bank Account Details");
        System.out.println();
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
        
    }
}