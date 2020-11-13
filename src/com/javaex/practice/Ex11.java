package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳: ");
		
		String alp = sc.nextLine();
		
		switch(alp) {
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
				System.out.println("모음입니다.");
				break;
		default : System.out.println("자음입니다.");
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
