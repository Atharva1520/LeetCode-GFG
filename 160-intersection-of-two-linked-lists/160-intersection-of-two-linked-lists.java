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
        HashSet<ListNode> set = new HashSet();
        ListNode temp  = headA;
        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        ListNode cur = headB;
        while(cur != null){
            if(set.contains(cur)){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}