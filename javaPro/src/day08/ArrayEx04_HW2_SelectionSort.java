package day08;

import java.util.*;

public class ArrayEx04_HW2_SelectionSort {
			static int[] nums;
	public static void main(String[] args) {
		/*
		 	2.선택정렬(Selection Sort) : 대상에서 가장 크거나 작은 데이터를 찾아가 선택을 반복하면서 정렬하는 방식 
		 */
		

		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		System.out.println("BEFORE");
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length - 1; i++) {
			//현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
			int MinIndex = i;
			// 탐색을 진행하며, 가장 작은 값을 찾는다.
			for(int j = i + 1; j<nums.length; j++) {
				if(nums[MinIndex] > nums[j])
					MinIndex = j;
			}
			//탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위츠를 바꾸어준다.
			int temp = nums[MinIndex];
			nums[MinIndex] = nums[i];
			nums[i] = temp;			

		}
		System.out.println();
		System.out.println("AFTER");
		System.out.println(Arrays.toString(nums));

	}

}
