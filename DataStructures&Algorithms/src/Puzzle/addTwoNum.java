/* ADD TWO NUMBER WITHOUT USING ADDITION OPERATOR

 */

package Puzzle;

import java.util.Scanner;

public class addTwoNum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be added :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a -(-b);
     System.out.println(c);
    }


}
