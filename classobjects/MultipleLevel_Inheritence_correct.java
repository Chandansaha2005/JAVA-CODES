//multiple inheritance
import java.util.Scanner;
class A2
{
    int len,br,ar,pr;
    public void input()
    {
       Scanner ob =new Scanner(System.in);
       System.out.print("Enter the Length = ");
       len=ob.nextInt();
       System.out.print("Enter the Breadth = ");
       br=ob.nextInt();  
       ob.close();     
    }
    public void rect_calc()
    {
       ar=len*br;
       pr=2*(len+br);
    }
}
interface Cir
{
    public final double pi=3.14;
    public void cir_calc(double r);
}
class MultipleLevel_Inheritence_correct extends A2  implements Cir
{
    double c_ar,c_pr;
    public void cir_calc(double r)
    {
       c_ar=pi*r*r;
       c_pr=2*pi*r;
    }
    public void show()
    {
        System.out.println("Rect. Area = "+ar+" Rect Perimeter = "+pr);
        System.out.println("Circ. Area = "+c_ar+" Circ. Perimeter = "+c_pr);
    }
   public static void main(String[] args) {
      MultipleLevel_Inheritence_correct ob =new MultipleLevel_Inheritence_correct();
      ob.input();
      ob.rect_calc();
      Scanner obj =new Scanner(System.in);
      System.out.print("Enter the Radius = ");
      double r= obj.nextDouble();      
      ob.cir_calc(r);
      ob.show();
      obj.close();
   }    
}