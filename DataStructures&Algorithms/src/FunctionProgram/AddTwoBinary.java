package FunctionProgram;

import java.util.Scanner;

public class AddTwoBinary {

    static int reverse(int n){

        int  rev=0;
        while(n>0){

            int lastdigit = n%10;

            rev= rev * 10 + lastdigit;

            n=n/10;
        }
        return rev;
    }

    static int addBinary(int a,int b){

        int ans=0;

        int prevCarry=0;

        while(a>0 && b>0){

            // first case when both a and b are 0
            if(a%2==0 && b%2==0) {

                ans = ans * 10 + prevCarry; //mnje prevcarry jo asel toch ans rahil

                prevCarry = 0; //update prevcarry=0  as no carry generate
            }

            // second case if  1 and 0
            else if((a%2==1 && b%2==0) || (a%2==0 && b%2==1)){

                if(prevCarry==1){

                    ans = ans * 10 + 0;

                    prevCarry=1;
                }
                else{

                    ans=ans*10 + 1;

                    prevCarry=0;
                }
            }

            // third case when both are 1  if prevcarrry = 1 or 0...  ans=0/1 and prev carry =1
            else {

                ans = ans*10 + prevCarry;
                prevCarry=1;
            }
            // now update a and b
            a=a/10;
            b=b/10;
        }

        // now if a remain and b ends then we have to take care of a
        while(a>0) {

            if (prevCarry == 1) {

                if (a % 2 == 0) {

                    ans = ans * 10 + 1;
                    prevCarry = 0;
                } else {

                    ans = ans * 10 + 0;
                    prevCarry = 1;
                }
            }

                //if prevcarry ==0
            else{
                    ans = ans * 10 + (a % 2);
                }

                a = a / 10; //update a


        }

            // now if b remains and a ends thenn sam efor b as a
            while(b>0) {

                if (prevCarry == 1) {

                    if (b % 2 == 0) {

                        ans = ans * 10 + 1;
                        prevCarry = 0;
                    } else {

                        ans = ans * 10 + 0;
                        prevCarry = 1;
                    }
                }
                    //if prevcarry ==0
                else
                    {
                        ans = ans * 10 + (b % 2);
                    }
                      b=b/10;
                }

                // now if length of both number is equal so at last carry will remain so for that
                if(prevCarry==1){
                    ans=ans*10 + 1;
                }

                //now we got ans in reverse order so we habe to reverse it

                ans=reverse(ans);

            return ans;

        }

        public static void main(String[] args){

            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();

            int result=addBinary(a,b);
            System.out.println(result);

        }
}
