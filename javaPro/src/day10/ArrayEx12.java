package day10;

import java.util.Arrays;

public class ArrayEx12 {

	public static void main(String[] args) {
		/*
		 	배열 복사해주는 메서드
		 	형식) System.arraycopy(배열명1, 복사위치, 배열명2, 저장위치, 개수)
		 		==> '배열명1'의 '복사위치'에서 '배열명2'의 '저장위치'로 '개수'만큼 자료를 복사한다.
		 */
		
		int[] num = { 100, 200, 300, 400, 500, 600, 700, 800, 900 };
		int[] score = { 50, 60, 70, 80, 90 };
		
		System.out.println("작업 전...");
		for(int data : num) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		// score 배열의 1번 위치부터 3개의 자료를 복사하여 num배열의 4번 위치에 저장하시오.
		
		System.arraycopy(score, 1, num, 4, 3);
		
		System.out.println("작업 후...");
		for(int data : num) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		
		System.out.println("score ==> " + score + Arrays.toString(score));
		
		int test[] = new int[score.length];
		System.arraycopy(score, 0, test, 0, score.length);
		
		System.out.println("test ==> " + test + Arrays.toString(test));
		
		
	}

}
