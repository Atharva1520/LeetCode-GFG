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
    public void reorderList(ListNode head) {
      if(head == null){
          return ;
      }
        int len = 0;
        Stack <ListNode> st = new Stack<>();
        
        ListNode temp = head;
        while(temp != null){
            st.push(temp);
            temp = temp.next;
            len++;
        }
        
        ListNode cur = head;
        for(int i =1 ;i < len/2 + 1 ; i++){
            ListNode a = cur.next;
            ListNode last = st.pop();
            cur.next = last;
            last.next = a;
            cur = a;
        }
        cur.next = null;
        
    }
}