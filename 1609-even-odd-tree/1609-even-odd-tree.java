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

//we solvedd this question using level order traversel
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        /*created a new queue and added the root element 
            we are creating a variable level to keep note of the level 
            check if the first level which is even has odd numbers if it has even we return             false
            now we check if queue is empty or not if queue is not empty then we go through
            each element through a loop and pop the first element in node variaable 
            and check for the conditions if the condtions dosent match return false
            then add the corresponding node left and right values and update the previous               value once there are no elements in queue we return ture
        */
        
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        if(root.val%2==0){
            return false;
        }
        
        while(!q.isEmpty()){
            int size=q.size();
            int prev =0;
            for(int i=0;i<size;i++){
                 TreeNode node=q.poll();
                if(level%2==0 && (node.val%2==0||(prev!=0 && node.val<=prev))){
                    return false;
                }else if(level%2!=0 && (node.val%2!=0||(prev!=0 && node.val>=prev))){
                    return false;
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                   q.add(node.right);
                }
                  prev=node.val;
             
            }
            level++;
        }
        return true;
    }
}