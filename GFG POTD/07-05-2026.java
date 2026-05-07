class Solution {
    public boolean isSubTreeEqual(Node root1, Node root2) {
        if(root1==null&&root2==null)return true;
        if(root1==null||root2==null||root1.data!=root2.data) return false;
        return isSubTreeEqual(root1.left,root2.left)&& isSubTreeEqual(root1.right,root2.right);
    }
    public boolean isSubTree(Node root1, Node root2) {
        if(root1==null) return false;
        if(root1.data==root2.data&&isSubTreeEqual(root1,root2)) return true;
        return isSubTree(root1.left,root2)||isSubTree(root1.right,root2);
    }
}
