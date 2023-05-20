package edu.abhi.Sorting;



public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {5,4,5,2,1};
		sort(arr);
		for(int n :arr) {
			System.out.println(n);
		}
	}
	
	public static void sort(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[index] > arr[j]) index= j;
			}
			
			int temp = arr[index];
			arr[index] = arr[i] ;
			arr[i] = temp;
		}
	}

}
