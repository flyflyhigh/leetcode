import java.util.Scanner;

/**
 297. Serialize and Deserialize Binary Tree
 •	Difficulty: Hard
 Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored
 in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or
 another computer environment.
 Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your
 serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to
 a string and this string can be deserialized to the original tree structure.
 For example, you may serialize the following tree
 1
 / \
 2   3
 / \
 4   5
 as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree. You do not necessarily need to
 follow this format, so please be creative and come up with different approaches yourself.
 Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms
 should be stateless.
 */
public class SerializeDeserializeBinaryTree {
    public String serialize(TreeNode root){
        if(root == null){
            return "#";
        }
        return root.val + " " + serialize(root.left) + " " + serialize(root.right);
    }
    public TreeNode deserialize(String data){
        if(data == null || data.isEmpty()){
            return null;
        }
        return deserialize(new Scanner(data));
    }
    private TreeNode deserialize(Scanner sc){
        if(!sc.hasNext()){
            return null;
        }
        String token = sc.next();
        if(token.equals("#")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(token));
        node.left = deserialize(sc);
        node.right = deserialize(sc);
        return node;
    }
}
