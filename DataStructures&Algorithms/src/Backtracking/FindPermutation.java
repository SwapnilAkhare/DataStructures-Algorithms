package Backtracking;

import java.util.Scanner;
import java.io.*;

public class FindPermutation {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          printPermutation(s,"");

    }

    // asf = string as so far
    public static void printPermutation(String ques, String asf){

        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){

            char ch= ques.charAt(i);
            // qlpart = question string left part
            String qlpart= ques.substring(0,i);
            // ri8 part
            String qrpart= ques.substring(i+1);
            // roq = rest of the question
            String roq   = qlpart + qrpart;
            printPermutation(roq,asf + ch);
        }
    }


}
