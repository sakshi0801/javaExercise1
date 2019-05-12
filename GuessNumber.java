/*
 * created by sakshi
 * date 9/5/19
 * This program is used to take a number from user that tell whether the guessed number
 * is equal to original number or not.If not then specify, whether it is greater or
 * smaller than the original number. The input is taken from the user until the original number is guessed.
 */
package javaPractice;

import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args) {
        int originalNum = 40;
        int inVal = 0;
        Scanner sc = new Scanner (System.in);

        //This will take input from user and specify whether it is more, less or equal to original
        do{
            System.out.println("Enter any number between 1-50");
            inVal = sc.nextInt();
            if(inVal >= 1 && inVal <= 50)
            {
                if(inVal > originalNum){
                    System.out.println("Number guessed is more than original number");
                }
                else if(inVal<originalNum){
                    System.out.println("Number guessed is less than original number");
                }
                else {
                    System.out.println("Number guessed matches the original number");
                    break;
                }
            }
        }while (inVal!=originalNum);
    }
}
