package hackerRank.thirtyDays;


import java.io.*;
import java.util.*;

/*class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}*/
class Day24MoreLinkedLists
{

    public static Node removeDuplicates(Node head) {
		
    	System.out.println("start of duplicates-->");
      //Write your code here
    	
    	Node start=head;
		
		/*
		 * while(start!=null) {
		 * 
		 * 
		 * Node curr=start.next; Node prev =start; Node temp=curr; while(curr!=null) {
		 * 
		 * if(prev.data==curr.data) {
		 * 
		 * // System.out.println("prev-->"+prev.data+",curr-->"+curr.data);
		 * temp.next=curr.next; curr=temp.next; System.out.println("start of display ");
		 * // display(start); }else { temp = curr; curr = curr.next; } } start =
		 * start.next;
		 * 
		 * }
		 */
		 
    	
		
		/*
		 * Node curr = head; Node index=null, temp=null;
		 * 
		 * while(curr!=null) { temp = curr; index=curr.next; while(index!=null) {
		 * if(curr.data==index.data) { temp.next=index.next; }else { temp=index; }
		 * index=index.next; } curr= curr.next; //
		 * System.out.println("start of display "); //display(start);
		 * 
		 * }
		 */
     	
    	
    	if(head == null) {
            return head;
        } else {
            
            Node prev = head;
            Node curr = head.next;
            
            while(curr != null) {
                if(prev.data == curr.data) {
                    curr = curr.next;
                } else {
                    prev.next = curr;
                    prev = curr;
                    curr =  curr.next;
                }
                prev.next = null;
            }
        }
    	
    	return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }