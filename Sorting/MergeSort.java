/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class MergeSort {
  static void merge(int Arr[], int start, int mid, int end) {
	int temp[] = new int[end - start + 1];
	int i = start, j = mid+1, k = 0;
	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}
        while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start];
	}
}
    
static void mergeSort(int Arr[], int start, int end) {

	if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
	}
}   
static void print(int arr[],int n){
    System.out.println("The Sorted array is: ");
    for(int i =0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }     
        mergeSort(arr, 0, n-1);
        print(arr, n);
    }
}
        
