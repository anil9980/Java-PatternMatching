package com.anil.learning.patterns;
/*
-----1
----123
---12345
--1234567
-123456789

 */
public class Pattern13 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5-i+1;j++) {
			System.out.print("-");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print(k);
		}
		System.out.println();
	}
}
}
