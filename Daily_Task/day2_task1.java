package addon_dsa;

import java.util.Arrays;
import java.util.Arrays;
public class day2_task1{	    
public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 9, 4};   
	        Arrays.sort(arr);
	        int left = 0;
	        int right = arr.length - 1;
	        // sorted 
	        System.out.println( Arrays.toString(arr));
	        //two pointer swapping
	        while (left < right) {
	            int temp=arr[left];
	            arr[left]=arr[right];
	            arr[right]=temp;
	            left++;
	            right--;
	        }

	      
	        System.out.println( Arrays.toString(arr));
	    }
	}

