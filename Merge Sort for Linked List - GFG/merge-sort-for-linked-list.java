// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        
        Node left = head;
        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node a1 =mergeSort(left);
        Node a2 = mergeSort(right);
        return merge(a1,a2);
    }
    
    
    static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    
    
    static Node merge(Node node1 , Node node2){
        Node head =null;
        Node pre = null;
        if(node1 == null && node2 == null)
            return null;
        
        else if(node1 == null && node2 != null)
            return node2;
        else if(node1 != null && node2 == null)
            return node1;
        
        if(node1.data <= node2.data){
            head = new Node(node1.data);
            pre = head;
            node1 = node1.next;
        }else{
            head = new Node(node2.data);
            pre = head;
            node2 = node2.next;
        }
       while(node1 != null && node2 != null){
           if(node1.data < node2.data){
              Node nod = new Node(node1.data);
              pre.next = nod;
              pre = pre.next;
              node1 = node1.next;
           }else{
                Node nod = new Node(node2.data);
              pre.next = nod;
              pre = pre.next;
              node2 = node2.next;
           }
       }
           if(node1 != null){
               while(node1 != null){
                    Node nod = new Node(node1.data);
              pre.next = nod;
              pre = pre.next;
              node1 = node1.next;
               }
           }
           if(node2 != null){
               while(node2 != null){
                    Node nod = new Node(node2.data);
              pre.next = nod;
              pre = pre.next;
              node2 = node2.next; 
               }
           }
       return head;
    }
   
}


