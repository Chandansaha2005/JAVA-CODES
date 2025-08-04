public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 9, b = 10;
        System.err.println(a|b);//11
        System.err.println(a&b);//8
        System.err.println(a^b);//3
        System.err.println(~a);//-10
        System.err.println(a<<1);//18
        System.err.println(a<<2);//36
        System.err.println(b>>1);//5
        System.err.println(b>>2);//2
    }
}
