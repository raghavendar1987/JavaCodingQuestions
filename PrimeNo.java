// 1 to 100 prime No and find max no.
package com.kunal.Test;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		int n = 100;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 2;i<n;i++){
			for(int j = 2;j<=i;j++){
				if(i%j != 0){
					continue;
				}
				else if(i == j){
					al.add(i);
				}
				else{
					break;
				}
			}
			
		}
		System.out.println(al);
		System.out.println("Smallest prime no is: "+ al.get(0));
		System.out.println("Greatest prime no is: "+ al.get(al.size()-1));
	}
}
