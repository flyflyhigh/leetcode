/**
 206. Reverse Linked List
 •	Difficulty: Easy
 Reverse a singly linked list.
 click to show more hints.

 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            head = head.next;
            cur.next = prev;
            prev = cur;
            cur = head;
        }
        return prev;
    }
}
