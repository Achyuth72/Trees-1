// Time complexity:O(n)
//Space complexity:O(h)
//Faced any problem while running the code on Leetcode:NO

class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        prev=null;
        
        return helper(root);
    }
    private boolean helper(TreeNode root)
    {
        if(root==null) return true;
        
        if( helper(root.left)==false) return false;
         if(prev!=null && prev.val>=root.val) return false;
        //st.pop()
        prev=root;
        return helper(root.right);
        
    }
}
