package Patterns;
/*
* * * * *
* * * *
* * *
* *
*
   here row no == star print
 */
import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=n; i>=1; i--){ // loop for row traversing

             for(int j=1; j<=i; j++){

                 System.out.print("* ");
             }
             System.out.println("");
         }

    }
}
