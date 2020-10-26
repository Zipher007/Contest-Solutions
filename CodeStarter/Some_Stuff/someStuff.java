import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {                // This loop runs for the i'th rows. 
            for (int j = 1; j <= i; j++) {           // This loop will print 'i' stars corresponding to i'th row.
                System.out.print("* ");
            }
            System.out.println();                // After the completion of 1 iteration, the next one will start from a new line, so used 'println'. 
        }

    }

}
