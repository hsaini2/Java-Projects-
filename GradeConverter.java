//This program will convert a 100-scale score into a letter grade. 
import java.util.Scanner;

public class GradeConverter {
   public static void main (String [] args) {
      //Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      //User inputs a 100-scale score 
      System.out.print("Enter a 100-scale score, e.g., 89.5: ");
      double score = input.nextDouble();
      
      //Convert to letter grades P (pass) or F (fail)
      if (score >= 60) 
       
         System.out.println("The letter grade is P (Pass).");
      
      else
         
         System.out.println("The letter grade is F (Fail).");
                                                                                                               
         
      //Convert to letter grades A, B, C, D and F using if-else.
   /*   
      char grade;
      
      if (score >= 90.0)
         grade = 'A';
         else if (score >= 80.0)      
            grade = 'B';
            else if (score >= 70.0)
               grade = 'C';
               else if (score >= 60.0)
                  grade = 'D';
                    else grade = 'F';
                    
      System.out.printf("The letter grade is %s.\n", grade);
      
      */
         
      //Convert to letter grades using SWITCH      
      switch ((int)score / 10) {
         case 10: 
         case 9: System.out.println("The letter grade is A.");break;
         case 8: System.out.println("The letter grade is B.");break;
         case 7: System.out.println("The letter grade is C.");break;
         case 6: System.out.println("The letter grade is D.");break;
           default: System.out.println("The letter grade is F.");
      }    
   }
}