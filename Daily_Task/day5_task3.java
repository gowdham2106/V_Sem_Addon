package dsa_java;

class t3{
      public static void main(String[] args) {
        t3 ne=new t3();
        ne.insert(20);
        ne.insert(30);
        ne.insert(30);
         ne.insert(30);
       // ne.disp();
        ne.delatt();
        ne.disp();
    }
        node head=null;
        node tail=null;
        public void insert(int data){
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
         public void disp(){
            node current=head;
            do{
                System.out.println(current.data);
                current=current.next;
            }while(current!=head);
         }
         public void delatt(){
             node temp=head;
             while(temp.next!=tail){
                 temp=temp.next;
             }
             temp.next=head;
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