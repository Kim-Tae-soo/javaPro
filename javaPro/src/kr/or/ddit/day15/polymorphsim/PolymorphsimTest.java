package kr.or.ddit.day15.polymorphsim;


// 각 제품의 공통접을 뽑아서 부모 클래스를 만든다.

class Product{
	String name;		// 제품이름
	int price;			// 제품가격
	int point;			// 보너스 포인트 ( 가격의 10% )
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		point = (int) (price * 0.1);
	}
}

//Product를 상속받은 제품 클래스 작성
class Audio extends Product{
	public Audio(String name, int price) {
		super(name, price);
		
	}
	public Audio() {
		this("오디오",150);
	}
}

class Tv extends Product{
	public Tv(String name, int price) {
		super(name, price);
		
	}
	public Tv() {
		this("Tv",100);
	}
}

class Computer extends Product{
	public Computer(String name, int price) {
		super(name, price);
		
	}
	public Computer() {
		this("Computer",550);
	}
}

class Phone extends Product{
	public Phone(String name, int price) {
		super(name, price);
		
	}
	public Phone() {
		this("Phone",350);
	}
}

//---------------------------------------------------//

// 제품을 구매하는 사람을 나타내는 클래스
class Buyer{
	int money;		// 현재 금액
	int bPoint;		// 보너스 포인트
	
	// 구입한 제품 목록 저장할 배열 선언
	Product[] items = new Product[10]; // 10개 짜리 Product형 배열 생성
	int i = 0;	//배열 첨자 역할을 할 변수
	
	public Buyer(int money) {
		this.money = money;
		bPoint = 0;
		
	}
	public Buyer() {
		this(1000);
	}
	
	
	// 제품 구매를 처리하는 메소드 ==> 매개변수의 다형성
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println(p.name + "을(를) 구매할 수 없습니다.");
			System.out.println("현재 잔액 : " + money + "만원");
			System.out.println("제품 가격 : " + p.price + "만원");
			System.out.println("부족 금액 : " + (p.price-money) + "만원");
			return;			// 메소드 종료
		}
		money -= p.price;
		bPoint += p.point;
		System.out.println(p.name+"을(를) 구매했습니다.");
		System.out.println("현재 잔액 : " + money + "만원");
		System.out.println("적립된 포인트는 " + p.point + "포인트 입니다.");
		System.out.println("현재 누적 포인트는 " + bPoint + "포인트 입니다.");
		items[i++] = p; // 구매한 제품을 배열에 저장
	}
	// 구매한 제품 목록과 총 금액 출력하는 메소드
	
	public void summary() {
		int sum = 0;			// 총금액이 저장될 변수
		String itemList = "";	// 제품 목록이 저장될 변수
		
		for (int j = 0; j < items.length; j++) {
			if(items[j] == null) break; // 제품이 저장된 부분까지만 반복문이 작업되도록 한다.
			sum += items[j].price;
			itemList += items[j].name + "/";
			
		}
		
		System.out.println("구매한 제품 목록 : " + itemList);
		System.out.println("구매한 제품의 총 금액 : " + sum + "만원");
		
	}
}

public class PolymorphsimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		man.summary();

	}

}
