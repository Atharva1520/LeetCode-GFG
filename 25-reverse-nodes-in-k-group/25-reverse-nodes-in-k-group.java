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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k ==1)return head;
      ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode c = dummy;
        ListNode n = dummy;
        ListNode p = dummy;
        
     
        int count =0;
        while(c.next != null){
            c = c.next;
            count++;
        }
    
        while(count >= k){
            c = p.next;
            n = c.next;
            for(int i=1;i<k;i++){
                c.next = n.next;
                n.next = p.next;
                p.next = n;
                n = c.next;
               }
            p = c;
            count -= k;
        }
        return dummy.next;
        
    }
}