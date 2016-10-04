/**
 98. Validate Binary Search Tree
 •	Difficulty: Medium
 Given a binary tree, determine if it is a valid binary search tree (BST).
 Assume a BST is defined as follows:
 •	The left subtree of a node contains only nodes with keys less than the node's key.
 •	The right subtree of a node contains only nodes with keys greater than the node's key.
 •	Both the left and right subtrees must also be binary search trees.
 Example 1:
 2
 / \
 1   3
 Binary tree [2,1,3], return true.
 Example 2:
 1
 / \
 2   3
 Binary tree [1,2,3], return false.

 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode node, long min, long max){
        if(node == null){
            return true;
        }
        if(node.val > min && node.val < max){
            return isValidBST(node.left, min, node.val) &&
                    isValidBST(node.right, node.val, max);
        }
        return false;
    }
}
