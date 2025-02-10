package kr.or.ddit.day15;

/*
 	동물을 모델로한 클래스를 작성한다.
 	각 동물은 먹이가 서로 다르고, 먹는 방법, 이동하는 방법이 서로 다르다.
 	
 */

//공통점 : 속성 (이름, 먹이), 메소드(먹다, 움직이다)

abstract class Animal{	// 추상 메소드가 하나라도 있으면 자동으로 추상 클래스가 되기에 abstract를 붙여야한다.
	//추상 클래스도 일반 멤버 변수를 사용할 수 있다.
	String name;
	
	//생성자도 사용할 수 있다.
	public Animal(String name) {
		this.name = name;
	}

	abstract void eating();		//추상 메소드 선언 abstract
	abstract void moving();
}

//추상 클래스를 상속 받은 클래스 구현 (Tiger , Fox 만 작성해본다.)

class Tiger extends Animal{
	String eat = "소고기";
	
	public Tiger() {
		super("호랑이");
	}
	@Override
	void eating() {
		System.out.println(name + "은(는)" + eat +"를(을) 먹습니다.");
	}
	@Override
	void moving() {
		System.out.println(name + "은(는) 초원을 달려~");
	}
}

class Fox extends Animal{
	String eat = "양고기";
	
	public Fox() {
		super("여우");
	}
	@Override
	void eating() {
		System.out.println(name + "은(는)" + eat +"를(을) 먹습니다.");
	}
	@Override
	void moving() {
		System.out.println(name + "은(는) 초원을 달려~");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
		//추상 클래스는 인스턴스(객체)를 생성할 수 없다.
//		Animal ani = new Animal("여우"); // 사용불가
		
		// 추상 클래스의 자식 클래스로 객체를 생성한다.
		Tiger t = new Tiger();
		t.moving();
		t.eating();
		System.out.println();
		Fox f = new Fox();
		f.eating();
		f.moving();
		System.out.println();
		
		
		Animal ani2 = new Tiger();
		ani2.eating();
		ani2.moving();
		System.out.println();
		
		Animal ani3 = new Fox();
		ani3.eating();
		ani3.moving();
	}

}

/*
 	추상 클래스 정리
 	1) 완전하지 않은 미완성의 클래스
 	2) 추상 메서드가 하나라도 포함하고 있는 클래스
 		(추상 메서드 ==> 메서드의 선언부만 있고 구현부가 없는 메서드)
 	3) 클래스의 선언부에 abstract 키워드를 사용해야 한다.
 		(추상 메서드가 하나도 없어도 class 앞에 abstract 키워드를 사용하면 추상 클래스가 된다.)
 	4) 추상 클래스 자체는 미완성이기 때문에 직접 객체를 생성할 수 없고, 이 추상 클래스를 상속 받아 
 		모든 추상 메서드를 구현한 완전한 클래스를 이용해서만 객체를 생성할 수 있다.
 	5) 추상 클래스를 상속 받았지만 추상 메서드를 모두 구현하지 않으면 이 클래스도 추상 클래스가 된다.
 	
 	- 추상 메서드가 하나도 없는 추상 클래스를 사용하는 이유
 		==> 추상 클래스를 무조건 사속 받도록 하기 위해서..
 */
