package kr.or.ddit.day15;

class Parent{
	String name;	//이름
	int money;		//자산
	
	//기본생성자
	//public Parent() {}
	
	
	//
	public Parent(int money) {
		this.money = money;
		name = "이순신";
	}
	
}

class Child extends Parent{
	String name; // 자식이름
	//생성자
	public Child(String name) {
	// 생성자의 첫 줄에는 this() 메소드나 super()메소드 중 한가지를 반드시 기술해야 한다.
	// 자식 클래스의 생성자에는 반드시 부모클래스의 생성자를 호출하는 super() 메소드가 있어야 한다.
	// this()메소드나 super() 메소드를 호출하는 명령이 없으면 컴파일러가 자동으로 추가해준다.
		//super(); // 매개변수가 없는 생성자를 호출함
		//super(10000);
		//this.name = name;
		this(name,10000);
	}
	public Child(String name, int money) {
		super(money);
		this.name = name;
		
	}
	// 변수를 찾는 순서
	// 지역변수 --> 자신의 멤버변수 --> 부모의 멤버변수
	
	
	
	//'this.변수명' 일 경우 찾는 순서
	// 자신의 멤버변수 --> 부모의 멤버변수
	void printData() {
		money += 5000;
		System.out.println("부모이름 : " + super.name);
		System.out.println("자식이름 : " + name);
		System.out.println("자식이름 : " + this.name);
		System.out.println("자산1 : " + money);
		System.out.println("자산2 : " + this.money);
		System.out.println("자산3 : " + super.money);
	}
}



public class InheritanceTest02 {

	public static void main(String[] args) {
		Child ch1 = new Child("이몽룡");
		ch1.printData();
		
		System.out.println("======================");
		
		Parent p1 = new Parent(1000);
		System.out.println("p1.name : " + p1.name);
		System.out.println("p1.moeny : " + p1.money);
		

	}

}
