// given binary array containing 0's and 1's  we have to sort it i.e place 0's at start and then 1's
// input;
//int[] A={1,0,0,1,1,0,0,1,1}
//output;
//int [] A = {0,0,0,0,1,1,1,1,1}

// TIME COMPLEXITY O(N)
package Array;

public class sortBinaryArray {

    public static void main(String[] args) {
        int[] A = new int[]{1, 0, 1, 0, 1, 0, 0, 1};
        // pointer i start at left
        int i = 0;
        // pointer j from end decrement
        int j = A.length - 1;

        // index of i < index of j
        while (i < j) {

            //  if aarray element is 0 then remain it as it is and traverse next
            if (A[i] == 0) {

                // increment position of index i
                i++;
            }

            // if array element is 1 then remain as it is traverse before
            if (A[j] == 1) {
                // decrement position of index j
                j--;
            }

            // if at index i element is 1 and index j element 0 ....
            // and index of i is less than index of j
            if (A[i] > A[j] && i < j) {
              // swap the element of index i and j
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                // after swapping increment position of index i and
                // decrease pos of index j ..as swapping done at this position
                i++;
                j--;
            }
        }

         //for every value in array A
        for (int value: A) {
            System.out.println(value);
        }

    }
}
