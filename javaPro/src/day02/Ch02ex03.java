package day02;

public class Ch02ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte형 (127 ~ -128)
		
		byte b = 127;
		byte bb = -128;
		
		//byte bbb = 128; // 값의 범위를 벗어나는 값은 저장되지 않는다.
		
		System.out.println("b = " + b);
		System.out.println("bb = " + bb);
		
		b++; // 변수 b의 값을 1 증가 시킨다.
			 // 변수에 최대값이 기억된 상태에서 변수의 값을 1 증가시키면 overflow현상이 나타난다.
		     // 정수형에서는 최대값과 최소값이 서로 연결되어 이어져 있다.
		
		bb--; // 변수 b의 값을 1 감소 시킨다.
		
		/*
		 10000000 128
		 01111111 127
		 11000001 127
		 * */
		
		
		System.out.println("증가 후 b = " + b);
		System.out.println("감소 후 bb = " + bb);
		
		System.out.println("-----------------------");
		
		/*
		 * 
		 * int형 ( 21억 ~ -21억 )
		 * long형 ( 922경 ~ -922경 )
		 * long형의 리터럴을 표현하기 위하여 숫자 뒤에 'L' 또는 '1'을 붙인다.
		 * 		  
		 */
		
		int i = 100;
		
		long l = 100;
		long ll = 100L;  // 값 뒤에 L(리터럴) 또는 1을 붙히게 되면 long 형을 의미한다. int에 L을 붙이게 되면 오류가 발생한다.
		
		// 컴퓨터는 계싼을 할 때 자료형을 서로 맞춰서 계싼을 하고 계산된 결과도 그 자료형에 맞게 나타낸다.
		
		long sum = 1000000 * 1000000;
		System.out.println("sum = " + sum ); 
		
		long sum2 = 1000000L * 1000000;
		System.out.println("sum2 = " + sum2 ); 
		
		
		/*
		 * 자료형에 맞춰서 계산을 한다. 1000000 * 1000000의 경우는 21억이 넘어가고 최대값을 벗어나기 때문에 값은 -가 나오게 된다. 
		 * sum2의 경우 리터럴을 추가하여 연산이 되게 한다.
		 * 둘중 하나만 리터럴을 붙이면 되고 컴퓨터가 계산을 할 때 값이 큰것을 기준으로 계산을 시작한다.
		 * (중요) 계산식을 작성 할 때 범위를 잘 생각하여 프로그램을 코딩한다.
		 */
		
		System.out.println("---------------------------------");
		
		/*
		 *  실수형 ==> float형 , double형
		 *  실수형 숫자의 기본형은 double형이 된다.
		 *  그래서 float형 실수 데이터를 저장하려면 숫자 뒤에 'F'나 'f'를 붙여야 한다.
		 *  double형 실수 데이터를 나타낼 떄는 숫자뒤에 'D' 나 'd'를 붙여야 되는데 이것을 생략할 수 있다.
		 */
		
		float f = 123.4567890123456789f;
		float f2 = (float)123.4567890123456789; // 강제 형변환
		double d = 123.4567890123456789;
		
		System.out.println("f = " + f );
		System.out.println("f2 = " + f2 );
		System.out.println("d = " + d );
		System.out.println();
		
		float f3 = 0.100000001f;
		double d2 = 0.100000001;
		System.out.println("f3 = " +f3);
		System.out.println("d2 = " +d2);
		System.out.println();
		
		//문자열
		String str = "java programing";
		String str2 = new String("자바 프로그래밍");
		
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		
		
	}

}
