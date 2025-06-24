public class StringBuilderPractice {
    public static void main(String[] args) {
        int assci = 0,;
        StringBuilder str = new StringBuilder("ChanDAN");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                assci = ((int) (str.charAt(i)))-32;
                //System.out.print(assci + " ");
                System.out.print((char) assci + " ");
                str.setCharAt(i, (char) assci);
            } else {
                assci = ((int) str.charAt(i))+32 ;
                System.out.print((char) assci + " ");
                str.setCharAt(i, (char) assci);
            }
        }
    }
}
