package kr.or.ddit.day15;

class Parent2 {
	int x = 10;		//Parent2의 멤버변수
	int y = 20;		//Parent2의 멤버변수

	void print() {
		System.out.println("Parent2의 print() 메소드");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
}

class Child2 extends Parent2 {
	int x = 40;		//Child2의 멤버변수
	
	void childMethod() {
		System.out.println("Parent2에는 없고, Child2에만 있는 메소드");
	}
	
	// 메소드 오버라이딩 ==>  상속받은 메소드를 재정의 하는 것
	//		==>	 상속받은 메소드와 반환값, 메소드명, 매개변수 타입과 개수가 모두 일치해야 한다.
	@Override	//==> 오버라이딩되는 메소드를 명시적으로 나타내는 Annotation(어노테이션)
	void print() {
		int x = 80;		//지역변수
		System.out.println("Child2의 print() 메소드");
		
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
		System.out.println("y = " + y);
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		Child2 ch2 = new Child2();
		
		// 상속받은 클래스로 만든 객체에서 메소드를 호출하면 호출할 메소드를 찾는 순서
		// 1) 자신만의 메소드인지 찾는다.
		// 2) 먼저 재정의(Overriding)된 메소드를 찾는다.
		// 3) 2번이 없으면 부모 클래스에 정의되어 있는 메소드를 찾는다.
		
		

		ch2.childMethod();
		System.out.println("----------------------------------------");		
		ch2.print();
		System.out.println("----------------------------------------");
		
		// 부모 클래스로 선언된 참조변수에 자식 클래스로 만든 인스턴스의 참조값을 저장할 수 있다.
		// 이 때 자동으로 형변환이 이루어지는데 이것을 Upcasting 이라고 한다.
		// UpCasting이 된 객체 변수로는 부모 클래스 영역만 사용할 수 있다.
		// 단, 오버라이딩된 메소드는 자식쪽의 메소드가 호출된다.
		Parent2 p2 = new Child2(); // 업캐스팅
		System.out.println("p1.x = " + p2.x); // 부모쪽에 있는 x를 말하는 것이라 10이라고 출력이 예상됌
		System.out.println("----------------------------------------");
		p2.print();
	}

}
