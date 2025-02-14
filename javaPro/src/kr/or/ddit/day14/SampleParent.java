package kr.or.ddit.day14;
/*
	상속
	
	- 기존의 클래스를 물려 받아 새로운 클래스를 만드는 것
	- 형식)
	class 자식클래스명 extends 부모클래스명 {
	
	}
	- 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려 받는다.
	- 하나의 클래스만 상속받을 수 있다. (단일 상속)
	- 상속 받지 않는 모든 클래스는 Object 클래스를 상속받는다. (extends Object)
	- 자식 클래스는 부모 클래스의 멤버 이외의 새로운 멤버(전역변수 등)을 가질 수 있으므로
	  자식 클래스는 부모 클래스보다 범위가 크거나 같다.
	- 두 개 이상의 클래스를 만드는데 공통된 멤버가 있는 경우에는 부모 클래스를 만들고
	  이 부모 클래스를 상속받아 만든다.
*/
public class SampleParent {
	
	String var;
	int score;
	String name;
	
	
	//인스턴스 초기화 블럭은 다양한 생성자를 이용하여 클래스를 만들 때 공통된 멤버를 초기화 하기 위해 사용한다.
	{
		var = "초기화 블럭은 물려주지 않는다.";
		this.score = 0;		
		
	}
	public SampleParent() {
		var = "생성자도 물려주지 않는다.";
		System.out.println("부모 클래스 생성!!!");
	}
	public SampleParent(String name) {
		this.name = name;
		
	}
	public int methodA(int a, int b) {
		return a+b;
	}

}
