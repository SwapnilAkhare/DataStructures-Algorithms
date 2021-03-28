// sort an array of zeros ,ones and two using simple counting
// TIME COMPLEXITY O(N)



package Array;

public class DutchNtionalFlag {

        public static void sort(int[] arr) {

            int zeroCount = 0;
            int oneCount = 0;

         /*
           Traverse an array and count
           number of zero and one present
           in an array.
         */
            for (int i = 0; i < arr.length; i++) {

              /*
               If value is zero,
               increment the value of zeroCount variable.
              */
                if (arr[i] == 0)
                    zeroCount++;

             /*
               If value is one,
               increment the value of oneCount variable.
              */
                if (arr[i] == 1)
                    oneCount++;
            }

            //Put the zero's first in an array

            for (int i = 0; i < zeroCount; i++) {
                arr[i] = 0;
            }

            //After zero, put 1's in an array
            for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
                arr[i] = 1;
            }

            //Rest put 2's in an array
            for (int i = (zeroCount + oneCount); i < arr.length; i++) {
                arr[i] = 2;
            }
        }

        public static void main(String[] args) {

            int[] arr = { 0, 1, 1, 0, 1, 2, 0, 1, 2 };

            //Call sort method to sort an array
            sort(arr);

            //Traverse an array and print the sorted result
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

