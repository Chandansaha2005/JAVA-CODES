class Solution {
    public int findSmallest(int[] arr) {
        Arrays.sort(arr); 
        int sum=1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]<=sum) sum+=arr[i];
            else  break;
        return sum;
    }
}
