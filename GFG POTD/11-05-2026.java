class Solution {
    public boolean palindrome(String s) {
        int len = s.length(),head = 0, tail = len -1;
        while(head<=tail)if(s.charAt(head++)!=s.charAt(tail--)) return false;
        return true;
    }
    public boolean palindromePair(String[] arr) {
        int n=arr.length;
        if(n==1) return false;
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        for (int i=0;i<n;i++) map.put(arr[i], i);
        for (int i=0;i<n;i++) {
           String word=arr[i];
            int len=word.length();
            for (int j=0;j<=len;j++) {
            String left=word.substring(0, j);
            String right=word.substring(j);
                if (palindrome(left)) {
                   String rev=new StringBuilder(right).reverse().toString();
                    if (map.containsKey(rev) && map.get(rev) != i) 
                    return true;
                }if (j!=len && palindrome(right)) {
                    String rev=new StringBuilder(left).reverse().toString();
                 if (map.containsKey(rev) && map.get(rev)!=i) 
                 return true;
                }
            }
        }
        return false;
    }
}
