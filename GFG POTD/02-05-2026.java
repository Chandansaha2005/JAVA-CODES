class Solution {
    public int findPosition(int n) {
        if(n ==0||(n& (n-1))!= 0) return -1;
        return (int)(Math.log(n)/Math.log(2))+ 1;
    }
}
