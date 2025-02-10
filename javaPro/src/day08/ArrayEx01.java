package day08;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		 
		 	배열
		 	1. 배열 선언
		 		형식1) 자료형이름[] 배열변수명;
		 		형식2) 자료형이름 배열변수명;
		  
		 */ 
		
		int [] numArr;
		int argArr[];
		
		/*
			2. 배열 생성
				형식) 배열변수명 = new 자료형이름[개수]
		 
		 */
		
		numArr = new int[10];	//10개짜리 int형 배열 생성 ==> index 값이 10
		argArr = new int[5];	//5개짜리 int형 배열 생성 ==> index 값이 5
		
		/*
		 	3. 배열의 초기화
		 		형식) 배열변수명[첨자] = 값;
		 		
		 		--> 첨자(index)는 0부터 시작한다.
		 		--> '값'은 배열의 자료형과 일치해야 한다.
		 		--> 초기화를 하지 않으면 배열은 기본값으로 자동 초기화한다.
		 			( 기본값 : 숫자형 ==> 0 
		 					 문자형 ==> \u0000 (코드값으로 숫자형으로 따지면 0)
		 					 논리형 ==> false
		 					 참조형 ==> null )
		 */
		argArr[0] = 9;   // ==> 배열에 데이터를 넣어부림
		argArr[1] = 33;
		argArr[2] = 20;
		argArr[3] = 45;
		argArr[4] = 66;
	//	argArr[5] = 77; ==> 배열의 첨자 범위를 벗어나서 사용하면 ArrayIndexOutOfBoundException(오류)가 발생한다.
		
	//  배열변수명.length ==> 배열위 개수를 나타내는 명령어
		
		System.out.println("numArr의 개수 : " + numArr.length);
		System.out.println("argArr의 개수 : " + argArr.length);
		System.out.println();
		
		for(int i=0; i<argArr.length; i++) {
			System.out.println("arrArr[" + i + "] = " + argArr[i]); // arrArr 배열의 데이터를 출력하는 명령어 반복문을 사용
		}
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		/*
			
			배열 초기화를 한번에 처리하기
		 */
		
		
		int[] score1; //배열 생성 및 초기화
		score1 = new int[] {90, 80, 70, 60, 50};
		 
		int[] score2 = new int[] {90, 80, 70, 60, 50}; // 배열 선언, 생성 , 초기화
		
		int[] score3 = {90,80,70,60,50};
		/*
		 * int[] score4; score4 = {90,80,70,60,50}; // 사용 불가
		 */
		
		int[] test1;
		int[] test2;
		
		// 얕은 복사 ==> 주소 값을 복사하여 같은 메모리를 가리키게 하는 것
		// 깊은 복사 ==> 데이터 자체를 통체로 복사하는 것
		
		
		//얕은 복사
		test1 = score3;
		System.out.println("(얕은 복사 사용전)변경전");
		for(int i=0; i<score3.length; i++) {
			System.out.print(score3[i] + " ");
		}
		System.out.println();
		
		test1[2] = 100;
		
		System.out.println("(얕은 복사 사용후) 변경후");
		for(int i=0; i<score3.length; i++) {
			System.out.print(score3[i] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		
		//깊은 복사
		test2 = new int[score2.length];
		
		for(int i=0; i<score2.length; i++) {
			test2[i] = score2[i]; 
		}
		
		System.out.println("(깊은 복사 사용전)변경전");
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();
		
		test2[2] = 100;

		System.out.println("(깊은 복사 사용후)변경후");
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();
		
	}

}
