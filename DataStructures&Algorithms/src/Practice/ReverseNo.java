package Practice;
//reverse a no example 234.... 432

import java.util.Scanner;

public class ReverseNo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int reverse=0;
        while(n>0){
            int lastdigit=n%10;
            reverse=reverse *10 + lastdigit;
            n=n/10;
        }
        System.out.println(reverse);


    }
}
