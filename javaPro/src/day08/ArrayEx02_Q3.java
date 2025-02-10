package day08;

public class ArrayEx02_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++){
			num[i] = i + 1;
			
		}
		System.out.println("초기값");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		// 배열의 요소값들 섞기 작업
		
		// 난수를 만들어서 '난수'번쨰와 '0'번째 자료의 값을 서로 맞바꾼다.
		
		// 데이터를 섞기 작업 회수만크 반복한다.
		
		for(int i=1; i<=100; i++) { // 데이터를 섞기 위한 작업 
			// 난수 만들기 : 1부터 (배열개수 -1) 까지의 난수를 만든다.
			int index = (int)(Math.random()*(num.length-1) * 1);
			
			// 난수번째와 0번째 자료 맞바꾸기
			int temp = num[0];
			num[0] = num[index];
			num[index] = temp;
			
		}
		System.out.println();
		System.out.println("섞기 작업 후 값 ");
		System.out.print("");
		for(int i=0; i<num.length; i++) {
		System.out.print(num[i] + " ");
		}
		

	}

}
