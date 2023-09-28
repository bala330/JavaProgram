package org.in;

import java.util.Scanner;

public class CountNimber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		while (n!=0) {
			n=n/10;
			count++;
			
		}
System.out.println("number of counts :"+ count);
	}

}
