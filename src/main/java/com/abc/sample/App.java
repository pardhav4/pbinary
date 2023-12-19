package com.abc.sample;
import java.lang.*;
import java.util.*;
import com.abc.sample.sort;
import com.abc.sample.search;

public class App{
	public void printarr(int arr[])
	{
		System.out.println("The elements in the array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\n");
		}
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no of elements to insert:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter elements to insert:");
			arr[i]=sc.nextInt();
		}
		sort s=new sort();
		s.sortarr(arr);
		App app=new App();
		app.printarr(arr);
	}
}