package day07;

public class ArrayEx00StringTest {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "강감찬";
		
		String str4 = new String("강감찬");
		String str5 = new String("강감찬"); //자바는 new를 해야 기본적으로 객체가 생성이 된다.
		
		System.out.println(str3);
		System.out.println(str4);

		// '==' 연산자는 call stack 영역의 값을 비교한다.
		// 참조 타입의 경우에는 주소값이 저장되어 있어서 주소 값이 비교된다.
		
		System.out.println(str1==str2);
		System.out.println(str3==str4); // false new로 생성하게 되면 String Constant pool 바깥에 생성이 된다.
		System.out.println(str4==str5); // false new로 생성하게 되면 String Constant pool 바깥에 생성이 되며 새로 생성되면서 새로운 자리(참조값)에 생성된다.
		
		
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("");
		
		//문자열1.equals(문자열2) ==> 참조값 주소값 상관 없이 안에 있는 실제 데이터 값을 보고 같은지 아닌지를 판단하는 명령어.
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str1));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));

		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("");
		
		
		
		// hash code ==> 주소값을 정수형으로 나타내서 보여줌.
		System.out.println("변경 전 str1 =>" +str1.hashCode());
		System.out.println("변경 전 str2 =>" +str2.hashCode());
		System.out.println("변경 전 str3 =>" +str3.hashCode());
		System.out.println("변경 전 str4 =>" +str4.hashCode());
		System.out.println("변경 전 str5 =>" +str5.hashCode());
		
		
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("");
		
		
		System.out.println("str1 =>" + System.identityHashCode(str1));
		System.out.println("str2 =>" + System.identityHashCode(str2));
		System.out.println("str3 =>" + System.identityHashCode(str3));
		System.out.println("str4 =>" + System.identityHashCode(str4));
		System.out.println("str5 =>" + System.identityHashCode(str5));
		
		
		str1 = str1+"안녕";
		
		System.out.println("변경 후 str1 =>" +str1.hashCode());
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("intern전 =>" + (str3 == str4));
		
		str4 = str4.intern(); 
		
		/*
		 
			intern()메서드 ==> 해당 문자열의 리터럴이 pool에 존재하는지 확인하고 존재하면 해당 pool에 있는 리터럴의 주소값을 반환하고
			없다면 리터럴을 pool에 생성하고 새로 생성된 리터럴의 주소값을 반환한다.
			pool 영역 바깥쪽에 있던 값을 안쪽으로 옮겨오기 위한 명령어.
			
			GC - Garbage Collection(가비지 컬렉션): JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리해줌

		*/
		System.out.println("intern후 =>" + (str3 == str4));
		
		int a = 100;
		str1 = null; // 참조형 변수에 아무것도 안가지고 싶을떄 null로 초기화하면됌 그러면 callstack에 null들어감
		System.out.println(str1.toUpperCase()); // 연결이 되어있찌도 않은데 대문자로 바꿔달라하면 오류터짐요 즉 지금은 위에 NULL값이 있기에 오류 터짐
		
	}

}
