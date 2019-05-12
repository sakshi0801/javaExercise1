/*
 * created by sakshi
 * date 9/5/19
 * This program is used to print series 1223334444.. and so on
 */
package javaPractice;

import java.util.Scanner;

public class LoopSeries {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of iterations");
        int inVal = sc.nextInt();

        //This prints the elements for each iteration
        for (int flag1 = 1 ; flag1 <= inVal ; flag1++) {
            for (int flag2 = flag1 ; flag2 >= 1; flag2--) {
                System.out.print(flag1);
            }
        }
    }
}
