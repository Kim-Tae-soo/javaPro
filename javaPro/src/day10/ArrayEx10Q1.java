package day10;

public class ArrayEx10Q1 {

	public static void main(String[] args) {
		/*
		   가변 배열의 선언 및 생성과 초기화를 동시에...
		 */
		
		int[][] test = new int[][] {
			{10,20,30},
			{100,200,300,400,500,600},
			{5,6}
		};
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
