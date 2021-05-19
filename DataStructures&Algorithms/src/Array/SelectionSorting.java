package Array;

// SELECTION SORT : find the minimum element in unsorted array and swap it with the beginning

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  size of array");

        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("enter the element in array");

        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        for(int i=0; i< size-1;i++){  // we have to traverse unsorted array from o to size-1

            for(int j = i+1; j<size;j++){

                if(arr[j]<arr[i]){

                    // if arr[j] i.e element at beginning is less than arr[i] then swap it
                    // with the first element in array at that position that is arr[i]

                    int temp = arr[j];
                       arr[j]=arr[i];
                       arr[i]=temp;
                }
            }


        }

        // print the sorted array
        for(int i=0;i<size;i++){

            System.out.print(arr[i]  +" ");
        }

    }
}
