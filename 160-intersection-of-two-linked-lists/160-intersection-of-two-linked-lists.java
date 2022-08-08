/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int l1 = getLength(headA);
        int l2 = getLength(headB);
        
        if(l1 > l2){
            for(int i=0;i<l1-l2;i++){
                temp1 = temp1.next;
            }
        }else{
            for(int i=0;i<l2-l1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == null && temp2 == null) return null;
        }
        return temp1;
    }
    int getLength(ListNode head){
        int count =0;
        while(head != null){
            count++;
            head=head.next;
        }
        return count;
    }
}