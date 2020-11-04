// Time complexity:O(n)
//Space complexity:O(h)
//Faced any problem while running the code on Leetcode:NO

class Solution {
    public boolean isValidBST(TreeNode root) {
        //if(root==null) return true;
         // int min=Integer.MIN_VALUE;
         //  int max=Integer.MAX_VALUE;
        return BST( root, Long.MIN_VALUE,Long.MAX_VALUE);
      
    }
    public boolean  BST(TreeNode root, long min, long max)
    {
        if(root==null) return true;
        if(root.val<=min || root.val >=max) return false;
        //if(BST(root.left, min,root.val)==false) return false;
        return ( BST(root.left, min,root.val) && BST(root.right, root.val,max));
       // return BST(root.right, root.val,max);
    }
}
