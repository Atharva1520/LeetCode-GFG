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
    ListNode start;
public boolean isPalindrome(ListNode head) {
   
    start=head;
    Stack s = new Stack();
    while(start!=null){
        s.push(start.val);
        start=start.next;
    }
    
    while(head!=null){
        if(head.val != (int)s.pop())
            return false;
        head=head.next;
    }
return true;
}
}