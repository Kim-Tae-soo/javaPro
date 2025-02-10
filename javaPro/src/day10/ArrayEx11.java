package day10;

public class ArrayEx11 {

	public static void main(String[] args) {
		/*
		 
		 	- 향상된 for문
		 	형식) 	
		 		for(자료형이름 변수명 : 배열 또는 컬렉션){
		 			반복할 내용;
		 			...
		 			...
		 		}
		 		
		 	==> 배열의 요소값들을 차례로 '변수명'에 저장한 후 '반복할 내용들'을 처리한다.
		 	==> '자료형이름'은 배열의 각 요소값들의 자료형 이름과 같아야한다.
		 */
		//일반적인 for문 사용
		int[] test = new int[] {30,40,22,60,80,99,33,56};
		
		for(int i=0;i<test.length;i++) {
			int num = test[i];
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		
		//향상된 for문 사용
		
		for(int num : test) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		// 2차원 배열을 향상된 for문으로 처리하기
		
		int[][] test2 = new int [][] {
			{11,12,13,14},
			{21,22,23,24},
			{31,32,33,34}
		};
		
		for(int[] row : test2) {
			for(int value : row) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		for (int i = 0; i < test2.length; i++) {
			int[] row = test2[i];
			for (int j = 0; j < row.length; j++) {
				int value = row[j];
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	}

}
