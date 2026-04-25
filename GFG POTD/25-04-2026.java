class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        ArrayList<Integer> s = new ArrayList<>();
        for (int element : arr) {
            while (!s.isEmpty() && s.get(s.size() - 1) * element < 0) {
                int top = s.get(s.size() - 1);
                if (Math.abs(top) > Math.abs(element)) {
                    element = top;
                    s.remove(s.size() - 1);
                }
                else if (Math.abs(top) < Math.abs(element)) s.remove(s.size() - 1);
                else {
                    s.remove(s.size() - 1);
                    element = 0;
                    break;
                }
            }
            if (element != 0) s.add(element);
        }
        return s;
    }
}
