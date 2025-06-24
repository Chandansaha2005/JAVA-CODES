public class StringBuilderPractice2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length() + 1; j++) {
                System.out.print(str.subSequence(i, j) + " ");
                int l = 0, k = str.subSequence(i, j).length();
                boolean flag = false;
                while (l < k) {
                    if (str.subSequence(i, j).charAt(l) == str.subSequence(i, j).charAt(k)) {
                        flag = true;
                    }
                    l++;
                    k--;
                }
                if (flag) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
