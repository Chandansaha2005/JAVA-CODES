class Solution {
    public boolean isMaxHeap(int[] arr) {
        for (int i = 0; i <= (arr.length - 2) / 2; i++) {
            if (arr[2 * i + 1] > arr[i]) return false;
            if (2 * i + 2 < arr.length && arr[2 * i + 2] > arr[i]) return false;
        } return true;
    }
}
