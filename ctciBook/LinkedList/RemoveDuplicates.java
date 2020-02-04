/*
Write a function which takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. 
The list should only be traversed once.
For example if the linked list is 11->11->11->21->43->43->60 then removeDuplicates() should convert the list to 11->21->43->60. */
package coding.ctciBook.LinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class RemoveDuplicates {
    public static class LinkedList{
        Node head;
        class Node{
            int data;
            Node next;
            Node (int d){
                data = d;
                next=null;
            }
        }
        void removedupes(){
            Node curr = head;
            while(curr != null){
                Node temp = curr;
                while(temp != null && temp.data == curr.data){
                    temp=temp.next;
                }
                curr.next = temp;
                curr=curr.next;
            }
        }
        void printlist(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public void push(int d){
            Node newnode = new Node(d);
            newnode.next=head;
            head=newnode;
        }
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of Linked List Elements");
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for(int i=0; i<n; i++){
           ll.push(sc.nextInt()); 
        }
        System.out.println("\n The Linked List before removing duplicates");
        ll.printlist();
        ll.removedupes();
        System.out.println("\n The linkedList after removing duplicates");
        ll.printlist();
    }
}
