package Array;

import java.util.Scanner;

public class LongestArithmeticSubarray {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the element ");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

          int ans=2 ;  // store the length of longest  array

        int pd=arr[1]-arr[0]; // pd= previos common difference

        int currLength = 2;

        int j=2; //hame ab array index 2 se iterate krna padega;

        for(int i=j;i<size;i++){

            if(pd==arr[i]-arr[i-1]){

                currLength++;
            }
            else{
                pd=arr[i]-arr[j-1]; //update pd

                currLength=2; // update currentlength
            }

            ans= Math.max(ans,currLength);  // compare length of array

            j++;  // incr j
        }
        System.out.println(ans);



    }

}
