import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- PROFIT AND LOSS CALCULATE -----");
        System.out.print("Enter the Cost price = ");
        int cp=sc.nextInt();
        System.out.print("Enter the Selling price = ");
        int sp=sc.nextInt();
        if(cp<sp){
            System.out.println("seller made PROFIT = "+(sp-cp)+" ruppes");
        }else if(cp>sp){
            System.out.println("seller incurred LOSS = "+(cp-sp)+" ruppes");
        }else{
            System.out.println("seller made neither profit or loss");
        }
        
    }
}
