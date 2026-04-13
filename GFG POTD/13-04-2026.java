class Solution {
    static int areAll9s(int[] num) {
        for (int i = 0; i < num.length; ++i) if (num[i] != 9) return 0;
        return 1;
    }
    static void nextPalindromeUtil(int[] num) {
        int n = num.length;
        int mid = n / 2;
        boolean leftSmaller = false;
        int i = mid - 1;
        int j = (n % 2 == 1) ? mid + 1 : mid;
        while (i >= 0 && num[i] == num[j]) { i--; j++; }
        if (i < 0 || num[i] < num[j]) leftSmaller = true;
        while (i >= 0) {
            num[j] = num[i];
            j++;
            i--;
        }
        if (leftSmaller) {
            int carry = 1;
            i = mid - 1;
            if (n % 2 == 1) {
                num[mid] += carry;
                carry = num[mid] / 10;
                num[mid] %= 10;
                j = mid + 1;
            } else j = mid;
            while (i >= 0) {
                num[i] += carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j++] = num[i--];
            }
        }
    }

    static int[] nextPalindrome(int[] num) {
        int[] ans;
        if (areAll9s(num) == 1) {
            ans = new int[num.length + 1];
            ans[0] = 1;
            for (int i = 1; i < num.length; i++) ans[i] = 0;
            ans[num.length] = 1;
        } else {
            nextPalindromeUtil(num);
            ans = num.clone();
        }
        return ans;
    }
}
