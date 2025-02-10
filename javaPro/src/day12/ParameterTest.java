package day12;

class Data{
	int x;
	
}

public class ParameterTest {
	//메인 메소드에 바로 호출하기 위하여 static으로 메소드 작성
	static void dataChange(int x) {
		x = 1000;
		System.out.println("dataChange()메소드 안에서 x = " + x);
	}
	
	static void dataChange2(Data data) {
		data.x = 1000;
		System.out.println("dataChange2()메소드 안에서의 data.x = " + data.x);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("dataChange ()메소드 호출 전 d.x = " + d.x );
		
		dataChange(d.x);
		
		System.out.println("dataChange ()메소드 호출 후 d.x = " + d.x ); // call by value
		System.out.println();
		System.out.println("-------------------------------------------");
		
		d.x = 10;
		System.out.println("dataChang2 ()메소드 호출 전 d.x = " + d.x );
		dataChange2(d);
		System.out.println("dataChang2 ()메소드 호출 후 d.x = " + d.x ); // call by reference

	}
}