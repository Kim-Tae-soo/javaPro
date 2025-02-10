package day11;

/*
 	문제) 계좌(Account) 클래스 설계
 	1) 속성 : 계좌번호 , 예금주 , 잔액
 	2) 기능 : 
 		- 예금하기 ==> 예금할 금액을 매개변수로 받아서 잔액을 증가
 		- 출금하기 ==> 출금할 금액을 매개변수로 받아서 잔액을 감소
 					(단, 출금액이 잔액보다 많을 경우 '잔액이 부족합니다' 메세지를 출력한다.)
 		- 잔액 출력한다.
 */

class Account {
	int num;
	int money;
	String name;

	void upmoney(int up) {
		System.out.println();
		System.out.println(up+"원이 입금되었습니다.");
		money += up;
	}

	void downmoney(int down) {
		if (money < down) {
			System.out.println();
			System.out.println(down+"원을 출금하시기에 현재 보유 잔액이 부족합니다.");
			
		} else {
			money -= down;
		}
	}
	
	int getMoney() {
		return money;
	}
	
	int getNum() {
		return num;
	}
	
	String getName() {
		return name;
	}
}

	public class AccountTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Account bank = new Account();
			
			bank.name = "홍길동";
			bank.money = 100000;
			bank.num = 02020202020;
			System.out.println("계좌번호 : " + bank.num);
			System.out.println("예금주 : " + bank.name);
			System.out.println("잔고 : " + bank.money + "원");
			
			bank.upmoney(100000);
			System.out.println("잔액 : " + bank.money + "원");
			
			bank.downmoney(1110000);
			System.out.println("잔액 : " + bank.money + "원");

		}
}
