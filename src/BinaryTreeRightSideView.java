import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 199. Binary Tree Right Side View

 •	Difficulty: Medium
 Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 For example:
 Given the following binary tree,
 1            <---
 /   \
 2     3         <---
 \     \
 5     4       <---
 You should return [1, 3, 4].
 Credits:
 Special thanks to @amrsaqr for adding this problem and creating all test cases.
 Subscribe to see which companies asked this question
 Hide Tags
 Tree Depth-first Search Breadth-first Search

 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int val = 0;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                val = node.val;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(val);
        }
        return result;
    }
}
