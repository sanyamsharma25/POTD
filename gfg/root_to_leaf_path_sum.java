
class Solution {
    /*you are required to complete this function */
    
    boolean hasPathSum(Node root, int target) {
        // Your code here
        if(root==null) return false;
        
        boolean left=hasPathSum(root.left,target-root.data);
        boolean right=hasPathSum(root.right,target-root.data);
        if(root.left==null && root.right==null){
        if(target-root.data==0){
            return true;
        }
        }
        return left || right;
    }
}