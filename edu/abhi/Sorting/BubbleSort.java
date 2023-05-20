package edu.abhi.Sorting;


public class BubbleSort {
	
	public static void main(String[] args) {
		
		int [] a = {1,-1,100,20,10,6,9};
		sort(a);
		for(int n : a) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
	}
	
	
	public static void sort(int [] arr ) {
		
		for(int i=0;i<arr.length;i++) {
				boolean swap = true;
			for(int j= 0;j<arr.length-1-i;j++) {
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = false;
				}
			}
		
			if(swap) break;
		}
		
	}

}

