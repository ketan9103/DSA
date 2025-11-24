package com.arrays;

import java.util.Scanner;

public class MinMaxEleInArr {
	public void minMax(){
		Scanner sc = new Scanner(System.in);
		int min , max ;
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Max number is "+max);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("Min number is "+min);
		
		
		sc.close();
	}

	public static void main(String[] args) {
		MinMaxEleInArr mm = new MinMaxEleInArr();
		mm.minMax();
	}

}
