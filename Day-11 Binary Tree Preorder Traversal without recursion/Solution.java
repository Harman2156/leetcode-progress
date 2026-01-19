/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       Stack<TreeNode> st = new Stack<>();
       List<Integer> ans = new ArrayList<>();
       if(root != null) st.push(root);
       while(st.size() > 0){
        TreeNode fr = st.pop();
        ans.add(fr.val);
        if(fr.right != null) st.push(fr.right);
        if(fr.left != null) st.push(fr.left);
       } 


       return ans;
    }
}
