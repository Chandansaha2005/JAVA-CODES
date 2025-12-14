import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*/6-"; 
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(String.valueOf(ch)); 
            } else { // operator
                String v1 = val.pop();
                String v2 = val.pop(); 
                String newvalue = ch + v2 + v1; 
                val.push(newvalue);
            }
        }
        System.out.println(val.peek());
    }
}
