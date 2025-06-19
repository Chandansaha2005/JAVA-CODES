public class ScopeOfVariable_Block {
    void block(){
        int a =10;// this is s method level scope of variable
        System.out.println(a);// we can use it here
        System.out.println(b);// we can not use it here

        {// we made a "Block" for code, we can make a block with this curlly breasses anywhere
            int b = 12;// thuis is s block level scope of variables 
            System.out.println(b);// we can use it here but not out side of this block 
        }
    }

    public static void main(String[] args) {
        
    }
}
