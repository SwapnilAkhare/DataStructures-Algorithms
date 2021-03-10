package Puzzle;

public class NextGreaterInteger {

    // find out next greater integer in O(n) complexity

    public static void main(String[] args) {

        int num = 1318540;
        System.out.println(nextGreater(num));
    }
     // create a function of next greater num which returns num which is integer
    private static int nextGreater(int num) {

        // we have to create array ... we convert int to string and then it to array
        char[] digits = String.valueOf(num).toCharArray();

        // now declare i as second last element in our number bcoz we compare it with i+1 ..and see the ascending
        int i = digits.length - 2;

        // create while loop to compare i and i+1 digits for ascending oerder and if it breakes then stop .
        while(i>=0 && digits[i]>=digits[i+1])
        {
            i--; // decrement i until break ascending order
        }
        if(i == -1) // breaker is not found.. i.e  acending order follow then the num we give itself is gretaer
            return num;
        //now we swap the digit i(where breaker found) with j which loops from last digit and decrement until gretaer num than i is found
        int j = digits.length-1;

        while (digits[j]<=digits[i]) {
            j--;
        }
       // swapping code
       char temp = digits[j];
        digits[j] = digits[i];
        digits[i] = temp;
        // now we have to reverse the last four digits
         int Left= i + 1, Right = digits.length-1;
         while(Left < Right){
          // swapping code
              temp = digits[Left];
              digits[Left] = digits[Right];
              digits[Right] = temp;
             Left++;
             Right--;
         }
         // converts array to int value becoz we  have to return int value
         return Integer.parseInt(String.valueOf(digits));
    }
}
