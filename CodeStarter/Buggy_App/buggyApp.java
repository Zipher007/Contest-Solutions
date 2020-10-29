import java.util.*;

public class Solution {
    
    static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int num = sc.nextInt();
        while(true) {
            num = digitSum(num);
            if(mm + 15 >= 60) {
                hh++;
                mm = 15 - (60 - mm);
            } else {
                mm += 15;
            }
            if(hh > 23) {
                System.out.println("ERROR");
                break;
            }
            if(num < 10) {
                System.out.printf("%02d %02d", hh, mm);
                break;
            }
        }
    }
}
