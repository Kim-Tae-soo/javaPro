package kr.or.ddit.day16;

class Unit {
	int hp = 100;
	int x, y;
}

// interface는 실제 구현이 없는 추상 메서드와 값을 변경할 수 없는 상수만 멤버로 가질수 있다
// 단 static 메서드와 디폴트 메서드가 존재할수있다.

interface Movable {
	// interface에 선언된 메서드는 모두 추상 메서드이다.
	// 그러므로 메서드 앞에 public abstract 가 붙어야 하지만 이 키워드는 생략할 수 있다.
	// (이 키워드를 생략하면 컴파일러가 자동으로 붙여준다.)
	void move(int x, int y);

}

interface Attackable {
	void attack(Unit u);
}

// interface는 다른 interface를 상속 받을 수 있다.
// 이 때 키워드는 extends이고, interface의 상속은 여러개를 다중으로 상속받을 수 있다.
interface Fightable extends Movable,Attackable{
	
}

// interface를 구현(implemnts) 하는 클래스는 interface에 선언된 메서드 들을 모두 구현해야한다.
// 하나라도 구현이 안되어 있으면 이 클래스는 추상클래스가 된다.
// class Fighter extends Unit implements Movable, Attackable 
class Fighter extends Unit implements Fightable{
	// interface에 선언된 메서드를 구현할 때는 public 접근 제한자 키워드를 반드시 붙여야 한다.
	@Override
	public void attack(Unit u) {
		u.hp -= 10;

	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;

	}

}

public class InterfaceTest02 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit u = new Unit();
		
		f.move(100, 200);
		System.out.println("현재 위치 : " + f.x +", "+ f.y);
		f.attack(u);
		System.out.println("현재 체력 : " + u.hp);
		
		// Unit 클래스에는 move()메서드와 attack()메서드가 선언되거나
		// 구현되어 있지 않기 때문에 사용할 수 없다.
		// ex) u.attack(f); // u.move(200,300);
		
		Movable m = new Fighter();
		m.move(200, 300);
		
		
		/* Movable 형 객체변수로는 move()메서드만 사용이 가능하다.
		m.attack(u);
		System.out.println(m.hp);
		System.out.println(m.x);
		System.out.println(m.y);
		*/
		
		Attackable a = new Fighter();
		a.attack(u);
		//a.move(100,200); //오류가 발생함
		
		Fightable ff = new Fighter();
		ff.attack(u);
		ff.move(200,300);
//		System.out.println("현재 위치 : " + ff.x + ff.y); // 오류발생
		
		System.out.println("---------------------------------------------------------");
		
		if(f instanceof Fighter) {
			System.out.println("Fighter 클래스의 인스턴스");
		}
		
		if(f instanceof Unit) {
			System.out.println("Unit 클래스의 인스턴스");
		}
		
		if(f instanceof Fightable) {
			System.out.println("Fightable 인터페이스의 인스턴스");
		}
		
		if(f instanceof Movable) {
			System.out.println("Movable 인터페이스의 인스턴스");
		}
		
		if(f instanceof Attackable) {
			System.out.println("Attackable 인터페이스의 인스턴스");
		}
		
		if(f instanceof Object) {
			System.out.println("Object 클래스의 인스턴스");
		}
	}

}
