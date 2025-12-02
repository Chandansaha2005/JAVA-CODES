import java.util.Arrays;

public class sortCharacters {
    public static String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[122];
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if (ch >= 'A' && ch <= 'Z')
        // result.append((char) (ch + 32));
        // else
        // result.append(ch);
        // }
        for (int i = 0; i < s.length(); i++)
            count[(int) s.charAt(i)]++;
        int max=0
        for (int i = 0; i < count.length; i++) {
            if(count[max]<count[i]) max=i;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "bCad";
        System.out.println(frequencySort(s));
    }
}
