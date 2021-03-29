package String;

public class ReverseStringRecursion {

    public static String RecursiveString(String s){

        if(s==null || s.length()<=1){

            return s;
        }
        return RecursiveString(s.substring(1)) + s.charAt(0);

    }
    public static void main(String[] args){

        String s="swapnil";
        System.out.println(RecursiveString(s));
    }
}
