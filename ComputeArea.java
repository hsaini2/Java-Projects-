/*

MIS350 
ICE 3 
9/6
Harshil Saini
This program computes area of circles

*/

//Program uses class scanner
import java.util.Scanner;
public class ComputeArea {
   public static void main(String[] args) {
   //Creates scanner object
   Scanner input = new Scanner(System.in);
    
   //Declare variables
   double area;
   double radius; 
   final double PI = 3.1415926;
    
   //User input the radius of a circle.
   System.out.println("Please enter the radius of circle: ");
   radius = input.nextDouble();   
     
   //Compute area
   area = radius * radius * PI;

   //Display results
   System.out.printf("The area for the circle of radius %f is %f, \n", radius, area); 
  }
 
}
