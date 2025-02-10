package kr.or.ddit.day14;


class InitTest {
	static int cv = 1;			// 클래스(정적) classValue 변수 선언 및 초기화
	int iv = 1; 				// 인스턴스 변수 instrensValue 선언 및 초기화
	
	static {	// 클래서(정적) 초기화 블럭 ==> 클래스의 정보가 JVM의 Method 영역에 저장될 때 한번만 실행되는 영역
		//cv = 2; //	└> 클래스의 (정적)변수를 최기화 하거나 클래스에서 한번만 실행될 내용을 작성한다.
		cv++;
	}
	
	{
		// 인스턴스 초기화 블럭
		// ==> 인스턴스(객체)가 생성될 때마다 생성자보다 먼저 실행되는 영역
		// ==> 각 인스턴스마다 처리할 내용들을 기술한다.
		//iv = 2;
		iv++;
		
	}
	
	public InitTest() {			// 생성자 메소드
		//iv = 3; 
		iv++;
		cv++;
	}
	
}

/*
	- 실행 순서
	
	1. 클래스변수 생성 및 기본값으로 초기화
	2. 클래스변수의 명시적 초기화
	3. 클래스 초기화 블럭
	4. 인스턴스 변수 생성 및 기본값으로 초기화
	5. 인서튼서 변수의 명시적 초기화
	6. 인스턴스 초기화 블럭 실행
	7. 생성자 메소드 실행
	
	
	==> 위의 실행 순서 중에서 1번 ~ 3번까지는 해당 클래스 정보를 읽어와 
		JVM 메소드 영역에 저장될 때 한번만 처리된다.
	==> 4번 ~ 7번까지는 객체(인스턴스)가 생성될 때마다 매번 처리된다.
	
 */

public class BlockTest {

	public static void main(String[] args) {
		
		InitTest it = new InitTest();
		System.out.println("cv = " + InitTest.cv);
		System.out.println("it.iv = " + it.iv);
		
		InitTest it2 = new InitTest();
		System.out.println("cv = " + InitTest.cv);
		System.out.println("it2.iv = " + it2.iv);
		
		

	}

}
