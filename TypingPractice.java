/*
MIS350 
HW5 Part B
9/27
Harshil Saini
This program is a typing test for 1 minute
*/

//Import scanner and random 
import java.util.Random;
import java.util.Scanner;

public class TypingPractice {
   public static void main(String args[]) {
     //Declares variables 
     int total = 0;
     int correct = 0;
     int incorrect = 0;
     long startTime, endTime;
     long timeElapsed = 0; 

     System.out.println("Welcome to typing practice!");
     System.out.println("When you see a letter displayed on the screen, type the same letter on your keyboard. Lets see how much you can score in one minute!");
     Random rnd = new Random();
     Scanner sc = new Scanner(System.in);

     startTime = System.currentTimeMillis();

     //Take the start time
     while (timeElapsed / 1000 <= 60) {

     // print random character
     char c = (char) ('a' + rnd.nextInt(26));
     System.out.println("Please input: " + c);


     // Character input
     char ch = sc.next().charAt(0);

     if(ch==c)
     
     correct++;

     else

     incorrect++;

     //Take ending time and calculate elapsed time   
     endTime = System .currentTimeMillis();
     timeElapsed = endTime - startTime; 

}

     total=correct+incorrect;
     System.out.println("Number of correct entries "+correct);
     System.out.println("Number of incorrect entries "+incorrect);
     System.out.println("Total number of letters typed "+total);


   }

}