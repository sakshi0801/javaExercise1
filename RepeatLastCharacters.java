/*
 * created by sakshi
 * date 9/5/19
 * This program is used to take a string and number of last characters to repeat from user
 */
package javaPractice;

import java.util.Scanner;

public class RepeatLastCharacters {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter string ");
        String inString = sc.nextLine();
        System.out.println("Enter number of last characters to be repeated ");
        int inVal = sc.nextInt();

        //This computes the substring to be repeated
        String repeat = inString.substring (inString.length()-inVal, inString.length());
        System.out.print(inString);

        for(int flag = 1 ; flag <= inVal ; flag++){
            System.out.print(repeat);
        }
    }
}
