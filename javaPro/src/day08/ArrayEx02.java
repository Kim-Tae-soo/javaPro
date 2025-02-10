package day08;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 문제 아래와 같이 score 배열이 있다. 이 배열의값들의 총점과 평균을 구하시오.
		
		int[] score = {90,85,100,70,65,80};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<score.length; i++) {
			sum +=score[i];
		}
		
		System.out.println("총점 : " + sum);
		
		avg = sum / (double)(score.length);
		
		System.out.println("평균 : " + avg);

	}

}
