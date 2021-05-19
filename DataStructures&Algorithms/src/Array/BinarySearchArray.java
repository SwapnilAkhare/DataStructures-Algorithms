package Array;

import java.util.Scanner;

public class BinarySearchArray {

    static int BinarySearch(int arr[],int size,int key){

        int start=0;     // represent the start pointer

        int end=size;  // represent the end pointer  to search the midpoint number in our array

         while(start <= end){

             int mid = (start+end)/2;

             if(arr[mid]== key){

                 return mid;
             }
             else if(arr[mid] < key){

                 start = mid + 1;
             }
             else {

                 end = mid - 1;
             }

         }
         return -1; // if not found
    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("enter the element of array");

        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key element");

        int key=sc.nextInt();

        System.out.println("the key is found at index  "+BinarySearch(arr,size,key));
    }
}
