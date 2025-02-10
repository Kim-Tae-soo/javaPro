package day08;

import java.util.*;

public class ArrayEx04_Q1 {

	public static void main(String[] args) {
		/*
	 		문제) 년도를 입력 받아 해당 년도의 간지를 출력하시오.
	 		(단, 서기 1년은 '신유'년이다. )
	 		10간 : 갑,을,병,정,무,기,경,신,임,계
	 		12지 : 자,축,인,묘,진,사,오,미,신,유,술,해
		 */
	
	      Scanner scanner = new Scanner(System.in);

	        //String[] gan = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};
	        //String[] ji = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

	        String[] gan = { "경","신", "임", "계", "갑", "을", "병", "정", "무", "기"};
	        String[] ji = {"신","유" ,"술" ,"해" ,"자" ,"축" ,"인" ,"묘" ,"진" ,"사" ,"오" ,"미"};
	        
	        System.out.print("년도 입력 : ");
	        int year = scanner.nextInt();

	        String ganji = gan[year%10] + ji[year%12];

	        int ganIndex = (year  % 10); 
	        int jiIndex = (year % 12);  
	        
	        System.out.println(year+"년은"+ganji+"입니다.");
	        System.out.println(year + "년은 " + gan[ganIndex] + ji[jiIndex] + "년입니다.");

	        scanner.close();

	}

}
/*
	17,18번 줄 10간 12지 순서가 저건 맞는데 배열에 있는 값을 쓰려면 20 , 21번 줄로 변경하여서 사용함
	28,29번 줄 배열은 0부터 시작하기에 1을 입력을 하게되면 - 0 이 나온다 배열의 순서에 따라 다를 수 있음 
	ex) 서기 1년은 신유년이다 내가 작성한 배열에서는 신과 유가 0의 자리에 있기에 1년을 입력했을때 1-1 = 0의 배열자리를 찾아 신유년이 출력된다.
	추가로 32번줄에 배열을 추가하여 0의 배열자리 값을 저장하여 출력 되게 한다.
	

*/