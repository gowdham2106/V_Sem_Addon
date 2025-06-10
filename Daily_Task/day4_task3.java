package addon_dsa;
class node1{
	int data;
	node1 next;
	node1 prev;
	
node1(int d){
	this.data=d;
	this.next=null;
	this.prev=null;
}
}

public class day4_task3 {
	int size=0;
	node1 head;
	node1 tail;
	public void insert(int val) {
		node1 newnode=new node1(val);
		if(head==null) {
			tail=newnode;
			head=newnode;
			newnode.next=null;
		}
		if(head!=null) {
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			size++;
		}

}
      public void delmid() {
	node1 temp=head;
	int mid=size/2;
	while(--mid<0) {
		temp=temp.next;
	}
	(temp.next).prev=temp.next.next;
	temp.next.next.prev=temp;
	temp.next.next.next=temp.next;
	temp.next=temp.next.next;
}
      public void display() {
  		node1 temp=tail;
  		while(temp.prev!=null) {
  			System.out.println(temp.data);
  			temp=temp.prev;
  		}
  		System.out.println(temp.data);
  	}
      public static void main(String[]args) {
    	  day4_task3 n=new day4_task3();
    	  n.insert(10);
    	  n.insert(20);
    	  n.insert(30);
    	  n.delmid();
    	  n.display();
      }
}