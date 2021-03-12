package Array;

//  Given an Unsorted integer array find the pair with given sum in it
// for Ex-
// Input
    //      arr = [8, 7, 2, 5, 3, 1]
    //            sum = 10
//
    //               Output:
//                 Pair found at index 0 and 2 (8 + 2)
    //                or
    //               Pair found at index 1 and 4 (7 + 3)

//   TIME  COMPLEXITY  O(N^);

import java.util.*;

public class SumArray {

        //Naive MEthod to find a pair in an array with given sum in it
        public static void findPair(int[] A, int Sum)
        {
            // we create loop Except last element
            for(int i=0; i < A.length - 1;i++)

            {
                // we create loop from next element pointed by i that is i+ 1 element till last element

                for(int j=i+1; j < A.length; j++ )
                {
                    // now if element from i loop and element from j loop can form given sum then print it with index num
                    if(A[i] + A[j] == Sum)
                    {
                        // index ouput with given sum
                        System.out.println("Pair found at index "+ i +" And "+ j);

                        // return index num
                        return;
                    }
                }
            }

            // outside for loop if pair doesn't exist
            System.out.println("Pair not found");

        }

            // TIME COMPLEXITY NLOG(N)
        public static void findPairSort(int[] A,int Sum )
        {
            // sort method of array to sort array in ascending order
            Arrays.sort(A);

            // maintain two indices pointing to start and endpoint array
            int Start = 0 ;
            int End  = A.length -1 ;

            //reduce the search space A[Start..End] at each iteration of loop
            // loop till the search space is exausted
            while( Start <= End)
            {
                if(A[Start] + A[End] == Sum)
                {
                    // Sum Found
                    System.out.println("pair is Found at index " + Start + " and " + End);
                    return;
                }
                 // increment "Start" if the total is less than desired Sum
                // Decrement "End" if the total is more than desired sum

                if(A[Start] + A[End] < Sum)
                {
                    Start++;

                }else {
                    End--;
                }

            }
            System.out.println("pair not found");

        }



           // TIME COMPLEXITY O(N)

        public static void findPairHashing(int[] A,int Sum){

          // create an empty hashmap
            HashMap<Integer,Integer> s = new HashMap<>() ;

            // do for each elment
            for(int i=0; i < A.length; i++){

                // check if pair (A[i], sum  -  A[i]) exxist
                // if the difference is seen before then print the pair

                if(s.containsKey(Sum - A[i])){
                    
                    System.out.println("the pair at index" +s.get(Sum - A[i]) + " and " + i);
                    return;
                }

                // store index of current element in map
                s.put(A[i],i);
            }
                  //  we reach here if pair is not found
            System.out.println(" pair not found");

        }

        public static void main(String[] args) {


            // given array
            int[] A = {3,12,5,1,9};

            // given sum
            int Sum= 10;

            // create function to find pair with O(n^) complexity
            findPair(A,Sum) ;
            // create  function to find pair with nlog(n) complexity(Sorting)
            findPairSort(A,Sum);

            // create function to find pair with O(n) complexity(Hashing)
            findPairHashing(A,Sum);
        }
    }

