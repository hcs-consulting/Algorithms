package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,8,9,7,5,6,4,3,2,1,0};
		InsertionSort.insertionSort(array);

	}

	private static void insertionSort(int[] data) {
		// TODO Auto-generated method stub
		for(int i= 1;i<data.length;i++){
			int key = data[i];
			int j = i-1;
			while(j>=0 && key < data[j]){
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = key;
		}
		System.out.println(Arrays.toString(data));
	}

}
