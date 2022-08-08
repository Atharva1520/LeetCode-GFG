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
    public ListNode middleNode(ListNode head) {
        ListNode f =head, s = head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre =null;
        ListNode cur = head;
        ListNode frd = null;
        while(cur!=null)
        {
           frd  =  cur.next;
            cur.next  = pre;
            pre = cur;
            cur = frd;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle  = middleNode(head);
        ListNode reverse = reverseList(middle);
        ListNode cur = head;
        while(cur!=middle)
            if(cur.val!=reverse.val)
                return false;
            else
            {
                cur=cur.next;
                reverse=reverse.next;
            }
        return true;
    }
}