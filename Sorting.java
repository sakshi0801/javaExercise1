/*
 * created by sakshi
 * date 9/5/19
 * This program is used to sort the number in non increasing order, compute the sum
 * of even numbers and check if the sum is more than 15 then print yes otherwise no
 */
package javaPractice;

import java.util.Scanner;

public class Sorting  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int inVal = sc.nextInt();
        int count = 0;
        int tempCount = inVal;

        //this count the number of digits in the inVal
        while(tempCount != 0) {
            tempCount = tempCount / 10;
            count++;
        }
        tempCount = inVal;
        int[] inArr = new int[count];

        //store each digit in inArr
        for(int flag = 0 ; flag < count ; flag++) {
            inArr[flag] = tempCount % 10;
            tempCount = tempCount / 10;
        }

        //sort the digits in non-increasing order
        for(int flag = 0; flag < count - 1 ; flag++){
            int high = flag;
            for(int flag2 = flag + 1 ; flag2 < count ; flag2++)
            {
                if(inArr[flag2] > inArr[high]){
                    high = flag2;
                }
            }
            int temp = inArr[flag];
            inArr[flag] = inArr[high];
            inArr[high] = temp;
        }
        System.out.print("Sorted number in non-increasing order: ");
        for(int flag = 0 ; flag < count ; flag++) {
            System.out.print(inArr[flag]);
        }
        System.out.println();

        //compute the sum of even digits
        int sum = 0;
        for(int flag = 1 ; flag < count ; flag += 2){
            sum = sum + inArr[flag];
        }
        System.out.println("Sum of even numbers: " + sum);

        // check if the sum is more than 15 or not
        if(sum > 15){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
