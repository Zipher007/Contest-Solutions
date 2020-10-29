// 'Free Netflix' problem in Java using built-in functions.

import java.util.Scanner;
public class FreeNetflix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer newStr = new StringBuffer(str);                                         // created a StringBuffer object, for our specified string.
        
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {                                   // checks for lowercase characters.
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));               // changes lowercase to uppercase.
            } else {
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));            // changes uppercase to lowercase.
            }
        }
        System.out.println(newStr);
    }
}
