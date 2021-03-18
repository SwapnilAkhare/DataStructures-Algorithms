/* ADD TWO NUMBER WITHOUT USING ADDITION OPERATOR
 */

package Puzzle;

import java.util.Scanner;


import static java.lang.Math.log;
import static java.lang.Math.exp;

public class addTwoNum{
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be added :");
        a=sc.nextInt();
        b=sc.nextInt();
        //using substraction operator
        c=a-(-b);
     System.out.println(c);
     // using logarithm
     System.out.println(log(exp(a) * exp(b)));

     // we can use repeated addition/ substraction operator
      while(a>0){
          b++;
          a--;
      }
      while(a<0){
          a++;
          b--;

      }
      System.out.println(b);


    }
}






