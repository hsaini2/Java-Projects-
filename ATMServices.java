/* 

Harshil Saini
This program creates an ATM that has a number of
differnt options of operations to choose from  

Other part of program is called "Accounts"
*/

import java.util.Scanner; 

public class ATMServices {
   static int pointer = 0;
   public static int searchAccountID(String accountID, Accounts[] accounts) {
      int ID = -1;
      for (int i = 0;i < pointer; i++) {
         if (accounts[i].getAccountID().equalsIgnoreCase(accountID)) {
            ID = i;
            break;
         }
      }
      return ID;
   }
   // Main method for operations
   public static void main (String [] args) {
      Scanner input = new Scanner(System.in); 
      
      //Creates array
      Accounts acct[] = new Accounts[10];
      acct[0] = new Accounts("C001", "Andy", 700, 1000);
      acct[1] = new Accounts("C002", "Bailey", 500, 600);
      acct[2] = new Accounts("C003", "Caroline", 850, 1500);
      
      pointer = 3;
      int index = -1;
      
      do {
         System.out.println("Enter Acct ID: ");
         String ID = input.nextLine();
         index = searchAccountID(ID, acct);
         if (index == -1)
            System.out.println("Acct ID not found, try again");
      }
            while(index == -1);
      
      boolean flag = true;
      
      while (flag) {
         //List options
         System.out.println();
         System.out.println("1. Deposit into Checking.");
         System.out.println("2. Deposit into Savings.");
         System.out.println("3. Withdrawl from Checking.");
         System.out.println("4. Withdrawl from Savings.");
         System.out.println("5. Transfer from Checking to Savings.");
         System.out.println("6. Transfer from Savings to Checking.");  
         System.out.println("7. Exit.");
         System.out.println();
      
         //User input to select option
         System.out.println("Welcome " + acct[index].getAccountName() + "! Please select a service number from our list (example: 1, 2, etc.): ");
            int transaction = input.nextInt();
         double amount = -1;
      
         //Switch to execute option 
         switch(transaction) {
         
            //Deposit to Checking
            case 1: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
            }
               while(amount < 0);
                  acct[index].depositCheck(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;

           //Deposit to Saving
           case 2: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
           }
               while(amount < 0);                        
                  acct[index].depositSave(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;
            
           //Withdraw from Checking
           case 3: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
           }
               while(amount < 0);
                  acct[index].withdrawlCheck(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;
            
          //Withdraw from Saving
          case 4: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
          }
               while(amount < 0);
                  acct[index].withdrawlSave(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;

         //Transfer from Checking to Saving
         case 5: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
         }
               while(amount < 0);
                  acct[index].checkToSave(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;
         
         //Transfer from Saving to Checking
         case 6: do {
               System.out.print("Please enter the transaction amount. "); 
               amount = input.nextDouble();
               if (amount < 0)
                  System.out.println("Invalid transaction amount. Please enter again.");
         }
               while(amount < 0);           
                  acct[index].saveToCheck(amount);
                  System.out.println();
                  System.out.println(acct[index].transactionEnd());
                  break;
            
         case 7:
               System.out.println(acct[index].transactionEnd());
               flag = false;
               break;
            
         default:
               System.out.println("Incorrect service selection. Please select again!");
               break;
         }
      }     
   }
}