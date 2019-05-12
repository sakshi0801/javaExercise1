/*
 * created by sakshi
 * date 9/5/19
 * This program is used to take a number as input from user,
 * if the number is between 20 and 30 and is even then print Jerry
 * else print Tom
 */
package javaPractice;

import java.util.Scanner;

public class TomJerry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int inVal = sc.nextInt();

        //check if the number is between 20 and 30
        if(inVal >= 20 && inVal < 30)
        {
            //check if the number is even or odd
            if(inVal % 2 == 0)
            {
                System.out.println("Jerry");
            }
            else {
                System.out.println("Tom");
            }
        }
        else{
            System.out.println("entered number is not between 20 and 30");
        }
    }
}
