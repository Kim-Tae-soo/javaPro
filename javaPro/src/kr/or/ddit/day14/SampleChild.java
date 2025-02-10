package kr.or.ddit.day14;

public class SampleChild extends SampleParent {
	String var2;
	
	public void childMethod() {
		//자식에서 만든 메소드 ==> 상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var);
		System.out.println(methodA(1,2));
	}
	
	public SampleChild() {
		// 부모의 생성자 메소드를 호출하는 메소드
		//supur();		// 부모의 생성자 SampleParen()를 호출한다.
		super("홍길동"); // 부모 생성자의 SampleParent(String name)을 호출한다.
		
		//super(); 명령이 없으면 컴파일러가 자동으로 추가해 준다.
	}
	
	int var;
	
	public void testMethod() {
		System.out.println("var = " + var);
		System.out.println("this.var = " + this.var);
		System.out.println("super.var = " + super.var);
		// super ==> 부모의 참조값을 갖는 변수로 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.methodA(5, 6));
		System.out.println(super.methodA(5, 6)); // 부모쪽 methodA를 찾아옴 super
	}
	
	// 오버 라이딩 ==> 상속받은 메소드의 내용을 자식쪽에서 재정의하는 것
	//			==> 재정의하기 위해서는 리턴타입 및 파라미터의 갯수와 자료형의 모두 동일해야한다.
	@Override 	// ==> 어노테이션 : 클래스, 변수, 메소드 등에 표시해 놓는 태그
	public int methodA(int x, int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		
		SampleChild sc = new SampleChild();
		sc.testMethod();
		//sc.childMethod();	
		//다형성
		// 부모타입의 변수에 자식 타입의 객체를 저장하기 ==> UpCasting
		// UpCasting ==> 자동 형변환이 된다.
		SampleParent sp = new SampleChild();
		System.out.println("----------------------");
		System.out.println("sp.var = "+sp.var);
		System.out.println("----------------------");
		
		// 부모 타입의 변수값을 자식 타입의 변수에 저장하기 ==> DownCasting
		// ==> 명시적 형변환이 필요하다.
		SampleChild sc2 = (SampleChild)sp; //명시적 형변환 ==> (형변환)
		
		System.out.println("sc2.var = " + sc2.var);
		System.out.println("----------------------");
		
		// 메소드는 부모의 참조변수 또는 자식의 참조변수로 호출할 때
		// 해당 메소드가 재정의 되어 있으면 무조건 재정의 된 메소드가 호출된다.
		System.out.println("sp = > " + sp.methodA(5, 6));
		System.out.println("sc2 = > " + sc2.methodA(5, 6));
	}

}
