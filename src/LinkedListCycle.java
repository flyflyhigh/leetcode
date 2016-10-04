/**
 141. Linked List Cycle
 •	Difficulty: Easy
 Given a linked list, determine if it has a cycle in it.
 Follow up:
 Can you solve it without using extra space?

 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head.next, fast = head.next.next;
        while(fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
