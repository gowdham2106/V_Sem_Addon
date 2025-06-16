package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day8_task2 {
	public void bs(int[] t,int tagr) {
	//boolean flag=false;
	int start=0;
	int end=t.length-1;
	bs1(t,tagr,start,end);
	}
	public void bs1(int[] t,int tagr,int start,int end){
		
			int mid=(start+end)/2;
			if(t[mid]==tagr) {
				System.out.println("found at "+ mid);
				return;
				//flag=true;
				
			}
			else if(t[mid]<tagr) {
				start=mid+1;
				bs1(t,tagr,start,end);
				
			}
			else if(t[mid]>tagr) {
				end=mid-1;
				bs1(t,tagr,start,end);
			}
			
	}
	
		
	
	
	
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=a.nextInt();
		int[] t=new int[size];
		System.out.println("enter the value");
		for(int i=0;i<size;i++) {
			
			t[i]=a.nextInt();
		}
		Arrays.sort(t);
		System.out.println("enter a size of target");
		int tagr=a.nextInt();
		day8_task2 ac=new day8_task2();
		ac.bs(t,tagr);
		
	}
}
