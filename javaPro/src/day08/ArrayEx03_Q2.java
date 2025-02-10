package day08;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayEx03_Q2 {
    public static void main(String[] args) {
    	
    	/*
		 * 문제) 학생 5명의 성적을 처리하는 프로그램을 작성하시오.
		 * 		과목은 국어, 영어 수학이고 총점과 평균을 구한다.
		 * 		학번과 각 과목의 점수는 입력 받아서 처리한다.
		 * 		(배열을 이용하여 처리하시오.)
		 * 
		 * 입력 예)
		 * 		1번째 학생 자료 입력
		 * 		학번입력 >> 1
		 * 		국어점수 >> 90
		 * 		영어점수 >> 80
		 * 		수학점수 >> 90
		 * 
		 * 		2번째 학생 자료 입력
		 * 			위와 동일
		 * 			  :
		 * 		5번째 학생 자료 입력
		 * 
		 * 출력 예)
		 * 		학번 		국어		영어		수학		총점		평균
		 * 		1		90		80		90		260		86.67
		 * 
		 */

    	
        Scanner sc = new Scanner(System.in);
        
        int[] std = new int[5];       
        int[] korean = new int[5];
        int[] math = new int[5];
        int[] english = new int[5];
        int[] tot = new int[5];
        double[] avg = new double[5];
        
 

        
        for (int i = 0; i < std.length; i++) {
            System.out.println((i + 1) + "번째 학생의 정보를 입력하세요.");
            

            System.out.print("학번: ");
            std[i] = sc.nextInt();
            System.out.print("국어: ");
            korean[i] = sc.nextInt();
            System.out.print("수학: ");
            math[i] = sc.nextInt();
            System.out.print("영어: ");
            english[i] = sc.nextInt();
            System.out.println();
            
            tot[i] = korean[i] + english[i]+math[i];
            avg[i] = tot[i] / 3.0;
            avg[i] = (int)(avg[i] * 100 + 0.5) / 100.0;
            
            /*
             	86.1234 ==> 86.1234 * 100 ==> 8612.34 + 0.5 ==> 8612.84 ==> 정수화 ==> 8612
             	8612 / 100 ==> 86.12
             	
             	86.5678 * 100 ==> 8658.78 + 0.5 ==> 8657.28 ==> 8657 / 100 ==> 86.57
             	
             	
             */
        }
        
        //  출력
        System.out.println("각 학생의 학번과 국어 영어 수학의 성적 그리고 총점과 평균은 다음과 같습니다:");
        System.out.println();
        System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
        System.out.println("-------------------------------------------------------------"); 
        for (int i = 0; i < std.length; i++) {
            // 아래의 방법은 평균과 총점을 배열로 안 만들었을 때 사용하는 방식
        	// int totalScore = korean[i] + math[i] + english[i];
            // double average = totalScore / 3.0;
            
        	
            System.out.println(std[i]+"\t"+korean[i]+"\t"+english[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]+"\t");
        	
        }

        sc.close();
    }
}
