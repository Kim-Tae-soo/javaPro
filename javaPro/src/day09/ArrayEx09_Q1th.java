package day09;

import java.util.Scanner;

public class ArrayEx09_Q1th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = new int[3][4];
		Scanner sc = new Scanner(System.in);

		String[] subject = new String[] { "국어", "영어", "수학", "과학" };

		for (int i = 0; i < score.length; i++) { // 위와 동일하게 인원수 만큼 반복
			System.out.println((i + 1) + "번째 학생의 점수 입력");
			for (int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + "점수 >> ");

				score[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		int[] tot = new int[score.length];
		double[] avg = new double[score.length];

		// 각 과목의 총점이 저장될 변수를 선언하고 0으로 초기화
		int korTot = 0;
		int engTot = 0;
		int matTot = 0;
		int sciTot = 0;

		for (int i = 0; i < score.length; i++) { // 행수만큼 반복
			// 각 과목별 총점 구하기
			korTot += score[i][0];
			engTot += score[i][1];
			matTot += score[i][2];
			sciTot += score[i][3];

			tot[i] = 0;
			for (int j = 0; j < score[i].length; j++) { // 열수만큼 반복
				// 개인별 총점
				tot[i] += score[i][j];
			}

			avg[i] = (double) tot[i] / score[i].length;

		}

		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}

			System.out.println(tot[i] + "\t" + avg[i]);

		}

		// 과목별 총점 출력
		System.out.println("-------------------------------------------");
		System.out.println(korTot + "\t" + engTot + "\t" + matTot + "\t" + sciTot + "\t");

	}

}
