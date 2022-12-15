/*

Harshil Saini

This simple program enables users encrypt their own password and choose 
how many characters they would like to shift the password.

*/

import java.util.Scanner;   
   
public class EncryptPassword {   
   public static final String letters = "abcdefghijklmnopqrstuvwxyz";   
      public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);   
          
        System.out.println("Enter your password to encrypt (Letters Only): ");   
        String password = input.nextLine();   
          
        System.out.println("How many characters will you like it to shift? ");   
        int numShift = Integer.valueOf(input.nextLine());   
          
        System.out.println("Encrypted Password: " + encryptPass(password, numShift));   
      }        
      
   public static String encryptPass(String password, int numShift) {   
        password = password.toLowerCase();   
        String encryptStr = "";   
          
        for (int i = 0; i < password.length(); i++) {   
            int pos = letters.indexOf(password.charAt(i));                 
            int encryptPos = (numShift + pos) % 26;   
            char encryptChar = letters.charAt(encryptPos);   
            encryptStr += encryptChar;   
        }   
            return encryptStr;   
    }    
}   