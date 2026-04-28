class Solution {
    public int longestSubstr(String s, int k) {
        int n = s.length() ,maxFreq = 0, res = 0,l = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int r = 0; r < n; ++r) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(r)));
            if (r - l + 1 - maxFreq > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l+ 1);
        }
        return res;
    }
}
