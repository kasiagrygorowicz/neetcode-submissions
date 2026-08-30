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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=null;
        ListNode current = null;
        while(list1 != null || list2 !=null){
            ListNode node = null;
            if(list1 == null){
                node = list2;
                list2 = list2.next;
            }else if (list2 == null){
                node = list1;
                list1 = list1.next;
            }else if(list1.val < list2.val){
                node = list1;
                list1 = list1.next;
            }else{
                node = list2;
                list2 = list2.next;
            }

            if(newHead == null){
                newHead = node;
                current = node;
            }else{
                current.next = node;
                current = current.next;
            }


        }

        return newHead;

    }
}