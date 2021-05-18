package FunctionProgram;

import java.util.Scanner;

public class DecimalToHexadecimal {

    static int DecToHex(int num) {

        int x = 1;
        int ans = 0;

        while (x <= num) {

            x *= 16;
        }
        x=x/16;
        while(x>0){
            int lastdigit = num/x;

            num= num-lastdigit*x;

            x=x/16;

            if(lastdigit<=9){

                ans = ans *10 + lastdigit;
            }
            else if(lastdigit>='A')
            {
                ans = ans * 10 +lastdigit;
            }
        }
         return ans;

        }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int result = DecToHex(n);
            System.out.println(result);

        }
    }
