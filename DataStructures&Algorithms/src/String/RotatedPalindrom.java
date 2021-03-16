
//Problem statement:  GIVEN A STRING ,CHECK IF IT IS A ROTATED PALINDROM OR NOT

// for example
//CBAABCD is a roated palindrom ,as it is a rotation of palindrom ABCDCBA
//BAABCC is a roated palindrom ,as it is a rotation of palindrom  ABCCBA


// TIME COMPLEXITY O(N^2)
package String;

public class RotatedPalindrom {

    public  static boolean isPalindrom(String str,int low,int high){

        return (low >= high) || (str.charAt(low)==str.charAt(high) && isPalindrom(str,low +1,high - 1));
    }

    public static boolean isRotatedPalindrom(String str){

        int n = str.length();

        for(int i=0; i < n; i++){

            str=str.substring(1) + str.charAt(0);
            if(isPalindrom(str,0,n-1)){
                return true;
            }
        }
          return false;

    }

    public static void main(String[] args){

        // given string to be rotated
        String str="ABCDCBA";

        //
        str = str.substring(2) + str.substring(0,2);

        if(isRotatedPalindrom(str)){

            System.out.println("THE STRING IS ROTATED PALINDROM ");
        }
        else{

            System.out.println("THE STRING IS NOT A ROTATED PALINDROM");
        }
    }
}
