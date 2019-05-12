/*
* created by sakshi
* date 9/5/19
* This program is used to find whether the input character is a digit,
* capital letter,lower case letter or a special symbol
 */
package javaPractice;

import java.util.Scanner;

public class CharacterTest {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character :");
        String input = sc.nextLine();

        //this checks whether a input is a single character or not
        //if not, then take input again
        while(input.length () >1) {
            System.out.println("Enter single character ");
            input = sc.nextLine();
        }
        char inVal = input.charAt(0);

        // This checks if the character lies in between the range of a digit
        if(inVal >= 48 && inVal <= 57)
            System.out.println("digit");

        // This checks if the character lies in between the range of a capital letter
        else if(inVal >= 65 && inVal <= 90)
            System.out.println("capital letter");

        // This checks if the character lies in between the range of a lower case letter
        else if(inVal >= 97 && inVal <= 122)
            System.out.println("lower case letter");

        // This specifies a special symbol
        else
            System.out.println("special symbol");
    }
}
