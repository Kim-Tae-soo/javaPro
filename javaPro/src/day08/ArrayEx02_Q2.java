package day08;

public class ArrayEx02_Q2 {


	public static void main(String[] args) {
		// 문제) 배열의 값들 중에 제일 큰수와 작은수를 출력하시오

		int[] score = { 90, 85, 100, 70, 65, 80 };

		int max = score[0];
		int min = score[0];

		
		for (int i = 0; i < score.length; i++) {

			if (max < score[i]) 
				max = score[i];
			
			if (min > score[i]) 
				min = score[i];
			
			
		}
		
		System.out.println("최대값 : "+ max + " 최소값 : " +  min);
		
		
	}

}
