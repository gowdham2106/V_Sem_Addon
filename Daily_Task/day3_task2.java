package addon_dsa;

public class day3_task2 {
	node head;
	public void insert(int pos,int data) {
		node newnode=new node(data);
		if(pos<1) {
			System.out.println("in valid ");
		}
		if(pos==1) {
			newnode.next=head;
			head=newnode;
		}
		else {
			node current=head;
			for(int i=1;i < pos-1  && current!=null;i++) {
				current=current.next;
			}
			if (current==null) {
				System.out.println("invalid position");
				return;
			}
			newnode.next=current.next;
			current.next=newnode;
		}
	}
	public void print() {
		node current=head;
		while(current!=null) {
			System.out.println(current.data +"");
			current=current.next;
		
	}
		
	}
	public static void main(String[] args) {
		day3_task2 list=new day3_task2();
		list.head=new node(3);
		list.head.next=new node(7);
		list.head.next.next=new node(6);
		list.insert(2,12);
		list.print();
	}
}
