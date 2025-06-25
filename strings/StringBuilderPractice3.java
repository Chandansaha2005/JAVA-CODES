public class StringBuilderPractice3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("I am Chandan Saha");
        StringBuilder ans = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            char temp = (char) str.charAt(i);
            if (temp == ' ' || i == str.length() - 1) {
                StringBuilder rtr = new StringBuilder();
                rtr.append(str.subSequence(j, i + 1));
                ans.append(rtr.reverse());
                j = i;
            }
        }
        System.out.println(ans);
    }
}
