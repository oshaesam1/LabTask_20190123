
package assignment;

import java.util.Scanner;

/**
 *This class contains the information of the account with take and put money methods and restrictions
 * @author Samah
 * @Version 1.0
 * @since 30 April 2021
 */
public class Account {
    
   protected double balance;
   protected static int accountNumber;

    /**
     *
     * default constructor
     */
   public Account(){
    balance=0;
    accountNumber++; 
    }
   /**
    *  parameterized constructor
    * @param balance of the account
    */
   public Account(double balance){
    this.balance=balance;
    accountNumber++; 
    }
   /**
    * setBalance method takes balance
    * @param balance of the account
    */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * getBalance returns balance of the account
     * @return balance of the account
     */
    public double getBalance() {
        return balance;
    }
    /**
     * setAccountNumber method takes account Number
     * @param accountNumber 
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * getAccountNumber returns the accountNumber
     * @return accountNumber of the client
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    

    
    /**
     * toString method returns information of the Account
     * @return balance,accountNumber
     */
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", accountNumber=" + accountNumber + '}';
       
    }
    
        //put money
        /**
         * deposit method takes putting money amount
         * @param puttingMoney 
         */
        public void deposit(double puttingMoney)
	{
		balance = balance + puttingMoney;
	}
        
        
          //take money
        /**
         * withdraw method takes putting money amount
         * @param takingMoney 
         */
	public void withdraw(double takingMoney)
	{
            if(takingMoney>0 && takingMoney<=balance){
             balance = balance - takingMoney;
            }
            else{
            System.out.print("ERROR..You don't have enough balance\n");
            }
		
	}
//        public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        
        
       
//        Account obj1= new Account();
//        obj1.setBalance(1000);
//        System.out.println(obj1.getBalance());
//        System.out.println(obj1.getAccountNumber());
//        System.out.println(obj1.toString());
//        obj1.deposit(2000);
//        System.out.println(obj1.getBalance());
//        System.out.println(obj1.toString());
//        obj1.withdraw(500);
//        System.out.println(obj1.getBalance());
//        System.out.println(obj1.toString());
//        obj1.withdraw(2500);
//        System.out.println(obj1.getBalance());
//        System.out.println(obj1.toString());
//        obj1.withdraw(500);
//        
//        
//        
//        Account obj2= new SpecialAccount();
//        obj2.setBalance(5000);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.getAccountNumber());
//        System.out.println(obj2.toString());
//        obj2.deposit(2000);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.toString());
//        obj2.withdraw(500);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.toString());
//        obj2.withdraw(6500);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.toString());
//        obj2.withdraw(500);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.toString());
//        obj2.withdraw(1000);
//        System.out.println(obj2.getBalance());
//        System.out.println(obj2.toString());
//    }
// 
}
        
   
