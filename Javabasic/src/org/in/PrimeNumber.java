package org.in;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("your given number is :");
		int num=scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("It is prime number");
			
		} else {
			System.out.println("It is not prime number");

		}
		
		
		

	}

}
