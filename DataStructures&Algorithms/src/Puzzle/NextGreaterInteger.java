package Puzzle;

public class NextGreaterInteger {

    // find out next greater integer in O(n) complexity

    public static void main(String[] args) {

        int num = 1318540;
        System.out.println(nextGreater(num));
    }

    private static int nextGreater(int num) {

        // array is created
        char[] digits = String.valueOf(num).toCharArray();

        // i is defined
        int i = digits.length - 2;

        //while loop
        while(i>=0 && digits[i]>=digits[i+1])
        {
            i--;
        }
        if(i == -1) // breaker is not found
            return num;

        int j = digits.length-1;
        while (digits[j]<=digits[i]) {
            j--;
        }

       char temp = digits[j];
        digits[j] = digits[i];
        digits[i] = temp;

         int Left= i + 1, Right = digits.length-1;
         while(Left < Right){

              temp = digits[Left];
              digits[Left] = digits[Right];
              digits[Right] = temp;
             Left++;
             Right--;
         }

         return Integer.parseInt(String.valueOf(digits));
    }
}
