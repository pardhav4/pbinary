package com.abc.sample;

public class search {
	public int searcharr(int arr[],int target){
		int left=0,right=arr.length-1;
		while(left<=rigth){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if (arr[mid]>target){
				rigth=mid-1;
			}
			else{
				left=mid+1;
			}
		}
		return -1;
	}
}
