/*
 * created by sakshi
 * date 9/5/19
 * This program is used to check whether the number is palindrome or not.
 * if palindrome then find sum of even numbers and check whether the sum is more than or
 * less than 25
 */
package javaPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int inVal = sc.nextInt();
        String input = inVal+"";
        int sum = 0;
        boolean check = true;

        // This checks whether the number is palindrome or not
        for(int flag1 = 0, flag2 = input.length()-1 ; flag1 < input.length()
                && flag2 > 0 ; flag1++, flag2--) {
            if (flag1 == flag2){
                break;
            }
            else if (input.charAt(flag1) != input.charAt(flag2)) {
                check = false;
                break;
            }
        }
        if(check == true) {
            System.out.println(input+" is palindrome");

            // This computes the sum of even numbers
            for(int flag = 1; flag < input.length()-1; flag += 2) {
                int num = Integer.parseInt(input.substring(flag,flag+1));
                sum= sum + num;
            }

            //This comapres the sum with 25
            if (sum < 25) {
                System.out.println("Sum of even numbers is less than 25");
            }
            else{
                System.out.println("Sum of even numbers is more than 25");
            }
        }
        else {
            System.out.println(input+" is not palindrome");
        }
    }
}
