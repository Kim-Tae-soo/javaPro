package day13;

/*
	Book 클래스 작성
	
	- 책 제목 , 지은이 , 출판사 , 출판년도를 멤버변수로 갖고
	이 멤버변수들의 값들을 출력하는 printBookInfo 메소드를 작성하시오.
	(모든 멤버 변수는 private으로 설정한다.)
	
	객체를 생성하는 방법
		Book(제목,지은이,출판사,출판년도)
		Book(제목, 출판사)
		Book(제목, 출판년도)
		
		아무것도 지정하지 않으면 기본값이 
			("혼자공부하는자바", "신용권", "한빛미디어",2019)
 */

class Book{
	
	private String Bookname ;
	private String Writer;
	private String publisher;
	private int year;
	
	
	
	public  Book(String Bookname , String Writer, String publisher, int year) {
		this.Bookname  = Bookname;
		this.Writer = Writer;
		this.publisher = publisher;
		this.year = year;
	}
	
	public  Book(String Bookname , String publisher) {
		this.Bookname  = Bookname;
		this.publisher = publisher;
	}
	
	public  Book(String Bookname , int year) {
		this.Bookname  = Bookname;
		this.year = year;
	}
	
	public Book() {
		this("혼자공부하는자바","신용권","한빛미디어",2019);
	}
	
	public void printBookInfo() {
		System.out.print("책 제목 : " + Bookname + "\t");
		System.out.print("지은이 : " + Writer + "\t");
		System.out.print("출판사 : " + publisher + "\t");
		System.out.println("출판년도 : " + year + "\t");
	}
		
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book myBook1 = new Book();
		myBook1.printBookInfo();
		System.out.println("------------------------------------------------------------------------");
			
		Book myBook2 = new Book("집에가고싶어요","김태수","태수서점",2024);
		myBook2.printBookInfo();
		System.out.println("------------------------------------------------------------------------");
		
		Book myBook3 = new Book("집에도착했어요","홈");
		myBook3.printBookInfo();
		System.out.println("------------------------------------------------------------------------");
		
		Book myBook4 = new Book("다시가야해요",2024);
		myBook4.printBookInfo();
		System.out.println("------------------------------------------------------------------------");
		
//		int[] a = new int[5]; //정수형 배열 선언 및 생성
//		int b;
//		Book myBook5;
		
		
		/* 
		 	객체형 배열 선언 및 생성
			형식 ) 클래스명[] 객체배열명 = new 클래스명[개수];
			==> 이 객체 배열의 각 요소에는 '클래스명'으로 만든 인스턴스의 참조값이 저장되는 배열이 된다.
		 */
		Book[] bookArr = new Book[3];
		
		// 배열 초기화
		bookArr[0] = new Book();
		bookArr[1] = new Book("다시 가야해요" , 2024);
		bookArr[2] = new Book("집에가고싶어요","김태수","태수서점",2024);
		
		//배열 정보를 이용한 처리
		for(int i =0; i<bookArr.length;i++) {
			System.out.println((i+1) + "번째 자료..");
			bookArr[i].printBookInfo();
			System.out.println("------------------------------------------------------------------------");
		}
	}
}