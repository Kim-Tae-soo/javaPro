package kr.or.ddit.day14;

/*
 	기존에 만들어 놓은 클래스를 재사용하는 방법
 	
 	1) 상속관계 (is ~ a): ~은 ~ 이다.
 		==> 기존의 클래스를 확장하는 것.
 		
 	2) 포함관계 (has ~ a) : ~은  ~을 가지고있다.
 		==> 하나의 클래스의 멤버변수로 다른 클래스의 참조 변수를 사용하는 것
 */

class Engine{
	
}

class Tire{
	
}

class Door{
	
}

class Car{
	private Engine e = new Engine();
	private Tire t = new Tire();
	private Door d = new Door();
	String color;
}

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
