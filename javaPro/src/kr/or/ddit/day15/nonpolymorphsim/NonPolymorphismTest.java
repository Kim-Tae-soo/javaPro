package kr.or.ddit.day15.nonpolymorphsim;

/*
  제품 ==> Audio, Tv, Computer, Phone
 	==> 제품 가격의 10%를 보너스 포인트로 지급한다.
*/

class Audio {
	String name;		// 제품이름
	int price;			// 제품가격
	int point;			// 보너스 포인트 (가격의 10%)
	
	public Audio(String name, int price) {
		this.name = name;
		this.price = price;
		point = (int)(price * 0.1); //int형으로 형변환
		
	}
	public Audio() {
		this("오디오",150);
	}
}

class Tv{
	String name;		// 제품이름
	int price;			// 제품가격
	int point;			// 보너스 포인트 (가격의 10%)
	
	public Tv(String name, int price) {
		this.name = name;
		this.price = price;
		point = (int)(price * 0.1); //int형으로 형변환
		
	}
	public Tv() {
		this("Tv",100);
	}
}

class Computer{
	String name;		// 제품이름
	int price;			// 제품가격
	int point;			// 보너스 포인트 (가격의 10%)
	
	public Computer(String name, int price) {
		this.name = name;
		this.price = price;
		point = (int)(price * 0.1); //int형으로 형변환
		
	}
	public Computer() {
		this("컴퓨터",550);
	}
}

class Phone{
	String name;		// 제품이름
	int price;			// 제품가격
	int point;			// 보너스 포인트 (가격의 10%)
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
		point = (int)(price * 0.1); //int형으로 형변환
		
	}
	public Phone() {
		this("스마트폰",350);
	}
}

//---- 위가 제품과 관련된 클래스 -----

//제품을 구매하면 사람을 나타낸 class
class Buyer{
	int money;		// 현재 금액
	int bPoint;		// 보너스 포인트
	
	public Buyer(int money) {
		this.money = money;
		bPoint = 0;
		
	}
	public Buyer() {
		this(1000);
	}
	
	// 제품을 구매할 때 처리하는 메소드
	// Audio 제품을 구매
	public void buy(Audio a) {
		if(money < a.price) {
			System.out.println(a.name + "을(를) 구매할 수 없습니다.");
			System.out.println("현재 잔액 : " + money);
			System.out.println("제품 가격 : " + a.price);
			System.out.println("부족 금액 : " + (a.price-money));
			return;
		}
		money -= a.price;
		bPoint += a.point;
		System.out.println(a.name+"을(를) 구매했습니다.");
		System.out.println("현재 잔액 : " + money);
		System.out.println("현재 누적 포인트는 " + bPoint + "포인트 입니다.");
		
		
	}
	
	// Tv 제품을 구매
	public void buy(Tv v) {
		if(money < v.price) {
			System.out.println(v.name + "을(를) 구매할 수 없습니다.");
			System.out.println("현재 잔액 : " + money);
			System.out.println("제품 가격 : " + v.price);
			System.out.println("부족 금액 : " + (v.price-money));
			return;
		}
		money -= v.price;
		bPoint += v.point;
		System.out.println(v.name+"을(를) 구매했습니다.");
		System.out.println("현재 잔액 : " + money);
		System.out.println("현재 누적 포인트는 " + bPoint + "포인트 입니다.");
		
		
	}
	
	// Computer 제품을 구매
	public void buy(Computer c) {
		if(money < c.price) {
			System.out.println(c.name + "을(를) 구매할 수 없습니다.");
			System.out.println("현재 잔액 : " + money);
			System.out.println("제품 가격 : " + c.price);
			System.out.println("부족 금액 : " + (c.price-money));
			return;
		}
		money -= c.price;
		bPoint += c.point;
		System.out.println(c.name+"을(를) 구매했습니다.");
		System.out.println("현재 잔액 : " + money);
		System.out.println("현재 누적 포인트는 " + bPoint + "포인트 입니다.");
		
		
	}
	
	// Phone 제품을 구매
	public void buy(Phone p) {
		if(money < p.price) {
			System.out.println(p.name + "을(를) 구매할 수 없습니다.");
			System.out.println("현재 잔액 : " + money);
			System.out.println("제품 가격 : " + p.price);
			System.out.println("부족 금액 : " + (p.price-money));
			return;
		}
		money -= p.price;
		bPoint += p.point;
		System.out.println(p.name+"을(를) 구매했습니다.");
		System.out.println("현재 잔액 : " + money);
		System.out.println("현재 누적 포인트는 " + bPoint + "포인트 입니다.");
		
		
	}
}


public class NonPolymorphismTest {

	public static void main(String[] args) {
		Tv tv = new Tv();				// 100
		Audio audio = new Audio();		// 150
		Computer com = new Computer();	// 550
		Phone phone = new Phone();		// 350
		
		Buyer man = new Buyer();
		System.out.println("현재 금액 : " + man.money + "만원");
		System.out.println("현재 포인트 : " + man.bPoint + "포인트");
		System.out.println("--------------------------------");
		man.buy(tv);
		System.out.println("현재 금액 : " + man.money + "만원");
		System.out.println("현재 포인트 : " + man.bPoint + "포인트");
		System.out.println("--------------------------------");
	
		man.buy(audio);
		System.out.println("현재 금액 : " + man.money + "만원");
		System.out.println("현재 포인트 : " + man.bPoint + "포인트");
		System.out.println("--------------------------------");
		
		man.buy(phone);
		System.out.println("현재 금액 : " + man.money + "만원");
		System.out.println("현재 포인트 : " + man.bPoint + "포인트");
		System.out.println("--------------------------------");
		
		man.buy(com);
		System.out.println("현재 금액 : " + man.money + "만원");
		System.out.println("현재 포인트 : " + man.bPoint + "포인트");
		System.out.println("--------------------------------");
		
		


	}

}