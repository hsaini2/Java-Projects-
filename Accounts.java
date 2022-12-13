/* 
 
Harshil Saini
This program creates an ATM that has a number of
differnt options of operations to choose from  

Other part of program is called "ATMServices"
*/

import java.util.Calendar;
import java.util.Date;  

public class Accounts {
   
   //Instance Variables
   private String accountID;
   private String accountName;
   private double checkingBalance;
   private double savingsBalance;
   
   //Default and Custom constructors
   public Accounts() {
      accountID = "";
      accountName = "";
      checkingBalance = 0.0;
      savingsBalance = 0.0;
   }
   
   public Accounts (String accountID, String accountName, double checkingBalance, double savingsBalance) {
      this.accountID = accountID;
      this.accountName = accountName;
      this.checkingBalance = checkingBalance; 
      this.savingsBalance = savingsBalance; 
   }
   
   //Set methods
   public void setAccountID(String accountID) {
      this.accountID = accountID;
   }
   
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }
   
   public void setCheckingBalance(double checkingBalance) {
      this.checkingBalance = checkingBalance;
   }
   
   public void setSavingsBalance(double savingsBalance) {
      this.savingsBalance = savingsBalance;
   }
   
   //Service transaction methods
   public void depositCheck (double amount) {
      this.checkingBalance = checkingBalance + amount;
      System.out.println("$" + amount + " has been deposited in your checking account."); 
   }
   
   public void depositSave (double amount) {
      this.savingsBalance = savingsBalance + amount;
      System.out.println("$" + amount + " has been deposited in your savings account."); 
   }
   
   public void withdrawlCheck (double amount) {
      if (checkingBalance > amount) {
         this.checkingBalance = checkingBalance - amount;
         System.out.println("$" + amount + " has been withdrawled from your checking account."); 
      }
         else {
            System.out.println("Insufficient Balance! Transaction Cancelled");
         }
   }

   public void withdrawlSave (double amount) {
      if (savingsBalance > amount) {
         this.savingsBalance = savingsBalance - amount;
         System.out.println("$" + amount + " has been withdrawled from your savings account."); 
      }
         else {
            System.out.println("Insufficient Balance! Transaction Cancelled"); 
         }
   }
   
   public void checkToSave (double amount) {
      if (checkingBalance > amount) {
         this.savingsBalance = savingsBalance + amount;
         this.checkingBalance = checkingBalance - amount; 
         System.out.println("$" + amount + " has been withdrawled from checking.");
         System.out.println("$" + amount + " has been deposited to savings.");
      }
         else {
            System.out.println("Insufficient Balance! Transaction Cancelled"); 
         }
   }
   
   public void saveToCheck (double amount) {
      if (savingsBalance > amount) {
         this.savingsBalance = savingsBalance - amount;
         this.checkingBalance = checkingBalance + amount; 
         System.out.println("$" + amount + " has been withdrawed from savings.");
         System.out.println("$" + amount + " has been deposited to checking.");
      }
         else {
            System.out.println("Insufficient Balance! Transaction Cancelled"); 
         }
   }
   
   //Get methods
   public String getAccountID() {
      return accountID;
   }

   public String getAccountName() {
      return accountName;
   }

   public double getCheckingBalance() {
      return checkingBalance;
   }

   public double getSavingsBalance() {
      return savingsBalance;
   }

   //Return transaction method
   public String transactionEnd() {
      Calendar calendar = Calendar.getInstance();
      Date date = calendar.getTime();
      
      return date + "\n" + "Account ID: " + accountID + "\tCustomer Name: " + accountName + "\nThe transactions have been completed successfully!\nChecking Account Balance: $" + checkingBalance + "\nSavings Account Balance: $" + savingsBalance;
   }

} 
