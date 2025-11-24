package com.arrays;

import java.util.Scanner;

public class SumOfNegativeEle 
{
	public void sumOfNeg()
	{
		System.out.println("Enter the Size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				sum= sum+arr[i];
			}
		}
		System.out.println("Sum of Odd Number is "+sum);
		
		
		sc.close();
	}
	public static void main(String[] args) 
	{
		SumOfNegativeEle sp = new SumOfNegativeEle();
		sp.sumOfNeg();
	}
}
