package Array;

// given an integer array ,check if subarray give sum zero
// TIME COMPLEXITY O(N^2)
// Time complexity O(n)

import java.util.HashSet;
import java.util.Set;

public class zeroSumArray {
 // TIME COMPLEXITY O(N^2)
// function to check subarray with zero sum with O(n^2) COMPLEXITY
    public static void checkArrayBruteForce(int[] A){
 int count = 0;
        //traverse i from start to end
        for(int i = 0; i < A.length;i++){

            int sum = 0;

            for(int j=i; j<A.length; j++){

                sum = sum + A[j];

                        // if thre sum is found before we have found thre array
                if(sum == 0) {

                    System.out.println("subarray["+i + ".." + j +"]");
                    count++;
                    System.out.println("count is " +count);
                }
            }
        }

    }

    // TIME COMPLEXITY O(N)
    // function to check subaarray with given zero sum
    public static boolean checkArraySet(int[] A){


        // cretate an empty set to store sum of each

        Set<Integer> s = new HashSet<>();

          int sum = 0;

          //traverse the given array
        // for every value in array do following
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

        if(checkArraySet(A)){
            System.out.println("subarray exist");

        }else{

            System.out.println("doesn't exist");
        }
        checkArrayBruteForce(A);
    }
}
