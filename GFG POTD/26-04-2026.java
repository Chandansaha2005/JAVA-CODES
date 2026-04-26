class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> common = new ArrayList<>();
        int i=0,j=0,k=0,n1=a.length,n2=b.length,n3=c.length;
        while (i<n1 && j<n2 && k<n3){
            if (a[i]==b[j] && b[j]==c[k]){
                common.add(a[i]);
                i++; j++; k++;
                while (i<n1 && a[i]==a[i - 1])  i++;
                while (j<n2 && b[j]==b[j - 1])  j++;
                while (k<n3 && c[k]==c[k - 1])  k++;
            }
            else if (a[i]<b[j]) i++;
            else if (b[j]<c[k]) j++;
            else k++;
        }
        return common;
    }
}
