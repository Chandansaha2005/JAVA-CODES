class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> s = new Stack<>();
       for(int i:arr){
           if(!s.isEmpty()){
               int j = s.peek();
               if((j>=0 && i<0) || (j<0 && i>=0)){
                   s.pop();
                   continue;
               }
           }
           s.push(i);
       }
        return new ArrayList<>(s);
    }
}
