package day08;

import java.util.*;

public class ArrayEx04_HW2_SelectionSort2 {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 1, 3, 2, 9, 6, 8 };
		selectionSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			// 배열의 모든 요소를 순차적으로 정렬함
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
