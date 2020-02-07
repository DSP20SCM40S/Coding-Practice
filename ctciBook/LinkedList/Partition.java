/*
 Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
package coding.ctciBook.LinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class Partition {
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
    void partition(int k){
        LinkedList less = new LinkedList ();
        LinkedList more = new LinkedList ();
        Node temp=head;
        while(temp!=null){
            if((temp.data) < k){
                less.push(temp.data); 
            }
            else{
                more.push(temp.data);
            }
            temp=temp.next;
        }
        less.printlist();
        more.printlist();        
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
        System.out.println("Enter the partition element");
        int k=sc.nextInt();
        ll.partition(k);
        //System.out.println("The List after partition is: ");
        //ll.printlist();
    }
}
