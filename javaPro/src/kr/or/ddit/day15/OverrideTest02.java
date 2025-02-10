package kr.or.ddit.day15;

import java.util.Objects;

/*
 	JAVA에서의 상속은 단일 상속만 지원되고 JAVA의 객체 중에서 최상위 객체는 0bject 객체 이다. 
 	Object 객체에는 toSting()메소드, equals()메소드 등이 정의되어 있다.
 	
 	'toString()' 메소드는 보통 해당 객체의 이름과 참조값을 문자열로 반환하도록 작성되어 있다.
 	
 	'equals()'메소드는 보통 두 객체가 같은지 여부를 비교한다.
 		==> 같으면 true 다르면 false를 반환한다.
 */

class Person{
	protected String name;		//이름
	protected int age;			//나이
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Person() {
		this("홍길동",20);
	}
	
	@Override
	public String toString() {
		// return "가나다라";
		
		// object에 작성된 내용
		// return getClass().getName() + "@" + Integer.toHexString(hashCode()); // 16진수

		
		return "Person [name = "+ name + ",age = " + age + "]";		// 객체가 가지고있는 데이터를 한 눈에 확인하는 방법
	}
	
	// Person 객체의 name과 age가 같으면 같은 객체로 처리하기 위한 equals()메소드 오버라이딩 작업하기
	@Override
	public boolean equals(Object obj) { //equals의 매개변수는 오브젝트로 받는다. 오브젝트 = 자바의 객체중 가장 최상위 부모중에서도 최상위
		if(this == obj) {
			return true;
		}
		if(obj == null){
			return false;
		}
		// 클래스의 종류가 같은지 비교하는 조건문
		if(getClass() != obj.getClass()) {
			return false;
		}
		// 매개변수로 받은 비교 객체를 현재의 객체형으로 형변환한다.
		Person that = (Person)obj; // obj형변환 하는이유 : 자식쪽의 데이터를 사용하기 위해서
		
		return age == that.age && Objects.equals(name, that.name); //Objects.equals 문자열 비교할때 사용 NULL값까지 비교함
	}
}

class Minsu extends Person{
	String addr;		// 주소
	
	public Minsu() {
		super("강민수",32);
		addr = "대전시";
	}
	@Override
	public String toString() {
		return getClass().getName() + "[name = " + name + ", age = " + age + ",addr = " + addr + " ]";
	}
}

public class OverrideTest02 {

	public static void main(String[] args) {
		OverrideTest02 ot = new OverrideTest02();
		System.out.println(ot);	// 객체변수만을 이용하여 출력하면 자동으로 '객채변수명.toString()' 메소드가 호출된다.
		System.out.println(ot.toString());
		System.out.println("===================================");
		
		Person p1 = new Person();
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println("===================================");
		
		Minsu m1 = new Minsu();
		System.out.println(m1.toString());
		System.out.println(m1);
		System.out.println("===================================");
		
		Person p2 = new Minsu();  //upcasting
		System.out.println(p2);
		System.out.println("===================================");
		// System.out.println(p2.addr); // 오류발생
		
		
		
		//UpCasting으로 부모 클래스의 참조변수가 가리키는 객체를 실제 클래스의 참조변수에 저장하는 것을 DownCasting이라 하고
		//이 떄는 cast 연산자를 이용하여 강제 형변환을 해야 한다.
		Minsu m2 = (Minsu)p2; // downcasting ==> 사용시 반드시 형변환을 해줘야함.
		System.out.println(m2.addr);
		System.out.println("===================================");
		
		/*instanceof 연산자
			형식) 객체변수 instanceof 클래스명
				==> '객체변수'가 가리키는 인스턴스가 '클래스명'의 인스턴스이면 true, 그렇지 않으면 false가 된다.
				==> 부모 참조 변수에 저장된 자식 인스턴스를 확인할 때 주로 사용한다.
		*/
		System.out.println("p1 instanceof Person ==> "  + (p1 instanceof Person));
		System.out.println("p2 instanceof Minsu ==> "  + (p2 instanceof Minsu));
		System.out.println("p2 instanceof Person ==> "  + (p2 instanceof Person));
		System.out.println();
		System.out.println("m1 instanceof Minsu ==> "  + (m1 instanceof Minsu));
		System.out.println("m1 instanceof Person ==> "  + (m1 instanceof Person));
		System.out.println("===================================");
		
		//두 객체 비교하기
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = p3;
		
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		System.out.println();
		
		System.out.println(p3 == p4); // == p3와 p4의 참조값을 비교하는것
		System.out.println(p3 == p5); // == p3와 p5의 참조값을 비교하는것
		System.out.println();
		
		System.out.println(p3.equals(p4));
		System.out.println(p3.equals(p5));  //오브젝트의 eqauls는 참조값을 비교하는 것과 똑같다.
		System.out.println();
		
		Person p6 = new Person("이몽룡",20);
		System.out.println(p3.equals(p6));
		
		
	}

}
