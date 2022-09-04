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
    public ListNode getIntersectionNode(ListNode h1,ListNode h2) {
        if(h1 ==null || h2 == null)return null;
        ListNode a = h1;
        ListNode b = h2;
        while(a != b){
            a = a == null? h2:a.next;
             b = b == null? h1:b.next;
        }
        return a;
    }
}