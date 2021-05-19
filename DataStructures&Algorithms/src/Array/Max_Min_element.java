package Array;
// print the max and min element from user given array

import java.util.Scanner;

public class Max_Min_element {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;  // initialize max and min value

        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){

            if(arr[i]>max){

                max=arr[i];
            }
            if(arr[i]<min){

                min=arr[i];
            }
        }
            System.out.println("max no in array is" +max );
        System.out.println("min no in array is" +min);
    }
}
