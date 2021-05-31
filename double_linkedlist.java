import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;
class double_linkedlist {
    class Node{
        int data;
        Node next,prev;
        public Node(int a){
            this.data=a;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    Node tail;
    public void insertfront(int data){
        Node nd= new Node(data);
        if(head==null){
            return;
        }
        nd.next=head;
        head.prev=nd;
        head=nd;
    }
    public void insertend(int data){
        Node nd= new Node(data);
        if(head==null){
            return;
        }
        tail.next=nd;
        nd.prev=tail;
        tail=nd;
    }
    public void insertafter(int key, int data){
        Node nd= new Node(data);
        if(head==null){
            return;
        }
        Node a=head, b=head.next;
        while(a!=null && a.data!=key){
            if(b==null){
                return;
            }
            a=b;
            b=b.next;
        }
        a.next=nd;
        nd.prev=a;
        nd.next=b;
        if(b!=null){
            b.prev=nd;
          }
        if (a==tail){
            tail=nd;
        }
    }
        public void delete_element(int key){
            if(head==null){
                return;
            }
            if(head.data==key){
                head=head.next;
                head.prev=null;
            }
            Node a=head.next, b=null;
            for (int i=0; a!=null && a!=key; i++){
                b=a;
                a=a.next;
            }
            if(a==null){
               Retur Node;
            }
            else if(a!=null && a.data==key){
                b.next=a.next;
                a.next.prev=b;
            }
            else if(a==tail){
                tail=a.prev;
                tail.next=null;
            }
        }
        public void delete_index(int index){
            if(head==null){
                return;
            }
            if(index==0){
                if(head==tail){
                    head=null;
                    tail=null;
                }
                head=head.next;
                head.prev=null;
            }
            Node temp=head, t;
            for(int i=0; temp!=null && i<index-1;i++){
                temp=temp.next;
            }
            if (temp==null || temp.next==null){
               return;
            }
            temp.next=temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
            temp.next.prev=temp;
        }
        public void searchelement(int key){
            if(head==null){
                return;
            }
            Node temp=head;
            int count=0;
            for (int i=0; temp!=null && temp.data!=key; i++){
                temp=temp.next;
                count +=1;
            }
            if(temp==null){
                System.out.println("Element is not found");
            }
            System.out.println("Element is at: "+count);
        }
        public void printlist(){
            Node temp=head;
            while(temp!=null){
                System.out.println(" "+temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
        public void reverseprinting(){
            Node temp=tail;
            while(temp!=null){
                System.out.println(" "+temp.data);
                temp=temp.prev;
            }
        } 
            public static void main(String[] args)throws Exception {  
                // LinkedList li=new LinkedList();
                double_linkedlist ll=new double_linkedlist();
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
                    System.out.println("Press 7 for reverseprinting the list ");
                    System.out.println("Press 8 searching an element ");
                    System.out.println("Press 9 to delet list and exit ");
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
                        ll.insertafter(key, data);
                        break;
                        case 4: System.out.println("Enter element ");
                        ll.delete_element(sc.nextInt());
                        break;
                        case 5: System.out.println("Enter element ");
                        ll.delete_index(sc.nextInt());
                        break;
                        case 6: ll.printlist();
                        break;
                        case 7: ll.reverseprinting();
                        break; 

                        case 8: System.out.println("Enter element ");
                        ll.searchelement(sc.nextInt());
                        break;
                        case 9: ll=null;
                        System.exit(0);
                        break;
             
                    }
             
             }
             
             
             }
}


