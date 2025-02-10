package day12;

class InstanceStatic{
/*
  멤버변수 == 속성 == 전용변수
  	==> 인스턴스변수 + 클래스변수
  	
  	- 인스턴스변수	==> 객체(인스턴스)를 생성해야만 사용할 수 있는 변수
  	- 클래스변수	==> (정적변수 또는 static 변수) ==> 같은 클래스로 만든 모든 인스턴스에서
  					 공통으로 사용되는 변수 (변수 선언할 때 자료형 앞에 static을 붙인다.)
*/
	// 인스턴스 변수 선언
	int x;
	int y = 6;
	
	//클래스 변수 선언
	static int count;
	static int test = 200;
	
	//---------------------------------------------------------------------
	
	
/*
  메소드
  
  - 인스턴스 메소드	==>객체(인스턴스)를 생성한 후에 객체변수(참조변수)를 통해서만 호출할 수 있는 메소드
  - 클래스 메소드	==>(정적 메서드,static메소드) ==> 객체변수와 클래스명을 이용해서 호출할 수 있는 메소드(객체를 생성하지 않고도 호출할 수  있다.)
   
*/
	// 인스턴스 메서드 구현
	void instanceTestMethod() {
		System.out.println("instanceTestMethod() 입니다.");
		
		//인스턴스 메소드에서 '인스턴스 변수'와 '클래스 변수' 모두를 사용할 수 있다.
		System.out.println("클래스변수 test = " + test);
		System.out.println("인스턴스변수 x = " + x);
		System.out.println();
		
		//클래스 메소드 호출 가능
		System.out.println("클래스 메소드 호출하기");
		classTestMethod();
	}
	
	//클래스 메서드 구현 
	static void classTestMethod() {
		System.out.println("classTestMethod() 입니다.");
		
		// 클래스 메소드에서는 인스턴스 변수를 직접 사용할 수 없다.
		// 인스턴스 변수를 사용하려면 인스턴스를 생성한 후 '찬조변수.인스턴스변수'와 같이 사용해야 한다. (클래스 변수는 자유롭게 사용할 수 있다.)
		System.out.println("클래스 변수 test : " + test);
		
		//인스턴스 변수 직접 사용 불가...
		// System.out.println("인스턴스 변수 x " + x);
		// 사용하고 싶을 때
		InstanceStatic ex2 = new InstanceStatic();
		System.out.println("ex.2 = "+ex2.x);
		
		// 클래스 메서드에서는 인스턴스 직접 메서드를 호출할 수 없다.
		// 클래스 메서드에서 인스턴스 메서드를 호출하려면 인스턴스를 생성한 후 '참조변수.인스턴스메소드명()'과 같이 사용한다.
		System.out.println("클래스 메서드에서 인스턴스 메서드 호출하기");
		//ex2.instanceTestMethod();
	}	
}


public class InstanceStaticTest {

	public static void main(String[] args) {
		// 클래스 변수 사용법		==> 객체를 생성하지 않아도 사용할 수 있다.
		// 1) 클래스명.클래스변수	 
		// 2) 객체변수.클래스변수	
		
		InstanceStatic ex1 = new InstanceStatic(); // 객체를 생성하지 않아도 사용이 가능함.
		System.out.println("클래스변수 test값 출력하기");
		System.out.println(InstanceStatic.test);
		System.out.println(ex1.test);
		
		InstanceStatic.test = 500;
		System.out.println(ex1.test);
		ex1.test = 1000;
		System.out.println(ex1.test);
		System.out.println("--------------------------");
		//인스턴스변수
		// ==> 반드시 인스턴스(객체)를 생성한 후에 "객체변수"를 통해서 사용할 수 있다.
		ex1.x = 100;
		// InstanceStatic.x = 200; //오류 : 클래스명을 통해서는 접근할 수 없다.
		System.out.println("인스턴스 변수 x값 출력하기");
		System.out.println("ex1.x = 100; 명령 실행후 ");
		System.out.println("ex1.x = " + ex1.x);
		//System.out.println("InstanceStatic.x = " + InstanceStatic.x); // 오류
		System.out.println();
		System.out.println("--------------------------");
		
		// 인스턴스 메소드 호출
		ex1.instanceTestMethod();
		//InstanceStatic.instanceTestMethod(); // 클래스명으로 접근은 불가하다.
		System.out.println("--------------------------");
		// 클래스 메소드 호출
		ex1.classTestMethod(); 				// 객체변수를 이용한 호출
		InstanceStatic.classTestMethod();	// 클래스명을 이용한 호출
		System.out.println("--------------------------");
	}

}
