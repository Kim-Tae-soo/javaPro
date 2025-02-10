package day08;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 5명의 이름을 입력 받아 배열의 저장한 후 배열의 값을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print((i+1)+"번쨰 이름 입력 >> ");
			arr[i] = sc.next();
		}
		
		System.out.println();
		for (int i=0; i<arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}

}
