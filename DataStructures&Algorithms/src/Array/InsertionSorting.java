package Array;

// INSERTION SORT: insert an element from unsorted array to its ri8 position in sorted array

import java.util.Scanner;

public class InsertionSorting {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("enter the element in array");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        // ex- 1 3 4 5 ..this is an array so we have to consider 1 is inn soted array and from 2
        // we have to start iterating to add no in ri8 position in sorted array

        for(int i=1;i<size;i++){

            int curr=arr[i];

            int j= i-1; // j is previous element of i for comparing it with ith element

            while(arr[j] > curr && j >0){

                arr[j+1]=arr[j];

                j--; // to reduce j to j+1 - 1
            }

            arr[j+1]=curr;
        }

// print the sorted array
          for(int i=0;i<size;i++){
              System.out.print(arr[i] +" ");
          }
    }
}
