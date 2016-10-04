/**
 92. Reverse Linked List II
 •	Difficulty: Medium
 Reverse a linked list from position m to n. Do it in-place and in one-pass.
 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 return 1->4->3->2->5->NULL.
 Note:
 Given m, n satisfy the following condition:
 1 ≤ m ≤ n ≤ length of list.

 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, cur = head;
        n -= m;
        while(--m > 0){
            prev = prev.next;
            cur = cur.next;
        }
        while(n-- > 0){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
}
