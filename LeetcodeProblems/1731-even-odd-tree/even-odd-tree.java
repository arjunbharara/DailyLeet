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
    public boolean isEvenOddTree(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<>();
        return check(root,map,0);
    }
    public boolean check(TreeNode root,HashMap<Integer,Integer>map,int level){
        if(root==null){
            return true;
        }
        if(root.val%2==level%2) return false;

        if(map.containsKey(level)){
            if(level%2==0 && map.get(level)>=root.val){
                return false;
            } else if(level%2==1 && map.get(level)<=root.val){
                return false;
            }
        }
        map.put(level,root.val);
        return check(root.left,map,level+1) && check(root.right,map,level+1);
    }
}