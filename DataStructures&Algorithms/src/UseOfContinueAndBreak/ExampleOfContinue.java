package UseOfContinueAndBreak;
//print no 1 to 100 but dont print no/3 .

public class ExampleOfContinue {

    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
