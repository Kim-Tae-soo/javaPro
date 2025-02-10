package kr.or.ddit.day14;

/*
 	문제)
 	1. 계좌(Account) 클래스 설계
 		1) 속성 : 계좌번호, 예금주이름, 잔액
 		2) 기능 : 
 			- 예금하다.
 			- 출금하다.
 			- 잔액을 조회하다.
 */

class Account {
	String accNum; 	// 계좌번호
	String name;	// 예금주명
	int balance;	// 잔액
	
	//예금을 처리하는 메소드
	void deposit(int money) {
		balance += money;
	}
	
	// 출금을 처리하는 메소드
	void without(int money) {
		
		if(balance<money) {
			System.out.println("잔액이 부족합니다.");
		}else {
		balance -= money;
		}
	}
	
	void printBalance() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}
}

/*
  2. Account 클래스를 상속 받은 CheckingAccout 클래스 설계
  	1) 속성 : 카드번호
  	2) 기능 : 
  			- 지불하다. ==> 카드 번호와 출금액을 매개변수로 받아서 카드번호가 맞고 
  							출금액이 잔액 이하이면 출금이 이루어 지도록 한다.
  							(조건에 만족하지 않으면 '지불이 불가능합니다.'라는 메세지를 출력한다.)
 */

class CheckingAccoubt extends Account{
	String cardNo; // 카드번호
	
	void pay(String carNo, int money) {	// 매개변수값 => 카드번호 , 출금액
		if(!carNo.equals(this.cardNo)||money > balance) {
			System.out.println("지불이 불가능합니다.");
		}else {
			balance -= money;
		}
	}
}



public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccoubt myAccoubt = new CheckingAccoubt();
		myAccoubt.accNum = "123-456-7-89";
		myAccoubt.name = "고구마";
		myAccoubt.balance = 10000;
		myAccoubt.cardNo = "9080-1234-3213-4123";
		
		System.out.println("처음 잔액");
		myAccoubt.printBalance();
		System.out.println("=======================================");
		myAccoubt.deposit(20000);
		System.out.println("20000원 입금 후 ");
		myAccoubt.printBalance();
		System.out.println("=======================================");
		
		myAccoubt.without(50000);
		System.out.println("=======================================");
		myAccoubt.without(5000);
		System.out.println("5000원 출금 후");
		myAccoubt.printBalance();
		System.out.println("=======================================");
		
		System.out.println("잘못된 카드로 10000원 출금하기");
		myAccoubt.pay("9080-1234-3213-1111", 10000);
		myAccoubt.printBalance();
		System.out.println("=======================================");
		System.out.println("맞는 카드로 10000원 출금하기");
		myAccoubt.pay("9080-1234-3213-4123", 10000);
		myAccoubt.printBalance();
		
	}
}




