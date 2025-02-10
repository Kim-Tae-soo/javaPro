package day09;

import java.util.Scanner;

public class ArrayEx09_Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] score = new int[3][4];  
        int[] std = new int[3];
        double[] avg = new double[3];
        int[] tot = new int[4];

        
      
        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수 입력");
            System.out.print("국어점수 >> ");
            score[i][0] = scanner.nextInt();
            System.out.print("영어점수 >> ");
            score[i][1] = scanner.nextInt();
            System.out.print("수학점수 >> ");
            score[i][2] = scanner.nextInt();
            System.out.print("과학점수 >> ");
            score[i][3] = scanner.nextInt();
            System.out.println();
        }      
        
        for (int i = 0 ; i < score.length; i++) {
        	for(int j=0; j<score[i].length; j++) {
        		std[i] += score[i][j];
        		tot[i] += score[i][j];
        		
        	}
        	
        	avg[i] = (double) std[i] / score[i].length;
        }

        System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.print(std[i] + "\t");
            System.out.printf("%.2f", avg[i]);
            System.out.println();
        }
        System.out.println("-------------------------------------------");
       
        for (int i = 0; i < tot.length; i++) {
        	System.out.print(tot[i] + "\t");
        }
        System.out.println();
    }
}
