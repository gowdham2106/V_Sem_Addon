package dsa_java;

import java.util.Scanner;
class d5post{
      public static void main(String[] args) {
       
        d5post ne=new d5post();
        Scanner a = new Scanner(System.in);
       int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at head");
            System.out.println("2. Insert at tail");
            System.out.println("3. Delete at pos");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            op = a.nextInt(); 

            switch (op) {
                case 1:
                    System.out.print("Enter a value to insert at head: ");
                    int val = a.nextInt();
                    ne.insert(val);
                    break;

                case 2:
                    System.out.print("Enter a value to insert at tail: ");
                    int va = a.nextInt();
                    ne.insertatt(va);
                    break;

                case 3:
                    System.out.print("Enter a position to delete: ");
                    int v = a.nextInt();
                    ne.delatt(v);
                    break;

                case 4:
                    ne.disp();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (op != 5); 
        
      }

        node head=null;
        node tail=null;
        public void insertatt(int data){
        node newnode=new node(data);
         if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
         }
         else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
         }
        
        }
         public void insert(int data){
        node newnode=new node(data);
         if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
         }
         else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
         }
        
        }
        
         public void disp(){
            node current=head;
            do{
                System.out.println(current.data);
                current=current.next;
            }while(current!=head);
         }
         public void delatt(int pos){
             
             node temp=head;
             for(int i=1;i<pos-1;i++){
                 temp=temp.next;
             }
             temp.next=temp.next.next;
             temp=tail;
         }
  }

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}