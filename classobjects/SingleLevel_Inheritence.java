//single level inheritance
import java.util.Scanner;
class A {
        int n,rev=0,x;
        public void input()
        {
            Scanner ob =new Scanner(System.in);
            System.out.print("Enter the no. = ");
            n=ob.nextInt();
            ob.close();
        }
        public void reverse()
        {
           for(x=n;n>0;n=n/10)
           {
              rev=rev*10+n%10;
           }             
        }
}
class SingleLevel_Inheritence extends A
{
    int s=0,p=1;
    public void check()
    {
        if(rev==x)
          System.out.println(x+" is palindrome No.");
        else
          System.out.println(x+" is NOT palindrome No.");
    }
    public void spy()
    {
         for(n=x;n>0;n=n/10)
         {
            s=s+n%10;
            p=p*n%10;
         }
         if(s==p)
            System.out.println(x+" is Spy No. ");
         else
            System.out.println(x+" is NOT Spy No. ");
    }
    public static void main(String[] args) {
        SingleLevel_Inheritence ob =new SingleLevel_Inheritence();
        ob.input();
        ob.reverse();
        ob.check();
        ob.spy(); 
    }    
}