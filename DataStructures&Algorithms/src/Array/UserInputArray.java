package Array;

import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int[] arr=new int[size];  // array declarartion in c/cpp is.. int arr[]

        for(int i=0;i<size;i++) {

            arr[i] = sc.nextInt(); // read input from user
        }

        // print the user array
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]);

            System.out.print(" ");

        }
    }
}
