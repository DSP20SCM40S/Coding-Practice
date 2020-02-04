/*
 Java program to delete middle element
 */
package coding.ctciBook.LinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class DeleteMiddleElement {
    public static class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void deletemiddle(int k){
        Node ptr1=head;
        Node ptr2=head;
        Node prev=null;
        while (ptr1!=null && ptr1.next!=null){
            ptr1=ptr1.next.next;
            prev=ptr2;
            ptr2=ptr2.next;
        }        
        prev.next=ptr2.next;
    }   
    void push(int d){
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    void printlist(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }    
}
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        LinkedList ll=new LinkedList();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.push(sc.nextInt());
        }
        int k=sc.nextInt();
        ll.deletemiddle(k);
        ll.printlist();
    }
}
