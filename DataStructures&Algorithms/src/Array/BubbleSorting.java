package Array;

//BUBBLE SORT : repeatedly swap two adjacent element if they are in wrong order

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();

        int[] arr=new int[size];

        System.out.println("enter the element in array");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        int iteration= 1;

        while(iteration<size){    // we have to sort array upto.. size-1

            for(int i=0; i<size-iteration; i++){

                if(arr[i]> arr[i+1]){

                    // swap

                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }

            iteration++; // update iteration
        }

                // to print sorted array
        for(int i=0;i<size;i++){

            System.out.print(arr[i]  +" ");
        }
    }
}
