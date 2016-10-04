/**
 234. Palindrome Linked List
 •	Difficulty: Easy
 Given a singly linked list, determine if it is a palindrome.
 Follow up:
 Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
    ListNode cur = null;
    public boolean isPalindrome(ListNode head){
        cur = head;
        return helper(head);
    }
    private boolean helper(ListNode node){
        if(node == null){
            return true;
        }
        if(helper(node.next) && node.val == cur.val){
            cur = cur.next;
            return true;
        }
        return false;
    }
}
