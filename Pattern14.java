package com.anil.learning.patterns;
/*
-123456789
--1234567
---12345
----123
-----1
 */
public class Pattern14 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=2*(5-i+1)-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
