

package coding.ctciBook.LinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class RemoveDuplicatesUnsorted {
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
            Node ptr1;
            Node ptr2;
            Node dup =null;
            ptr1=head;
            while(ptr1!=null && ptr1.next!=null){
                ptr2=ptr1;
                while(ptr2.next!=null){
                    if(ptr1.data == ptr2.next.data){
                        dup = ptr2.next;
                        ptr2.next= ptr2.next.next;
                        System.gc();
                    }
                    else{
                        ptr2=ptr2.next;
                    }
                }
                ptr1=ptr1.next;
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

