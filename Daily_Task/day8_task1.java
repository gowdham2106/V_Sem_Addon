package addon_dsa;

import java.util.Scanner;

public class day8_task1 {
	boolean flag=false;
	
	public void Lins(int temp[],int tagr) {
		
		for( int i=0;i<temp.length;i++) {
			if(temp[i]==tagr) {
				i++;
				System.out.println("found at "+i);
				flag=true;
			}
			
		}
		
		if(flag==false) {
			System.out.println("found  " );
		}
		
		
	}
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=a.nextInt();
		int[] tem=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the value");
			tem[i]=a.nextInt();
		}
		System.out.println("enter a size of target");
		int tagr=a.nextInt();
		day8_task1 ac=new day8_task1();
		ac.Lins(tem,tagr);
		
	}

}
