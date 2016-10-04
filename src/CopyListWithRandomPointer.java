import java.util.HashMap;
import java.util.Map;

/**
 138. Copy List with Random Pointer
 Difficulty: Hard
 A linked list is given such that each node contains an additional random pointer which could point to any node
 in the list or null.
 Return a deep copy of the list.

 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head){
        if(head == null){
            return null;
        }
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        while(cur != null){
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            if(cur.next != null){
                map.get(cur).next = map.get(cur.next);
            }
            if(cur.random != null){
                map.get(cur).random = map.get(cur.random);
            }
            cur = cur.next;
        }
        return map.get(head);
    }
}
