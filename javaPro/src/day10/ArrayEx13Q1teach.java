package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx13Q1teach {
	
	// 문제1) 정수값 1개를 매겨변수로 받아서 전달 받은 정수값 크기의 배열을 생성해서 반환하는 메서드를 작성하시오.

	public static int[] createArray(int size) {
		if(size < 0) {
			System.out.println("size는 0보다 커야합니다..");
			return null; // 객체 생성 방지를 위하여 null
		}
		
		return new int[size];
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] myArray;
		
		System.out.println("생성할 배열의 크기를 입력 >> "); 
		int num = scan.nextInt();
		
		
		myArray = createArray(num);
		
		System.out.println("myArray의 크기 : " + myArray.length);
		System.out.println("myArray의 값들 : " + Arrays.toString(myArray));

	}

}
