package day01;

public class Ch02ex02 {

	public static void main(String[] args) {
		// 변수 선언
		// 형식) 자료형이름 변수명; ex) int num = 0;
		int a;
		int b;
		
		int c, d; // 같은 종류의 변수를 여러개 한꺼번에 선언
		
		// 변수 초기화
		a = 100;
		b = a + 20;
		
		System.out.println("a = " + a); // a = 에다가 a 값을 추가함
		System.out.println("b = " + b); // b = 에다가 b 값을 추가함
		System.out.println(b + "는 변수 b의 값이 된다."); // b = 에다가 b 값을 추가함
		
		// "문자열" + 아무값  ==> '문자열' 과 '아무값'이 연결된 형태의 문자열이 된다.
		// 아무값 + "문자열"  ==> '아무값' 과 '문자열'이 연결된 형태의 문자열이 된다.
		// 이 때 사용된 '+'를  '문자열 결합 연산자'라고 한다.
		
		// -------------------------------------------
		
		// 변수 선언 및 초기화
		// 형식) 자료형이름 변수명 = 값;
		int k = 500;
		
		System.out.println("k = " + k);
		
		// 상수 만들기 (상수는 초기화가 이루어진 후에는 변경이 불가능하다.)
		final int MAX = 10; // 선언 및 초기화
		final int MIN;
		
		MIN = 20; // 상수를 선언하고 최초로 초기화 할 때는 오류가 발생하지 않는다.
		// MAX = 300; ==>> 선언이 이미 위에 되어있어서 초기화가 안된다 "상수" 
		
		System.out.println("MAX = " + MAX);
		System.out.println("MIN = " + MIN);
		System.out.println("------------------------------");
		
		// 두 변수의 값을 서로 맞바꾸기
		c = 100;
		d = 200;
		System.out.println("변경 전");
		System.out.println("c = " + c + ", d = " + d );
		
		// 이곳에 맞바꾸는 코드를 작성
		
		int e;
		e = c;
		c = d;
		d = e; 
		
		System.out.println("변경 후");
		System.out.println("c = " + c + ", d = " + d );
		
		
		
		
	}

}
