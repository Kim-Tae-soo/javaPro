package day07;

import java.util.Scanner;

public class Ch04MethodTest01 {
	/*
 	메서드 (Method) ==> 특정한 기능을 처리하는 코드들의 집합
 	
 	
 	구조)
 		접근제한자 [static] 반환값자료형 메서드명 (파라미터변수(매개변수)){
 			...
 			...
 			...
 			
 			return 반환값;
 		}
 	
 	- 파라미터변수(매개변수)들은 0개 이상 지정할 수 있다.
 	  ( 매개변수를 선언 방법 ==> 자료형 이름 변수명 )
 	
 	- 반환값 '반환값 자료형'에서 지정한 자료형과 같아야 한다.
 	- 반환값이 없으면 '반환값자료형'은 'void'로 지정한다.
 	- 반환값이 없으면 return 명령을 생략하거나 'return;'와 같이 '반환값'을 생략한다.
 	
 	- 접근제한자 'public', 'private', 'protected' 즁 하나를 사용하거나 생략할 수 있다.
 	  (생략하면 default로 처리 된다.)
 	 
 	- 메서드의 실행은 메서드를 호출함으로써 실행할 수 있다.
 	- 메서드의 실행이 끝나면 제어가 메서드를 호출할 곳으로 되돌아 간다.
 	
 	-------------------------------------------------------------------------------------
 	
 	- 메서드 호출 방법
 	1) 메개변수와 반환값이 없는 메서드 호출하기
 		형식) 메서드명();
 	2) 반환값이 없고, 매개변수가 있는 메서드 호출하기
 		형식) 메서드명(값들..); // 값들이란 : 매개변수에 전달될 값들을 말한다. ('인수'라고 한다.)
 	3) 반환값은 있고 매개변수가 없는 메서드 호출하기
 		형식) 변수 = 메서드명(); // 메서드가 처리된 후 반환값이 변수에 저장된다.
 	4) 반환값도 있고 매개변수도 있는 메서드 호출하기
 		형식) 변수 = 메서드명( 값들... )
 */
	
	// 매개변수와 반환값이 없는 메서드
	public static void insa() {
		System.out.println("안녕하세요...");
		return; // 반환값이 없을 시 return 생략 가능.
	}
	
	//반환값은 없고 매개변수가 있는 메서드
	public static void insa2(String name, int age) {
		
		//name = "우아악";
		//age = 11; -- 메서드에서 옆과 같이 선언을 직접 해주게 되면 다른 메서드에서 무슨 짓을해도 바뀌지 않음.
		System.out.println("나이가 " + age + "세인" + name + "씨 안녕하세요?");
	}
	
	// 반환값은 있고 매개변수가 없는 메서드
	public static int getAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입략하세요 >> ");
		int age = scan.nextInt();
		
		return age; // 반환값이 int이기 떄문에 다른 데이터 타입이 오면 조짐
	}
	
	//반환값과 매개변수가 있는 메서드
	public static int add(int x, int y) {
		/*
		 * int r = x + y; 
		 * return r;
		 */
		
		return x + y;
	}
	
	public static void main(String[] args) {
		
		System.out.println("메서드 연습입니다...");
		System.out.println("----------------");
		
		//네번쨰 메서드 호출법
		int hap = add(100,100);
		System.out.println(hap);
		
		System.out.println("--위에는 첫번째 방법 아래는 두번째 방법--");
		int a = 30;
		int b = 20;
		System.out.println(add(b,a));
		System.out.println(a);
		System.out.println(b);
		
		// 첫번째 메서드 호출법
		// insa(); 
		
		/*
		 * 두번째 메서드 호출법
		insa2("홍길동",33);
		// insa2(null, 0); 메서드에 값이 저장된걸 불러옴 현재 메서드에서 무슨 짓을 해도 바뀌지 않음. 
		
		String irum ="일지매";
		int age = 20;
		insa2(irum, age); // 1번 메서드와 2번메세드에 똑같은 변수명이 있다고 해도 영역이 다르면 오류가 발생하지 않는다.
		*/
		
		/*
		//세번째 메서드 호출법
		// 방법1
		int age = getAge();
		System.out.println("당신의 나이는 " + age + "세 이군요...");
		
		// 방법2
		System.out.println("당신의 나이는 " +getAge() + "세 이군요...");
		*/
		
		
	}

}