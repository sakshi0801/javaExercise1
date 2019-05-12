/*
 * created by sakshi
 * date 9/5/19
 * This program is used to reverse a string
 */
package javaPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter string ");
        String inString = sc.nextLine();
        String revString = "";

        //This computes the reverse string
        for (int flag = inString.length()-1 ; flag >= 0; flag--) {
            revString = revString + inString.charAt(flag);
        }
        System.out.print(revString);
    }
}
