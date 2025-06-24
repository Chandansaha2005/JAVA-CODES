public class StringPractice {
    public static void main(String[] args) {
        String str = "ChanDan";
        int assci;
        char c;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                assci = ((int) (str.charAt(i))) - 32;
                c = (char) assci;
                str = str.substring(0, i) + c + str.substring(i + 1);
            } else {
                assci = ((int) (str.charAt(i))) + 32;
                c = (char) assci;
                str = str.substring(0, i) + c + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }
}