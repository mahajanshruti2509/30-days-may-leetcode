/**
 *  Cousins in Binary Tree
 *
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
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
  public boolean isCousins(TreeNode root, int x, int y) {
    Map<Integer, Integer> nodeParentMap = new HashMap<>();
    Map<Integer, Integer> nodeLevelMap = new HashMap<>();
    Queue<TreeNode> processNodeQueue = new LinkedList<>();

    nodeParentMap.put(root.val, 0);
    nodeLevelMap.put(root.val, 0);
    processNodeQueue.add(root);

    while(!processNodeQueue.isEmpty()) {
      TreeNode temp = processNodeQueue.poll();
      if(temp.left !=null) {
        processNodeQueue.add(temp.left);
        nodeParentMap.put(temp.left.val, temp.val);
        nodeLevelMap.put(temp.left.val, nodeLevelMap.get(temp.val) + 1);
      }

      if(temp.right !=null) {
        processNodeQueue.add(temp.right);
        nodeParentMap.put(temp.right.val, temp.val);
        nodeLevelMap.put(temp.right.val, nodeLevelMap.get(temp.val) + 1);
      }
    }

    if(nodeLevelMap.get(x) == nodeLevelMap.get(y) && nodeParentMap.get(x) != nodeParentMap.get(y))         {
      return true;
    }
    return false;
  }
}