/*
 Java program to return kth to last element in a linked List
 */
package coding.ctciBook.LinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class kthtolast {
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
    void kthlast(int k){
        Node p=head;
        k=k-1;
        int pos=0;
        while(k>pos){
            p=p.next;
            pos++;
        }
        System.out.println(p.data);
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
        System.out.println("Enter the kth position");
        int k=sc.nextInt();
        ll.kthlast(k);
    }
}
