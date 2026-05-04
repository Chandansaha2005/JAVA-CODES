class Solution {
    public boolean isBinaryPalindrome(int x) {
        if (x==0) return true;
        int n= (int)(Math.log(x)/Math.log(2))+1,l=0,r=n-1;
        while (l <r) {
            if(((x>>l)&1)!=((x>>r) &1)) return false;
            l++;
            r--;
        } return true;
    }
};
