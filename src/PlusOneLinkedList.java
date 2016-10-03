/**
 369. Plus One Linked List
 Difficulty: Medium
 Given a non-negative number represented as a singly linked list of digits, plus one to the number.
 The digits are stored such that the most significant digit is at the head of the list.
 Example:
 Input:
 1->2->3

 Output:
 1->2->4
 */
public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        helper(dummy);
        return dummy.val == 0 ? dummy.next : dummy;
    }

    private int helper(ListNode node){
        if(node == null){
            return 1;
        }
        node.val += helper(node.next);
        if(node.val <= 9){
            return 0;
        }
        node.val %= 10;
        return 1;
    }
}
