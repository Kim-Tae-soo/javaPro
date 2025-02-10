package day12;
/*
 	- 메소드 오버로딩(Overloading)	==> 메소드의 중복 정의
 		==> 같은 클래스에서 동일한 이름의 메소드를 여러개 만드는 것을 말한다.
 		==> 조건)
 			1. 메소드명을 같게 해야한다.
 			2. 매개변수의 개수가 다르게 만들거나
 			3. 매개변수의 자료형을 다르게 만든다.
 		==> 주의사항
 			1. 메소드의 반환값은 메소드의 오버로딩에 관계(상관) 없다.
 			2. 매개변수의 변수명도 오버로딩과 관계(상관) 없다.
 */

class MyMath {
	void test(int a, int b) {
		int c = a + b;
	}
	
	/* 아래는 위에와 중복되어서 오류가 발생함.
	
	// 메서드 오버로딩은 메서드명과 매개변수의 개수 또는 매개변수의 자료형을 가지고 구분한다.

	int test(int x, int y) { // 매개변수의 변수명은 오버로딩과 관계없다.
		int z = x + y;
		return z;

	}
	*/
	
	int test(int x) { // 위에는 매개변수가 2개 이거는 1개여서 구분할수 있어서 오류가 발생하지 않는다.
		return x * 10;
	}
	
	double test(int a, double b) { // 이것또한 첫번째인 int , int 와 int double의 차이가 있어서 오류가 발생하지 않는다.		
		return a / b;
	}
}

class OverLoadingEx{
	/*
	 	숫자 2개를 매개변수로 받아서 덧셈을 계산하는 메소드를 구현한다.
	 	단, 숫자는 int형, long형, float형 , double형, 자료가 올수 있다. 
	 		그리고 메서드 명은 add로 한다.
	 */
	
	int add(int a, int b) {
		System.out.println("int int");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("long long");
		return a + b;
	}

	float add(float a, float b) {
		System.out.println("float float");
		return a + b;
	}

	double add(double a, double b) {
		System.out.println("double double");
		return a + b;
	}
	
	
	
	
	
}

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadingEx ex = new OverLoadingEx();
		
		System.out.println(ex.add(100, 200));
		System.out.println(ex.add(100L, 20L));
		System.out.println(ex.add(2.f, 3.f));
		System.out.println(ex.add(3.0, 4.0));

	}

}
