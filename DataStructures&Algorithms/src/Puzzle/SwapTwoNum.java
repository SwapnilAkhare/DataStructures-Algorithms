
// Swap two number without using third variable
//for ex x=1;y=2;
  //  x = x + y = 1 + 2 = 3
//    y = x - y = 3 - 2 = 1
 //   x = x - y = 3 - 1 = 2
// so as u see now x=2;y=1

package Puzzle;

import java.util.Scanner;

public class SwapTwoNum {

    public static void main(String[] args){

        // taking input from user value of x and y
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of x and y");

       int  x=sc.nextInt();
       int  y=sc.nextInt();

        //before  swapping
        System.out.println("Before swapping x:" +x + "\t y :" +y );

        //Swapping

        x = x + y;
        y = x - y;
        x = x - y;

        // after swapping
        System.out.println("After swapping x :" +x + "\t y :" +y);
    }
}
