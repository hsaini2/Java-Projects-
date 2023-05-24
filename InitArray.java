// Initializing the elements of an array.

public class InitArray {
   public static void main( String[] args ) {
      // 1. create the array object, and assign values
      //int [] nums = new int[10];
      //nums[0] = 8;
      //nums[5] = 9;
      
      // 2. initialize
      int [] nums = {5, 5, 7, 8, 9, 10, 2, 3, 4, 5};
      
      /* 3. Assign calculated values to the array elements: even numbers starting from 2.
      for(int i = 0; i < nums.length; i++){
         nums[i] = 2 + 2 * i;
      }
      
      /* 4. Assign random numbers to the array elements
      for (int 1 = 0; 1 < nums.length; 1++) {
         nums[1] = (int)(Math.random() * 11);
      }      
      */      
      // print column headings
      System.out.println("Element\t\tValue" ); 
   
      // output each array element's index and value 
      for ( int i = 0; i < nums.length; i++ )
         System.out.printf("Index %d: \t %d\n", i, nums[i]);    
      
      
      System.out.println("This array has " + nums.length + " elements. ");
      // 5. Calculate total
      int sum = 0;
      for(int i = 1; i <nums.length; i++){
         sum = sum + nums[i]; 
      }
      System.out.println("Sum of the elements of the array: " + sum);

      // 6. Find the largest value
      int largest = nums[0];
      for(int i = 1; i <nums.length; i++){
         if (nums[i] > largest)
         largest = nums[i];
      }
   System.out.println("The largest value is " + largest + ".");
   
   } 
} 

