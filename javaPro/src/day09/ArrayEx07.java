package day09;

public class ArrayEx07 {

	public static void main(String[] args) {
		/*
		 	main()메서드의 파라미터 변수 (String[] args)의 역할 알아보기
		 	
		 	==> 자바 프로그램을 실행할 때 넘겨주는 인자값을 받아서 저장하는 변수이다.
		 	
		 	==> 인자값이 있는 자바 프로그램을 실행하는 방법
		 	형식 ) java 패키지명.클래스파일명 인자값들
		 	
		 	==> 인자값들은 main()메서드의 파라미터 변수에 String배열 형태로 자동으로 저장된다.
		 		(인자값들의 구분의 공백을 기준으로 하고, 만약 공백이 포함된 문자열을 하나의 인자값으로 처리하려면 큰 따옴표("")로 묶어주면 된다.)
		 		
		 */
		
		//인자값 출력하기
		System.out.println("인자값의 개수 ==> " + args.length);
		
		if(args.length==0) {
			System.out.println("인자값이 1개이상 필요합니다..");
		}else {
			System.out.println("인자값들...");
			for(int i=0; i<args.length; i++) {
				System.out.println((i+1) + "번째 인자값 : " + args[i]);
			}
		}
	}

}
