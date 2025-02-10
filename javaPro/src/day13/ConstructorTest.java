package day13;
/*
 	생성자 메소드
 	
 	1. new명령을 사용하여 객체(인스턴스)를 생성할 때 객체(인스턴스)를 생성한 후 자동으로 호출되는 메소드
 	
 	2. 모든 클래스는 생성자 메서드가 반드시 1개 이상 있어야 한다.
 	
 	3. 생성자 메서드의 이름은 '클래스'이름과 같다
 	
 	4. 생성자 메서드는 반환값이 없다.
 		(반환값이 없다고 해도 void 키워드를 기술하지 않는다.)
 	
 	5. 생성자 메서드를 하나도 만들지 않으면 컴파일러가 기본 생성자 메서드를 자동으로 만들어 준다.
 		(단, 생성자 메서드가 하나라도 있으면 기본 생성자 메서드를 자동으로 만들어 주지 않는다.
 			이 때 기본 생성자가 필요하면 직접 만들어줘야 한다.)
 	
 	6. 생성자 메서드를 사용하는 이유
 		- 객체 생성 후 다른 작업이 이루어 지기 전에 처리해야 할 작업이 있을 때 사용하거나 
 		- 멤버 변수들을 초기화 작업에 주로 사용된다.
 */

class Car{
	private String color;
	private String gearType;
	private int door;
	
	// 생성자 메서드가 하나도 없을 때 컴파일러가 자동으로 추가해주는 생성자 메서드 모양
	//public Car() { }
	//기본 생성자 메소드 이름과 클래스 이름이 같으면 생성자이다. 반환값(void)등이 없다. void 가 붙을시 생성자 취급을 하지 않는다.
	
	// 생성자의 매개변수를 지정하지 않으면 
	// 기본 값으로 "파랑","수동",4 가 설정되도록 생성자 메서드를 만들기
	
	//매개변수가 없는 생성자 ==> 기본 생성자
	public Car() {
		/*
		color = "파랑";
		gearType = "수동";
		door = 4;
		*/
		
		/*
		 	this() ==> 생성자 메소드에서 다른 생성자 메소드를 호출해 주는 메소드이다.
		 		   ==> 이 메소드는 다른 명령보다 제일 먼저 사용해야 한다.
		 */
		// 기존에 만들어진 생성자를 이용하기
		this("파랑","수동",4);
		
	}
	
	//매개변수가 있는 생성자
	public Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	public Car(String color,int door) {
		/*
		 	this ==> 자기 자신의 참조값을 갖는 변수로 모든 객체의 생성자와 인스턴스 메소드에 자동으로 만들어진다.
		 		 ==> 자기 자신 객체를 가리키는 참조변수이다.
		 	
		 */
		this.color = color;
		this.door = door;
		gearType = "자동";
	}
	
	// 결과를 확인하기 위한 메서드
	
	public void displayData() {
		System.out.println("Color : " + this.color);
		System.out.println("GearType : " + gearType);
		System.out.println("Door : " + door);
	}
	
	
	
}

public class ConstructorTest {

	public static void main(String[] args) {
		// 매개 변수가 없는 생성자를 호출해서 객체 생성하기
		Car myCar01 = new Car();
		myCar01.displayData();
		System.out.println("-----------------------");
		//매개 변수가 있는 생성자를 호출해서 객체 생성하기
		Car myCar02 = new Car("빨강","자동",2);
		myCar02.displayData();
		System.out.println("-----------------------");
		
		Car myCar03 = new Car("검정",3);
		myCar03.displayData();
		System.out.println("-----------------------");

	}

}
