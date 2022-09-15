/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //step 1
        Node p = head;
        Node front = head;
        while(p != null){
            front = p.next;
            Node copy = new Node(p.val);
            p.next = copy;
            copy.next = front;
            p = front;
        }
      

  
        //step 2
        p = head;
        while(p != null){
             if (p.random != null) {
      p.next.random = p.random.next;
    }
            p = p.next.next;
        }
         
        //step 3
        p = head;
        Node phead = new Node(0);
      Node  copy = phead;
        while(p != null){
            front = p.next.next;
           copy.next = p.next;
            p.next = front;
            copy = copy.next;
            p=p.next;
        }
        return phead.next;
        
    }
}
 
