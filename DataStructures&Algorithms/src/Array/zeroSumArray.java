package Array;

// given an integer array ,check if subarray give sum zero

// Time complexity O(n)

import java.util.HashSet;
import java.util.Set;

public class zeroSumArray {

    // function to check subaarray with given zero sum
    public static boolean checkArray(int[] A){


        // cretate an empty set to store sum of each

        Set<Integer> s = new HashSet<>();

        // insert zero to set to handle the subarray when with zero sum starting from index zer

          s.add(0);

          int sum = 0;

          //traverse the given array
        for(int value : A){

            // sum of element so fAR
              sum = sum + value;

              // if the sum is seen before we have find the subarray with sum zero
            if(s.contains(sum)){

                 return true;
            }

            // insert the sum so far into the se3t
            s.add(sum);

        }
           // we are here if no subarray exist with zero sum
        return false;
    }

    public static void main(String[] args){

        int[] A = {4,-6,3,-1,4,2,7};

        if(checkArray(A)){
            System.out.println("subarray exist");

        }else{

            System.out.println("doesn't exist");
        }
    }
}
