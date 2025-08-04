public class StringBuilderPractice2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                int l = 0, k = str.subSequence(i, j).length() - 1;
                boolean flag = true;
                while (l < k) {
                    if (str.subSequence(i, j).charAt(l) != str.subSequence(i, j).charAt(k)) {
                        flag = false;
                    }
                    l++;
                    k--;
                }
                if (flag) {
                    c++;
                }
            }
        }
        System.out.println("\nTotal palindromic substrings: " + c);
    }
}
