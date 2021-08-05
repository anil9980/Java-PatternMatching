package com.anil.learning.patterns;
/*
*****
****
***
**
*
54321
5432
543
54
5
11111
2222
333
44
5
 */
public class Pattern9 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
	for(int j=1;j<=5-i+1;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
