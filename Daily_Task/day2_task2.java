package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day2_task2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=a.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		int t;
		System.out.println("enter a array value");
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		for(int l=0;l<size;l++) {
			arr2[l]=arr[l];
			
		}
		System.out.println("1st array");
		System.out.println(Arrays.toString(arr));
		System.out.println("coppied array");
		System.out.println(Arrays.toString(arr2));
		for (int j=0;j<size;j++) {
			for(int k=j+1;k<size;k++) {
				if(arr2[j]<arr2[k]) {
					t=arr2[j];
					arr2[j]=arr2[k];
					arr2[k]=t;
				}
			}
		}
		System.out.println("coppied array in decending");
		System.out.println(Arrays.toString(arr2));
	}

}
