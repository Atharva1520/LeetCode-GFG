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
     private ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        // split list
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        
        // divide and get sorted lists
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        ListNode ans = new ListNode(-1);
        ListNode last = ans;
        
        // merge 2 lists
        while(left != null || right != null) {
            int n1 = left != null ? left.val : Integer.MAX_VALUE;
            int n2 = right != null ? right.val : Integer.MAX_VALUE;
            if(n1 < n2) {
                last.next = left;
                left = left.next;
            } else {
                last.next = right;
                right = right.next;
            }
            last = last.next;
        }
        return ans.next;
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}
    
