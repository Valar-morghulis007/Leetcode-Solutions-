import java.util.HashSet;
import java.util.Set;

public class Solution142 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    //使用Set
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited=new HashSet<>();
        ListNode node=head;
        while(node!=null){
            if(visited.contains(node)){
                return node;
            }
            visited.add(node);
            node=node.next;
        }
        return null;
    }
}
