package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day9_task2 {
	
	public void upper(int[] t,int tagr) {
		int start=0;
		int end=t.length;
		while(start<end) {
			int mid=(start+end)/2;
			if(t[mid]<=tagr) {
			  start=mid+1;
			  
			}
			else  {
				end=mid;
			}
		}
		if(start==end) {
			System.out.println("upper bound "+start+" value "+t[start]);
		}
		
	}
	public static void main(String[] args) {
		day9_task2 ob=new day9_task2();
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
		ob.upper(t, tagr);
		
	}
}
