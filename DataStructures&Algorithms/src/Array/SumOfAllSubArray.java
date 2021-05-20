package Array;

import java.util.Scanner;

public class SumOfAllSubArray {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("enter the element in array");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }
        int sum=0;
        int currSum;
        for(int i=0;i<size;i++){

             currSum=0;
            for(int j=i;j<size;j++){

                currSum += arr[j];
                System.out.println("sum of all subarray is" +currSum);

            }

        }

    }
}
