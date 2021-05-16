package Patterns;

import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n;i++){

            // for printing star
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }
            //for printing space
            int space= ((2*n)-(2*i));
            for(int j=1; j<=space;j++){

                System.out.print(" ");
            }
            //for printing star
            for(int j=1; j<=i;j++){

                System.out.print("*");
            }

            System.out.println("");
        }

        //now for half part downword same code just u have to decrement rows loop

        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){

            System.out.print("*");

            }
            int space= 2*n-2*i;
            for(int j=1;j<=space;j++){

                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
