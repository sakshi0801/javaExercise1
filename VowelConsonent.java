/*
 * created by sakshi
 * date 9/5/19
 * This program is used to check whether the input character is vowel or consonant.
 * if the input is not a character then print not a letter.
 */
package javaPractice;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters :");
        String inVal = sc.nextLine();

        //perform operation for every character in inVal
        for(int flag = 0 ; flag < inVal.length() ; flag++) {

            //check if the input is a character or not
            if((inVal.charAt(flag) >= 65 && inVal.charAt(flag) <= 90) ||
                    (inVal.charAt(flag) >= 97 && inVal.charAt(flag) <= 122)) {

                //check if the character is vowel or consonant
                if(inVal.charAt(flag) == 'A' || inVal.charAt(flag) == 'a' || inVal.charAt(flag) == 'E' ||
                        inVal.charAt(flag) == 'e' || inVal.charAt(flag) == 'I' || inVal.charAt(flag) == 'i' ||
                        inVal.charAt(flag) == 'O' || inVal.charAt(flag) == 'o' || inVal.charAt(flag) == 'U' ||
                        inVal.charAt(flag) == 'u') {
                    System.out.print("Vowel ");
                }
                else {
                    System.out.print("Consonant ");
                }
            }
            else {
                System.err.print("Not a letter");
                break;
            }
        }
    }
}
