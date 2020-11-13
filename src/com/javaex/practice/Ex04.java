package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner so = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = so.nextInt();
		
		if(65>age && age >=19) {
			System.out.println("1번그룹 입니다.");
	    }else {
	    	System.out.println("2번그룹 입니다.");
	    }
		so.close();
	}

}
