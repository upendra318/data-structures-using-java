import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;


public class Single_circular_LinkedList { 
    class node{
        int data;
        node next;
        public node(int a){
            this.data =a;
            this.next=null;
        }
    }
    node head;
    node tail;
    public void insertfront(int data){
        node nd= new node(data);
        if(head==null){
            head=nd;
            tail=nd;
            tail.next=head;
            return;
        }
        nd.next=head;
        head=nd;
        tail.next=head;
    }
    public void insertend(int data){
        node nd= new node(data);
        if(head==null){
            head=nd;
            tail=nd;
            tail.next=head;
            return;
        }
        tail.next=nd;
        tail=nd;
        tail.next=head;
    }
    public void insertmiddle(int key, int data){
        node nd= new node(data);
        if (head==null){
            return;
        }
        if (tail==key){
            tail.next=nd;
            tail=nd;
            tail.next=head;
        }
        node a=head, b=head.next;
        while(a!=tail && a.data!=key){
            if(b==nul){
                return;
            }
            a=b;
            b=b.next;
        }
        a.next=nd;
        nd.next=b;
    }
    public void delete_element(int key){
        if(head==null){
            return;
        }
        if(head==tail && head.data==key){
            head=null;
            tail=null;
            return;
        }
        if(head.data==key){
            head=head.next;
            tail.next=head;
        }
        node a=head, prev=null ;
        while(head!=tail && a!=key){
            prev=a;
            a=a.next;
        }
        if (a!=tail){
            if(a.data==key){
                prev.next=a.next;
                a=null;
            }
        }
        else if(a==tail && tail.data==key){
            prev.next=temp.next;
            tail=prev;
        }
        else{
            Systm.out.println("Element is not found");
        }
        
    }
    public void delete_index(int index){
        if (head==null){
            return;
        }
        if(index==0){
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                tail.next=head.next;
                head=head.next;
            }
        }
        node temp=head.next , prev=head;
        int count=0;
        while(temp!=head && count!=index){
            prev=temp;
            temp=temp.next;
            count++;
        }
        if(temp==head){
            System.out.println("Index is invalid ");
        }
        else if (temp==tail){
            prev.next=tail.next;
            tail=prev;
        }
        else{
            prev.next=temp.next;
            temp=null;
        }
    }
        public void searchelement (int key) {
            int count=0;
            if (head==null){
                return;
            }
            if (head.key==key){
                System.out.println("Element at index of "+count);
                return;
            }
            node temp=head;
            while(temp!=null && temp.data!=key){
                if(temp==tail){
                    System.out.println("Element is not found");
                    return;
                }
                temp=temp.next;
                count++;
            }
            System.out.println("Element found at "+count);            
        }
    public void printlist(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        while(temp!=tail){
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
        if(temp==tail){
            System.out.println(" "+temp.data);
        }
    }
    public static void main(String[] args)throws Exception {  
        // LinkedList li=new LinkedList();
        singlelinkedlist1 ll=new singlelinkedlist1();
        Scanner sc= new Scanner(System.in);   
             
        while(true){
            System.out.println("________");
            System.out.println("Enter your choic for limited list operation");
            System.out.println("Press 1 for inserting at front ");
            System.out.println("Press 2 for inserting at end ");
            System.out.println("Press 3 for inserting at after element ");
            System.out.println("Press 4 for deleting an element ");
            System.out.println("Press 5 for deleting from index ");
            System.out.println("Press 6 for displaying the list ");
            System.out.println("Press 7 searching an element ");
            System.out.println("Press 8 to delet list and exit ");
            int ch=sc.nextInt();
     
            switch(ch){
                case 1: System.out.println("Enter element ");
                ll.insertfront(sc.nextInt());
                break;
                case 2: System.out.println("Enter element ");
                ll.insertend(sc.nextInt());
                break;
                case 3: System.out.println("Enter element ");
                int data = sc.nextInt();
                System.out.println(" Enter key");
                int key= sc.nextInt();
                ll.insertmiddle(key, data);
                break;
                case 4: System.out.println("Enter element ");
                ll.delete_element(sc.nextInt());
                break;
                case 5: System.out.println("Enter element ");
                ll.delete_index(sc.nextInt());
                break;
                case 6: ll.printlist();
                break;
                case 7: System.out.println("Enter element ");
                ll.searchelement(sc.nextInt());
                break;
                case 8: ll=null;
                System.exit(0);
                break;
     
            }
        }
     }
    }