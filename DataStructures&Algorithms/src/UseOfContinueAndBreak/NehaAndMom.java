package UseOfContinueAndBreak;

// if neha mom allows neha to go out on odd days and if neha pocketmoney is over she cant go outside


public class NehaAndMom {
    public static void main(String[] args){

        int PocketMoney=3000;
        for(int date=1; date<=30;date++)
        {
            if(date%2==0){
                continue;
            }
            if(PocketMoney==0){
                break;
            }
            System.out.println("you can go out today");
            PocketMoney=PocketMoney-300;
        }
    }
}
