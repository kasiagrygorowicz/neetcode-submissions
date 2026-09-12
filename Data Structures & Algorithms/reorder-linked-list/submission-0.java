/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        var dummy = head;
        var slow = head;
        var fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
    
        var temp = slow.next;
        slow.next=null;
        slow=temp;

        ListNode prev= null;
        while(slow != null){
            var tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow =tmp;
        }

        var head2 = prev;

        while(head !=null && head2 !=null){
            var tmp1 = head.next;
            var tmp2 = head2.next;
            head.next = head2;
            head2.next=tmp1;
            head=tmp1;
            head2=tmp2;
        }

        head = dummy;
    }
}
