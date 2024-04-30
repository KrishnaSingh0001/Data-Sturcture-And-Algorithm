//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public boolean isVowel(char ch){
        return ((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'));
    }
    
    public Node arrangeCV(Node head){
        
        Node constDummy = new Node('#');
        Node vowelDummy = new Node('#');
        
        Node constTail = constDummy;
        Node vowelTail = vowelDummy;
        
        Node curr=  head;
        while(curr!=null){
            if(!isVowel(curr.data)){
                constTail.next = new Node(curr.data);
                constTail = constTail.next;
            }
            else{
                vowelTail.next = new Node(curr.data);
                vowelTail = vowelTail.next;
            }
            curr = curr.next;
        }
        
        vowelTail.next = constDummy.next;
        
        Node ansHead = vowelDummy.next;
        return ansHead;
        
    }
}