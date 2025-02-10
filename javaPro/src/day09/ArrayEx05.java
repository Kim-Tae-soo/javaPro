package day09;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 배열의 자료 정렬하기 (버블 정렬(sort))
		
		int [] numArr = new int [10];
		
		// 배열 값 초기화 ( 1 ~ 50 사이의 난수 값으로 초기화 )
		
		System.out.print("BEFORE >> ");
		

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 50 + 1);
			System.out.print(numArr[i] + " ");
					
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		// 정렬 구하기 ( 오름차순 기준 )
		// 전체 반복 횟수는 '배열개수 -1'번을 반복한다.

		for (int i = 0; i < numArr.length - 1; i++) {
			
			boolean changed = false; // 자료가 맞바뀌면 true 로 변경한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}

			}
			
			if (changed == false) { // 바뀐 자료가 하나도 없을 시에 멈춤
				break;
			}
			
			System.out.print((i+1)+"try >> ");
			for(int k=0; k<numArr.length; k++) {
				System.out.print(numArr[k]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		System.out.print("AFTER >> ");
		for(int k=0; k<numArr.length; k++) {
			System.out.print(numArr[k]+" ");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));
		System.out.println();

	}

}
