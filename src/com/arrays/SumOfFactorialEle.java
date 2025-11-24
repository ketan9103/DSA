package com.arrays;

import java.util.Scanner;

public class SumOfFactorialEle 
{
	public int sumOfFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		} 
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		SumOfFactorialEle sd = new SumOfFactorialEle();
		int arr[] = new int[size];
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + sd.sumOfFact(arr[i]);
		} 
		System.out.println("Sum of factorial is "+sum);
		
	}
}
