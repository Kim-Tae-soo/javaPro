package kr.or.ddit.day17;

class Person {
	String name;
	int age;
	String addr;

}

class Person2 {
	private String name;
	int age;
	String addr;
	
	
	public String getName() {
		if(this.name == null) {
			return "즐";
		}
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		if(age<0) {
			System.out.println("dddd");
		}
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		new PersonTest().startPerson();
	}

	public void startPerson() {
		Person p1 = new Person();

		p1.name = "홍길동";
		int num = 20;
		if (num > 0) {
			p1.age = num;
		} else {
			System.out.println("나이는 음수로 지정할수 없습니다.");
		}
		printPerson(p1);
		p1.addr = "대전";
		
		Person2 pp = new Person2();
		pp.setName("홍길동");
		pp.setAge(20);
		pp.setAddr("대전");
		printPerson2(pp);
		
		

//		Person p2 = new Person();
//		p2.name = "으아";
//		p2.age = -1;

	}

	public void printPerson(Person p) {
		if (p.name != null) {
			System.out.println("이름 : " + p.name);
		} else {
			System.out.println("이름 : 오류");
		}

		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		System.out.println("주소 : " + p.addr);

	}
	
	public void printPerson2(Person2 p) {
		if (p.getName() != null) {
			System.out.println("이름 : " + p.getName());
		} else {
			System.out.println("이름 : 오류");
		}

		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("주소 : " + p.getAddr());

	}

}
