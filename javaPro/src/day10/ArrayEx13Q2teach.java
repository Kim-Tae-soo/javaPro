package day10;

import java.util.*;

public class ArrayEx13Q2teach {
	
	/*
 	
 	문제2) 정수형 1차원 배열 2개를 매개변수로 받아서 첫번째 배열과 두번째 배열을 합친 후 
	  합쳐진 배열을 반환하는 메서드를 작성하시오.
	
	 */
	
	public static int[]concatArray(int[] arr1, int[] arr2){
		int[] temp = new int[arr1.length + arr2.length];
		
		/* 방법1) 반복문으로 처리하기
		
		// 첫번쨰 배열은 temp배열의 0번째부터 저장하기
		for(int i=0; i<arr1.length;i++) {
			temp[i] = arr1[i];
		}
		
		// 두번째 배열은 temp배열의 첫번째 배열의 크기 위치부터 저장하기
		for(int i=0; i<arr2.length;i++) {
			temp[arr1.length+i] = arr2[i];
		}
		return temp;
		*/
		
		// 방법2) arraycopy 메서드 사용
		System.arraycopy(arr1, 0, temp, 0, arr1.length);
		System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
		return temp;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int []test1= {10,20,30,40,50,60,70};
		int []test2= {100,200,300};
		
		int[] result = concatArray(test1,test2);
		
		System.out.println("test1 ==> " + Arrays.toString(test1));
		System.out.println("test2 ==> "  + Arrays.toString(test2));
		System.out.println("result ==> "  + Arrays.toString(result));
		

	}

}
