package day13;

import java.util.Scanner;

/*
	회원 정보를 저장하는 Member 클래스 작성하기
	1) 멤버변수 : 아이디(문자열), 나이(정수) 
				(멤버 변수는 모두 private로 지정한다.)
	2) 회원정보를 출력하는 메서드를 작성한다.
	3) 생성자 :  기본 생성자와
				(아이디, 나이) 를 매개변수로 받아서 초기화는 생성자
----------------------------------------------------------
	==> 3명의 회원 정보를 저장하는 프로그램을 작성하시오.
		- 아이디와 나이는 키보드로 입력 받아 저장한다.
		- 자료 입력이 모두 완료되면 전체 회원 정보를 출력한다.
 */


class Member{
	
	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	public Member() { }
	
	public void printMember() {
		System.out.println("아이디 : " + this.id);
		System.out.println("나이 : " + this.age);
		System.out.println("------------------------");
	}
	
}


public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member[] memArr = new Member[3];
		
		for(int i=0; i<memArr.length; i++) {
			System.out.println((i+1) + "번째 회원..");
			System.out.println("아이디를 입력하세요 : ");
			String id = sc.next();
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();		
			
			memArr[i] = new Member(id,age);
		}
		System.out.println("입력 끝");
		
	//	for(int i =0; i<memArr.length;i++) {
	//		System.out.println((i+1) + "번째 회원..");
	//		memArr[i].printMember();		
	//	}
		
		for(Member mem : memArr) {
			mem.printMember();
			
		}
	}
}
