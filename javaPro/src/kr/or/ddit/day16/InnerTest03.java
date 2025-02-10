package kr.or.ddit.day16;

import java.util.Iterator;

public class InnerTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InnerTest03 test = new InnerTest03();
//		test.callLocal();
		
		new InnerTest03().callLocal();

		
	}
	// 인스턴스 메서드 구현
	public void callLocal() {
		// 이 메서드에서 주소록을 관리하는 처리를 하려고 한다.
		// 이 메서드에서만 사용할 내부 클래스를 작성해 보자.
		// 클래스 이름 : PhoneBook;
		// 멤버 변수 : 이름 , 전화번호 , 주소
		
		// 이 주소록은 배열을 이용해서 관리된다.
		
		class PhoneBook{
			String name;
			String tel;
			String addr;
			
			public PhoneBook(String name, String tel, String addr) {
				super();
				this.name = name;
				this.tel = tel;
				this.addr = addr;
			}
		}
		
		PhoneBook[] pbArr = new PhoneBook[10];
		int i = 0;
		
		pbArr[i++] = new PhoneBook("홍길동", "010-1234-5678", "대전 중구 오류동");
		pbArr[i++] = new PhoneBook("일지매", "010-2222-2222", "대전 유성구 장대동");
		pbArr[i++] = new PhoneBook("김철민", "010-4442-3332", "중국 청도");
		pbArr[i++] = new PhoneBook("권성운", "010-9999-5552", "아르헨티나 부에노스뭐시기");
		
		PhoneBook pb = new PhoneBook("큰형님", "010-1111-3333", "일본 오사카");
		pbArr[i++] = pb;
		
		for(PhoneBook myPb : pbArr) {
			if(myPb == null) break;
			
			System.out.println("[" + myPb.name +" 의 연락처]");
			System.out.println("전화번호 : " + myPb.tel);
			System.out.println("주소 : " + myPb.addr);
			System.out.println("--------------------------------------------------------");
		}
	}

}
