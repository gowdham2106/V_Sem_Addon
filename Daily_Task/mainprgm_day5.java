package dsa_java;

class d5main{
      public static void main(String[] args) {
        d5main ne=new d5main();
        ne.insert(10);
        ne.insert(20);
        ne.insert(30);
        ne.insert(40);
         ne.insert(50);
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
             int pos=2;
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