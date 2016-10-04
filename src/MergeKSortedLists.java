import java.util.PriorityQueue;
import java.util.Queue;

/**
 23. Merge k Sorted Lists
 •	Difficulty: Hard
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        Queue<ListNode> queue = new PriorityQueue<>((a, b)-> (a.val - b.val));
        for(ListNode node : lists){
            if(node != null){
                queue.offer(node);
            }
        }
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            cur = cur.next = node;
            if(node.next != null){
                queue.offer(node.next);
            }
        }
        return dummy.next;
    }
}
