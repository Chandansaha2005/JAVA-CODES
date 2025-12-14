public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        String res = "";
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (!res.contains(String.valueOf(s.charAt(i))))
                res += String.valueOf(s.charAt(i));
        return res;
    }

    public static void main(String[] args) {
        String[] tests = {
                "", "bcabc", "cbacdcbc", "abacb", "aabbcc", "abcabc"
        };

        for (String t : tests) {
            String result = removeDuplicateLetters(t);
            System.out.println("Input: \"" + t + "\" -> Output: \"" + result + "\"");
        }
    }
}
