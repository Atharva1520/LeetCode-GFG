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
    public ListNode mergeNodes(ListNode head) {
       /* ListNode ans = new ListNode(0);
        ListNode a = ans;
        ListNode temp = head;
        temp = temp.next;
        int sum =0;
        while(temp != null){
            while( temp.val != 0){
                sum += temp.val;
                temp= temp.next;
            }
            a.next = new ListNode(sum);
            a = a.next;
            temp = temp.next;
            sum = 0;
        }
        return ans.next;*/
        if(head.val == 0){
            head = head.next;
        }
        int sum =0;
        ListNode ptr = head;
        ListNode temp = head;
        while(temp != null){
            if(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }else{
                ptr.val = sum;
                ptr.next = temp.next;
                temp = temp.next;
                ptr = ptr.next;
                sum =0;
            }
        }
        return head;
    }
}