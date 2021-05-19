package Array;

import java.util.Scanner;

public class LinearSearchArray {


    static int LinearSearch(int [] arr,int size,int key){

        for(int i=0;i<size;i++){

            if(arr[i]==key){

                return i; // return the index no
            }
        }
        // return -1 if key does not match any of the element
        return -1;
    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("enter the element ");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("enter the  value of key to find in array");

        int key=sc.nextInt();

        System.out.println("key is found at index value " +LinearSearch(arr,size,key));
    }
}
