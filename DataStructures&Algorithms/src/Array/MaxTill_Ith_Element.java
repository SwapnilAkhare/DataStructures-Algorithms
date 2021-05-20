package Array;

import java.util.Scanner;

public class MaxTill_Ith_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter the element of array");

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {

            max = Math.max(max, arr[i]);


            System.out.println("maximum no till" + i + "is" +max);
        }
    }
}