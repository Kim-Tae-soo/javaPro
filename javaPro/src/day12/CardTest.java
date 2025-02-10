package day12;

class Card{
	
	String kind;	//카드 종류(그림 무늬 종류 하트 크로바 등등)
	int number;		//카드 번호
	
	
	//모든 객체가 공통적인 크기를 갖는 정보이기 때문에 static으로 만든다.
	static int width = 60;			//카드의 가로 크기
	static int height = 100;		//카드의 세로 크기
	
}

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 5;
		
		System.out.println("카드의 크기를 출력하기 ==> 클래스명을 이용해서 접근");
		System.out.println("width : " + Card.width);
		System.out.println("height : " + Card.height);
		System.out.println();
		System.out.println("c1은 " + c1.kind + "" + c1.number + "이면 크기는( " + c1.width+" , "+c1.height+" )");
		System.out.println("c1은 " + c2.kind + "" + c2.number + "이면 크기는( " + c2.width+" , "+c2.height+" )");
		System.out.println();
		
		c1.width = 200;
		c2.height = 250;
		
		// 아래와 같이 사용하는 것이 권장사항
		Card.width = 200;
		Card.height = 250;
		
		System.out.println("c1은 " + c1.kind + "" + c1.number + "이면 크기는( " + c1.width+" , "+c1.height+" )");
		System.out.println("c1은 " + c2.kind + "" + c2.number + "이면 크기는( " + c2.width+" , "+c2.height+" )");
		System.out.println();
		
		
	}

}
