public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("ChanDAN");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                int assci = ((int) str.charAt(i)) - 32;
                str.setCharAt(i, (char) assci);
            } else {
                int assci = ((int) str.charAt(i)) + 32;
                str.setCharAt(i, (char) assci);
            }
        }
        System.out.println(str);
    }
}
