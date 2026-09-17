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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var dummy = new ListNode();
        var head = dummy;
        int carryOver = 0;
    
        while(l1 != null || l2 != null || carryOver !=0){
           int v1 = l1 !=null? l1.val : 0;
           int v2 = l2 !=null? l2.val : 0;


            int val = v1+v2+carryOver;
            carryOver = val/10;
            val = val%10;

            dummy.next = new ListNode(val);
            dummy = dummy.next;


            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
           
            

        }

        return head.next;
    }
}
