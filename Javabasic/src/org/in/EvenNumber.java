package org.in;

import java.util.Scanner;

public class EvenNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=0;i<=number;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}

	}

}
