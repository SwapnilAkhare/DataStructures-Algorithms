package SwitchCase;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("entwer the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        System.out.println("enter the operator:");
        String op= sc.next();
        switch(op) {

            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default :
                System.out.println("enter another operator");
                break;
        }
    }
}