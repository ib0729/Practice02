package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = so. nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = so.nextInt();
		
		if(num1 >= num2) {
			System.out.println("몫: " + num1/num2);
			System.out.println("나머지: " + num1%num2 );	
		}else {
			System.out.println("몫: " + num2/num1);
			System.out.println("나머지: " + num2%num1);
		}
		
		
		so.close();
	}

}
