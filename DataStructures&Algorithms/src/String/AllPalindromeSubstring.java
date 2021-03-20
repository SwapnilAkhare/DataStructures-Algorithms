// Given String we have to find all possible  palindromic substring
//for ex
//  input   :      String s= "google"
//  output  :    [g,o,l,e,oo,goog]
//
//


package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllPalindromeSubstring {

    // check whether given string palindrome or not
    // by midpoint method.. i.e consider each character as midpoint
    // one by one and expand pointer inboth direction
    public static void expand(String s,int low,int high,Set<String> set){

        while(low>=0 && high<s.length() && (s.charAt(low) == s.charAt(high)))
        {
            // Add substring to empty set
            set.add(s.substring(low,high + 1));

            // expand in both direction
                low--;
                high++;
        }

    }
    // func to find all unique palindromic substring
    public static void allPalindromicSubString(String s){

        // create an empty set to store substring
        Set<String> set = new HashSet<>();

        for(int i=0; i <s.length();i++){

            // find all odd length palindrom with s[i] as midpoint
            expand(s,i,i,set);

            //find all even length palindrom with s[i] and s[i+1]
            expand(s,i,i+1,set);
        }
        // print set
        System.out.println(set);
    }


    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the string :");
        s = sc.nextLine();

        // calling function
        allPalindromicSubString(s);

    }
}