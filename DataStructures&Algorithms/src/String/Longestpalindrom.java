/*
 given a string we have to find longest  substring which is palindromic
  if there are two or more string of same length which is palindrom
  then any one of them will return .. even a sigle character is a palindrome substring

 */


package String;

import java.util.Scanner;

public class Longestpalindrom {

    // function expand which take input a given string and set two pointer int high,low
    // and expand in both direction from midpoint till palindrom found
    public static String expand(String s,int low ,int high){

        // find length of string
        int len = s.length();

        // loop to check string is palindrom
        // here low and high position are from midpoint to ri8 and left
        while (low>=0 && high<len && (s.charAt(low) == s.charAt(high)))
        {
            low--;
            high++;
        }
        // return that substring which occur at (low,high)
        // as we inr high and decr low we return low + 1 and high
        return s.substring(low+1,high);


    }

    // function to find longest palindromic substring whic input take string
    // and its length to compare the length with find substring
    public static String findLongestPalindromeSubstring(String s, int len){

        // variable to store max len palindromic substring
        // "" .. means string at start is empty
        String max_str= "",curr_str;

        // variable to store max len of palindromic substring
        // 0 means at start len is 0
         int max_len=0,curr_len;

         // now string can have length EVEN and ODD so
        // EVEN has two midpoint ans ODD has one midpoint
        //so we have to check both condition of even and odd


        //and now we have to take midpoint at every charachter
        //in string one by one and check palindromic substring
        // so loop will take one by one character from string and set it as midpoint
        for (int i=0; i < len; i++)
        {
            //find longest odd length palindrome str[i] as midpoint
            //as length is odd high and low pointer is at same position i(which is midpoint)
            // (s,i,i) bcoz same position pointer high and low at midpoint
           curr_str = expand(s,i,i);
           curr_len = curr_str.length();

           //update the substring and length of substring

            if ( curr_len > max_len ){

                max_len = curr_len;
                max_str = curr_str;
            }

            // now find even length longest palindrom Str[i] and str[i+1] as midpoint
            // as length is even there are two midpoint position of low and high  at str[i] and str[i+1]
            //(s,i,i+1) bcoz two pos of two pointer high and low
             curr_str = expand(s,i,i+1);
             curr_len = curr_str.length();

             //update the substring and its length

            if (curr_len > max_len )
            {
                max_str = curr_str;
                max_len = curr_len;
            }
        }
        return max_str;
    }
     public  static void main(String [] args){
        String s;
        // take input string from user
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string : ");
          s = sc.nextLine();

          System.out.println(" the longest palindromic substring of " + s + " is "
          + findLongestPalindromeSubstring(s,s.length()-1));

     }
}
