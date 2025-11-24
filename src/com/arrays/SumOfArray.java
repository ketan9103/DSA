package com.arrays;

import java.util.Scanner;

public class SumOfArray 
{
	public void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum = arr[i]+sum;
		}
		System.out.println("Sum of array is "+sum);
		sc.close();
	}
	
	public static void main(String[] args) {
		SumOfArray sum = new SumOfArray();
		sum.sum();
	}

}
