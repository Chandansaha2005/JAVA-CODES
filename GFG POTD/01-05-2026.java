class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (minHeap.size() < k) minHeap.add(arr[i]);
            else if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }if (minHeap.size() == k) res.add(minHeap.peek());
            else res.add(-1);
        } return res; 
    }
}
