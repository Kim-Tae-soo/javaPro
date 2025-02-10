package day10;

public class ArrayEx10 {

	public static void main(String[] args) {
		/*
		 	2차원 가변배열 ==> 열의 개수가 서로 다르게 설정된 배열
		 	
		 	- 선언하는 방법은 보통의 2차원 배열의 선언 방법과 같다.
		 	
		 	- 배열 생성하기 (열의 개수를 생략하여 생성한다.) 
		 		자료형이름 [][] 배열명 = new 자료형이름[행수][]
		 		ex) int[][] sum = new int[3][];
		 		
		 	- 각 열들은 1차원 배열을 생성해서 저장한다.
		 		ex) 배열명[0] = new 자료형이름[열의 개수1];
		 			배열명[1] = new 자료형이름[열의 개수2];
		 			배열명[2] = new 자료형이름[열의 개수3];
		 			
		 */
		
		int[][] test = new int[3][];

		test[0] = new int[4]; // 1행은 4열
		test[1] = new int[2]; // 2행은 2열
		test[2] = new int[6]; // 3행은 6열

		// 각 행별 각각의 열의 자리에 1~100사이의 난수 초기화

		for (int i = 0; i < test.length; i++) { // 행수
			for (int j = 0; j < test[i].length; j++) { // 각 행의 열수
				test[i][j] = (int) (Math.random() * 100 + 1);
			}
		}

		// 자료 출력
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
	}
}