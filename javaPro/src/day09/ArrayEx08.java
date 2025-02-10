package day09;

public class ArrayEx08 {

	public static void main(String[] args) {
		// 2차원 배열 ==> 배열의 배열
		int[][] test;
		
		test = new int [3][4]; // 3행 4열짜리 2차원 배열 생성
		
		// 각 요소 초기화
		test[0][0] = 110;
		test[0][1] = 120;
		test[0][2] = 130;
		test[0][3] = 140;
		
		test[1][0] = 210;
		test[1][1] = 220;
		test[1][2] = 230;
		test[1][3] = 240;
		
		test[2][0] = 310;
		test[2][1] = 320;
		test[2][2] = 330;
		test[2][3] = 340;
		
		//행의 개수 ==> 배열명.length // System.out.println("행의 개수 : " + test.length);
		//열의 개수 ==> 배열명[행번호].length // System.out.println("열의 개수 : " + test[1].length);
		
		// 2차원 배열의 전체 값들을 사용하려면 중첩 반복문을 사용한다.
		for (int i = 0; i < test.length; i++) { // 행의 개수만큼 반복
			for (int j = 0; j < test[i].length; j++) { // 열의 개수만큼 반복
				System.out.print(test[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("------------------------------");

		// 2차원 배열이 선언 및 초기화

		int[][] test2 = new int[][] { 
				{ 110, 120, 130, 140 }, // 0번행
				{ 210, 220, 230, 240 }, // 1번행
				{ 310, 320, 330, 340 } // 2번행
		};
		
		for (int i = 0; i < test2.length; i++) { // 행의 개수만큼 반복
			for (int j = 0; j < test2[i].length; j++) { // 열의 개수만큼 반복
				System.out.print(test2[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("------------------------------");

		
		
	}

}
