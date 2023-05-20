package edu.abhi.Sorting;

public class MergeSort {
	static int  count = 0;
	public static void main(String[] args) {
		
		int [] arr = {1,5,3,10,4,2,6,7,20,10,15,13,-1,-14};
		sort(arr);
		for(int n:arr)
			System.out.print(n+" ");
		System.out.print(" count  "+ count);
		
		

	}
	
	static void sort(int[]arr) {

		if(arr.length == 1) {
			return;
		}
		
		int [] left = new int[arr.length/2];
		int [] right = new int[arr.length - left.length ];
		
		for(int i=0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]  = arr[i+left.length];
		}
		
		sort(left);
		sort(right);
		merge(left , right, arr);
	}
	
	static void  merge(int[] left , int[] right , int[] arr) {
	
		int i = 0 ,j =0 , k= 0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}
			else {
				arr[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			arr[k++] = left[i++];
		}
		
		while(j<right.length) {
			arr[k++] = right[j++];
		}
		
	}

}
