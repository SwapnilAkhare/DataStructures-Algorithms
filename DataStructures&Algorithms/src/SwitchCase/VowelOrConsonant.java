package SwitchCase;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet:");
        String  s=sc.next();
        switch(s){
            case "a":
                System.out.println("it is a vowel");
                break;
            case"e":
                System.out.println("it is a vowel");
                break;
            case"i":
                System.out.println("it is a vowel");
                break;
            case"o":
                System.out.println("it is a vowel");
                break;
            case"u":
                System.out.println("it is a vowel");
                break;
            default:
                System.out.println("it is a consonant");
                break;
        }

    }

}
