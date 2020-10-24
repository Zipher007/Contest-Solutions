import java.util.Scanner;

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);                  
// created a scanner object 'sc' to take input from user.

System.out.println("Enter the value of n : ");
int n = sc.nextInt();
        
for (int i = 0; i <= n; i++) {                                         // this loop will run for ith rows.

     for (int j = 0; j <= i; j++) {                                  // this loop will print 'i' stars for the ith row.

          System.out.print("* ");                                  // used 'print' here to print the stars in same line.
          
         }
         
      System.out.println();
      
        /* every time after iteration of the star printing inner loop, the next iteration
           of printing the stars will be in a new line..  So used 'println' here . */                                                                     
     }                                                                    

}
                                                                        

