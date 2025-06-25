public class StringBuilderPractice4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbbbcccccddddddddeef");
        String ans = "" + str.charAt(0);
        int c = 1;
        for (int i = 1; i < str.length(); i++) {
            char temp = (char) str.charAt(i);
            char ptemp = (char) str.charAt(i - 1);
            if (temp == ptemp) {
                c++;
            } else {
                ans += c;
                c = 1;
                ans += temp;
            }
        }
        ans += c;
        System.out.println(ans);
    }
}
