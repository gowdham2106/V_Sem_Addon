package dsa_java;

class t1{
      public static void main(String[] args) {
        t1 ne=new t1();
        ne.insert(20);
        ne.insert(30);
        ne.insert(30);
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
            tail.next=head;;
         }
        
        }
         public void disp(){
            node current=head;
            do{
                System.out.println(current.data);
                current=current.next;
            }while(current!=head);
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