/*
 * created by sakshi
 * date 9/5/19
 * This program is used to take number of inputs from user and return sum
 */
package javaPractice;

import java.util.Scanner;

public class VariableLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int count = sc.nextInt();
        System.out.println("Enter numbers");
        int sum = 0;

        //take inputs and compute sum
        for(int flag = 0 ; flag < count ; flag++)
        {
            sum = sum + sc.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
