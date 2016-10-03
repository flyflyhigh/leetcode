/**
 2. Add Two Numbers
 Difficulty: Medium
 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null || l2 != null || carry != 0){
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            cur = cur.next;
        }
        return dummy.next;
    }
}
