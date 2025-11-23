package com.arrays;

import java.util.Scanner;

public class Array01 
{
	public void array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" elements");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Using while loop");
		int index=0;
		while(index < arr.length)
		{
			System.out.println(arr[index]);
			index++;
		}
		
		System.out.println("Using for loop");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Using foreach loop");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Array01 ar= new Array01();
		ar.array();
	}
}
