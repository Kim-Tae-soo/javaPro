package day04;

import java.util.Scanner;

public class Ch04ex01 {

	public static void main(String[] args) {
		// 제어문 ==> 프로그램의 흐름을 제어하는 명령

		/*
		 * 종류 : 조건문 , 반복뮨
		 * 
		 * 1) 조건문 ==> if , switch 문
		 * 
		 * - if 문 형식1) if (조건식) { 실행문1; .... } 실행문2;
		 * 
		 * 형식2) if (조건식) { 실행문; .... }else { 실행문2; ,,,,, } 실행문3;
		 * 
		 * 형식3) if (조건식1) { 실행문1; }else if(조건문2){ 실행문2; ... }else{ 실행문3; .... } 실행문4;
		 */

		int iTest = 40;

		/*
		 * 1번 유형
		 * 
		 * if (iTest >= 60) { System.out.println("합격입니다."); }
		 * 
		 * else { System.out.println("불합격입니다."); }
		 * 
		 * 실행한 문장이 1개일 경우에는 중괄호 ( " { } " ) 를 생략할 수 있다.
		 * 
		 * if(iTest >= 60) System.out.println("합격입니다.");
		 */

		/*
		 * 2번유형 Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("정수를 입력하세요 >> "); int num = scan.nextInt();
		 * 
		 * if (num % 2 == 0) { System.out.println( num + "은 짝수입니다."); } else {
		 * System.out.println( num + "은 홀수입니다."); } System.out.println("끝났습니다.");
		 */

		/*
		 * 정수를 입력 받아 0보다 크면 '양수' 0보다 작으면 '음수' 0이면 '0(zero)'를 출력하시오.
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("정수를 입력하세요 >> ");
		 * int num = scan.nextInt();
		 * 
		 * if (num > 0) { System.out.println(num + "는 양수입니다."); } else if (num < 0) {
		 * System.out.println(num + "는 음수입니다."); } else { System.out.println(num +
		 * "는 0(zero)입니다."); }
		 */

		/*
		 * 문제 이름과 성별을 차례로 입력 받아 아래와 같이 출력하는 프로그램을 작성하시오.
		 * 
		 * 성별이 남자이면 'xxx군' 환영합니다. 성별이 여자이면 'xxx양' 반가워요.
		 * 
		 * 문자열 비교방식 "문자열".equals ("문자열2") 같으면true 다르면 false
		 * 
		 */
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("이름을 입력 하세요 >> "); //
		 * 키보드로 입력받은 임시 저장소 버퍼에서 scan.next 명령어를 통해 데이터를 하나씩 가져옴
		 * 
		 * String name = scan.next();
		 * 
		 * System.out.print("성별(남자,여자)로 입력 하세요 >> "); String gender = scan.next();
		 * 
		 * String str1 = "남자"; String str2 = "여자";
		 * 
		 * if (str1.equals(gender)) { System.out.println(name + "군 환영합니다."); } else if
		 * (str2.equals(gender)) { System.out.println(name + "양 환영합니다."); } else {
		 * System.out.println("입력이 잘못되었습니다. 다시 입력해주세요"); }
		 */

		/*
		 * 점수를 입력 받아 아래 조건을 맞는 학점을 출력하시오. (단, 점수는 0 ~ 100 사이의 값만 정확히 입력해야합니다.)
		 * 
		 * 조건 ) 점수가 90이상 100이하 = A 점수가 80이상 90미만 = B 점수가 70이상 80미만 = C 점수가 60이상 70미만 = D
		 * 점수가 60미만 = F
		 * 
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("점수를 입력 하세요 >> ");
		 * 
		 * int score = scan.nextInt();
		 * 
		 * String grade;
		 */

		/*
		 * if (score >= 90 && score <= 100) { grade = "A학점"; } else if (score >= 80 &&
		 * score < 90) { grade = "B학점"; } else if (score >= 70 && score < 80) { grade =
		 * "C학점"; } else if (score >= 60 && score < 70) { grade = "D학점"; } else { grade
		 * = "F학점"; }
		 */

		/*
		 * 
		 * if (score >= 90) { grade = "A학점"; } else if (score >= 80) { grade = "B학점"; }
		 * else if (score >= 70) { grade = "C학점"; } else if (score >= 60) { grade =
		 * "D학점"; } else { grade = "F학점"; }
		 * 
		 * System.out.println("입력한 점수 " + score + "은(는)" + grade + "입니다.");
		 */

		/*
		 * 
		 * '정수 연산자 정수'를 차례로 입력 받아서 '연산자'에 맞는 계산 결과를 출력하는 프로그램을 작성하시오 ex) 입력 예) 게산할 식을
		 * 입력하세요 >> 30 * 40
		 * 
		 * 출력 예) 30 * 40 = 1200
		 * 
		 * 
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("연산을 입력하세요: "); char cal = sc.nextLine().charAt(0);
		 * 
		 * System.out.print("피연산자 2개를 입력하세요: "); double x = sc.nextDouble(); double y =
		 * sc.nextDouble();
		 * 
		 * System.out.print(x + "*" + y + "= "); if (cal == '+') { System.out.println(x
		 * + y); } else if (cal == '-') { System.out.println(x - y); } else if (cal ==
		 * '*') { System.out.println(x * y); } else if (cal == '/') {
		 * System.out.println(x / y); }
		 * 
		 * System.out.println("-----------------------------------------");
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("계산할 식을 입력하세요 >> "); int num1 = scan.nextInt(); String op =
		 * scan.next(); // char 변수 입력받기 int num2 = scan.nextInt();
		 * 
		 * double result;
		 * 
		 * if("+".equals(op)) { result = num1+num2; }else if("-".equals(op)) { result =
		 * num1-num2; }else if("*".equals(op)) { result = num1 * num2; }else
		 * if("/".equals(op)) { result = (double)num1 / num2;
		 * 
		 * }else { result = num1 % num2;
		 * 
		 * }
		 * 
		 * System.out.printf("%d %s %d = %.2f\n", num1,op,num2,result);
		 */
		
		/*
		 * 5(최소값) ~ 10(최대값) 사이의 임의의 정수 만들기 ==> 난수 만들기
		 * Math.random() ==> 0이상 1미만의 난수를 만들어서 변환한다.
		 * (int)(Math.random() * (최대값 - 최소값 + 1) + 최소값)
		 * System.out.println((int)(Math.random() * (10 - 5 + 1) + 5));
		 */

		
		Scanner scan = new Scanner(System.in);
		int rnd = (int)(Math.random() * (10-5+1)+5);
		System.out.println(rnd);
				
	}

}
