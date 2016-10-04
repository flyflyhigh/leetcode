import java.util.*;

/**
 314. Binary Tree Vertical Order Traversal
 Difficulty: Medium
 Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to bottom, column by column).
 If two nodes are in the same row and column, the order should be from left to right.
 Examples:
 1.	Given binary tree [3,9,20,null,null,15,7],

 2.	   3
 3.	  /\
 4.	 /  \
 5.	 9  20
 6.	    /\
 7.	   /  \
 8.	  15   7
 return its vertical order traversal as:
 [
 [9],
 [3,15],
 [20],
 [7]
 ]
 9.	Given binary tree [3,9,8,4,0,1,7],

 10.	     3
 11.	    /\
 12.	   /  \
 13.	   9   8
 14.	  /\  /\
 15.	 /  \/  \
 16.	 4  01   7
 return its vertical order traversal as:
 [
 [4],
 [9],
 [3,0,1],
 [8],
 [7]
 ]
 17.	Given binary tree [3,9,8,4,0,1,7,null,null,null,2,5] (0's right child is 2 and 1's left child is 5),

 18.	     3
 19.	    /\
 20.	   /  \
 21.	   9   8
 22.	  /\  /\
 23.	 /  \/  \
 24.	 4  01   7
 25.	    /\
 26.	   /  \
 27.	   5   2
 return its vertical order traversal as:
 [
 [4],
 [9,5],
 [3,0,1],
 [8,2],
 [7]
 ]

 */
public class BinaryTreeVerticalOrderTraversal {
    class Tuple{
        int order;
        TreeNode node;
        Tuple(int order, TreeNode node){
            this.order = order;
            this.node = node;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(0, root));
        while(!queue.isEmpty()){
            Tuple tuple = queue.poll();
            if(!map.containsKey(tuple.order)){
                map.put(tuple.order, new ArrayList<>());
            }
            map.get(tuple.order).add(tuple.node.val);
            if(tuple.node.left != null){
                queue.offer(new Tuple(tuple.order - 1, tuple.node.left));
            }
            if(tuple.node.right != null){
                queue.offer(new Tuple(tuple.order + 1, tuple.node.right));
            }
        }
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
