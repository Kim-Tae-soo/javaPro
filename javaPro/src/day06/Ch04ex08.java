package day06;

import java.util.Scanner;

public class Ch04ex08 {

	public static void main(String[] args) {
		/*
		 	break문과 continue문은 이 명령을 감싸고 있는 제일 가까운 반복문에 영향을 준다.
		 	
		 	만약, 바깥쪽 반복문에 continue문이나 break문이 처리되도록 하려면 영향을 받을 반복문 앞에 '이름(Label)'을 지정해주고
		 	'contibue 이름;' 또는 'break 이름;' 과 같이 continue문과 break문 뒤에 '이름'을 지정하면 된다 
		 */
		
		/*
		 
		 
		gohome : for(int i=2; i<=9; i++) {
			System.out.println(i + " 단");
			
			for(int j=1; j<=9; j++) {
				
				if(j==5) {
					//continue;
					//break;
					break gohome;
				}
				
				int r = i * j;
				System.out.println(i + " * " + j + " = " + r);
			}
			System.out.println("-----------------");
			System.out.println();
		}
		*/
		
		/*
		 	여러명의 국어, 영어, 수학 점수를 입력 받아 총점과 평균을 구하는 프로그램을 작성하시오.
		 	
		 	조건)
		 		1) 각 과목의 점수는 0부터 100사이의 값만 입력 받도록 한다. 잘못된 값이 입력되면 다시 입력 받는다.
		 		2) 한 사람의 결과가 출력된 후 "계속 하겠습니까? '(Y/N)'의 메세지를 출력하고 값을 입력 받는다.
		 			이 떄 입력 받은 값은 Y,y,N,n 중 하나만 입력 되도록하고 그 외 문자가 입력되면 다시 입력 받는다.
		 		3) 2번에서 입력한 값이 y 또는 Y이면 위 과정을 다시 진행하고 
		 			n 또는 N이면 작업을 종료한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, mat, tot;	//국어 영어 수학 총점이 저장될 변수 선언
		double avg;				// 평균이 저장될 변수 선언
		String check;			// Y,y,N,n이 저장될 변수
		
		// 무한 반복 ==> while(true), for(; ;)
	end:	while(true) {
			
			do {
				System.out.print("국어 점수 >>");
				kor = scan.nextInt();
			}while(kor<0 || kor>100);
			
			do {
				System.out.print("영어 점수 >>");
				eng = scan.nextInt();
			}while(eng<0 || eng>100);
			
			do {
				System.out.print("수학 점수 >>");
				mat = scan.nextInt();
			}while( !(mat>=0 && mat<=100) ); 
			// while( !(mat>=0 || mat<=100) );
			// while( mat<0 || mat>100 );
			
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			System.out.println();
			System.out.println("국 어 : " +kor);
			System.out.println("영 어 : " +eng);
			System.out.println("수 학 : " +mat);
			System.out.println("합 계 : " +tot);
			System.out.println("평 균 : " +avg);
			System.out.println("-------------");
			System.out.println();
			
			/*
			
			do {
			System.out.print("계속 하시겠습니까? (Y/N)");
			check = scan.next();
			}while( !(check.equals("Y")||check.equals("y")||check.equals("N")||check.equals("n")) );
			
			if(check.equals("N")||check.endsWith("n")) {
				break;
			}
			*/
			do {
				System.out.print("계속 하시겠습니까? (Y/N)");
				check = scan.next();
				if(check.equals("N")||check.endsWith("n")) {
					break end;
				}
			//}while( !(check.equals("Y")||check.equals("y")) );
			}while( !check.equals("Y")&& !check.equals("y") );	
				
		}
		System.out.println("종료되었습니다.");
		
	}

}
