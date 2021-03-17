/*
Problem statement:  GIVEN A STRING ,CHECK IF IT IS A ROTATED PALINDROM OR NOT
 for example:
CBAABCD is a roated palindrom ,as it is a rotation of palindrom ABCDCBA
BAABCC is a roated palindrom ,as it is a rotation of palindrom  ABCCBA

 TIME COMPLEXITY IS O(N^2)... BECOZ HERE WE COMPARING TWON STRING
  AND EACH STRING HAVE N-1 PARTITION.THEREFORE N*N
 */


package String;

public class RotatedPalindrom {

    // Method to check whether given string is palindrom or not
    public  static boolean isPalindrom(String str,int low,int high){

     // here recursion is used .
        return (low >= high) || (str.charAt(low)==str.charAt(high) && isPalindrom(str,low +1,high - 1));
    }
       // input a string and check is rotated palndrom or not
    public static boolean isRotatedPalindrom(String str){

        // we get length of string
        int n = str.length();

        //loop for rotate string
        for(int i=0; i < n; i++){

            // substring is method of string class..substring(1) means from index 1 to end of string
            // + charat(0) ..means 1st character of string
            str=str.substring(1) + str.charAt(0);

            // now that new roated str is check if if it is palindrom
            if(isPalindrom(str,0,n-1)){
                return true;
            }
        }
          return false;

    }

    public static void main(String[] args){

        // given string to be rotated
        String str="ABCDCBA";

        //string we want to check....DCBAABC
        str = str.substring(2) + str.substring(0,2);

        // CHECK str in this functioon
        if(isRotatedPalindrom(str)){

            System.out.println("THE STRING IS ROTATED PALINDROM ");
        }
        else{

            System.out.println("THE STRING IS NOT A ROTATED PALINDROM");
        }
    }
}
