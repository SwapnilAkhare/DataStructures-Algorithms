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



        public static void main(String[] args) {


            // given array
            int[] A = {12,3,5,1,9};

            // given sum
            int Sum= 10;

            // create function to find pair
            findPair(A,Sum) ;


        }
    }

