public class StringPractice2 {
    public static boolean IsPalindrome(String s) {
        int l = 0, k = s.length() - 1;
        while (l < k) {
            if (s.charAt(l) != s.charAt(k)) {
                return false;
            }
            l++;
            k--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abc";
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (IsPalindrome(str.substring(i, j))) {
                    System.out.print(str.substring(i, j) + " ");
                    c++;
                }
            }
        }
        System.out.println("\nTotal palindromic substrings: " + c);
    }
}
