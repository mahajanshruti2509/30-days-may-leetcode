/**
 * Kth Smallest Element in a BST
 *
 * Given a binary search tree, write a function 'kthsmallest' to find the kth smallest element in it.
 *
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
  public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
    return nums.get(k-1);
  }

  private ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
    if(root == null) {
      return arr;
    }
    inorder(root.left, arr);
    arr.add(root.val);
    inorder(root.right, arr);

    return arr;

  }
}