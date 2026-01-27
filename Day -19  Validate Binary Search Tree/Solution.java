class Solution {

    public int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        int a = max(root.left);
        int b = max(root.right);

        return Math.max(root.val, Math.max(a, b));
    }

    public int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;

        int a = min(root.left);
        int b = min(root.right);

        return Math.min(root.val, Math.min(a, b));
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        if(root.left != null && root.val <= max(root.left)) return false;
        if(root.right != null && root.val >= min(root.right)) return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
