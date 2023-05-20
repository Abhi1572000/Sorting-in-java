package edu.abhi.Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {1,5,3,6,5,8,7};
		sort(arr,0,arr.length-1);
		for(int n:arr) {
			System.out.print(n+" ");
		}
		

	}
	
	static void sort(int[]arr,int start,int end) {
		
		if(start>=end) return;
		int pivot= arr[(start+end) / 2];
		int i = start, j= end;
		while(i<=j) {
			while(arr[i] < pivot) i++;
			while(arr[j] > pivot) j--;
			
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		sort(arr,start ,j);
		sort(arr,i,end);
	}

}
