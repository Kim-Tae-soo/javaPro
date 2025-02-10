package day11;

class TestAccount {
	String accNum;
	String name;
	int balance;

	void deposit(int money) {
		balance += money;

	}

	void without(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return; // 메소드를 끝내고 자기를 실행했던 부분으로 돌아가라 상황에 맞게 리턴을 주는게 좋긴함
		} else {
			balance -= money;
		}
	}

	void printBalance() {
		System.out.println("계좌번호 : " + accNum);
		System.out.println("예금주 : " + name);
		System.out.println("현재 잔액 : " + balance + "원");
	}
}

public class AccountTest1 {

	public static void main(String[] args) {
		TestAccount acc = new TestAccount();
		acc.accNum = "123-456-7-89"; //계좌번호 저장
		acc.name = "홍길동";
		
		System.out.println("처음상태");
		acc.printBalance();
		System.out.println("-------------------------");
		
		acc.deposit(26000);
		System.out.println("두 번쨰 상태");
		acc.printBalance();
		System.out.println("-------------------------");
		acc.without(36000);
		System.out.println("세 번쨰 상태");
		acc.printBalance();
		
	}

}
