package org.in;

import java.util.Scanner;

public class Factroical {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factroical=1;
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			factroical=factroical*i;
			
		}
		System.out.println(factroical);
		

	}

}
