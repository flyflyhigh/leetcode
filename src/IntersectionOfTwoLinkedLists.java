/**
 160. Intersection of Two Linked Lists
 •	Difficulty: Easy
 Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:
 A:          a1 → a2
 ↘
 c1 → c2 → c3
 ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:
 •	If the two linked lists have no intersection at all, return null.
 •	The linked lists must retain their original structure after the function returns.
 •	You may assume there are no cycles anywhere in the entire linked structure.
 •	Your code should preferably run in O(n) time and use only O(1) memory.

 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode curA = headA, curB = headB;
        while(curA != null){
            lenA++;
            curA = curA.next;
        }
        while(curB != null){
            lenB++;
            curB = curB.next;
        }
        int diff = Math.abs(lenA - lenB);
        curA = headA;
        curB = headB;
        while(diff-- > 0){
            if(lenA > lenB){
                curA = curA.next;
            }else{
                curB = curB.next;
            }
        }
        while(curA != null && curA != curB){
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
