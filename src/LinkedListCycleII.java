/**
 142. Linked List Cycle II
 •	Difficulty: Medium
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 Note: Do not modify the linked list.
 Follow up:
 Can you solve it without using extra space?

 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head, fast = head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast != null && fast.next != null && slow != fast);
        if(slow != fast){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
