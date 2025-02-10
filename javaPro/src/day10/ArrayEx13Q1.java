package day10;

import java.util.Scanner;

public class ArrayEx13Q1 {
	
	// 문제1) 정수값 1개를 매겨변수로 받아서 전달 받은 정수값 크기의 배열을 생성해서 반환하는 메서드를 작성하시오.

	public static int[] arr(int a) {
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = i;
		}
		return arr;
	}

	
	public static void main(String[] args) {
		/*
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("정수 입력 >> "); 
		 int a = scan.nextInt();
		 */
		int a = 5;
		int[] arr = arr(a);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
