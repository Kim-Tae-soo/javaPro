package day10;

public class ArrayEx10Q2 {

	public static void main(String[] args) {
		/*
			문제) 아래와 같이 값을 저장할 수 있는 가변 배열을 생성하고 해당 값들로 초기화 한 후 출력하는 프로그램을 작성하시오
			
			예시) 
				0 1 2 3
				4
				5
				6 7 8 9		
		 */
		
		int[][] test = new int[4][];

		test[0] = new int[4]; 
		test[1] = new int[1]; 
		test[2] = new int[1]; 
		test[3] = new int[4]; 
		
		// 초기화
		int num = 0; // 각 배열 요소에 저장될 값을 정할 변수
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				//test[i][j] = num;
				//num++;
				test[i][j] = num++;
				
			}
		}
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
