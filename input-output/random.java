import java.util.Scanner;

public class random {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int c =0;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                for(int j = x;j>0;j/=10){
                    c++;
                }
                if(c<3){
                    System.out.println(s1+"\t\t0"+x);   
                }else System.out.println(s1+"\t\t"+x);//Complete this line
            }
            System.out.println("================================");
            sc.close();
    }
}



