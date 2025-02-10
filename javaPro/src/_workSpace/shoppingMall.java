package _workSpace;

public class shoppingMall {
	
	private String ordernum; // 주문번호
	private String id;		 // 주문자ID
	private String date;	 // 주문 날짜
	private String name;	 // 주문자 이름
	private String prodnum;	 // 주문 상품 번호
	private String address;	 // 배송 주소
	
	
	public void orderPrint() {
		
		System.out.println("주문번호 : " + ordernum );
		System.out.println("주문자ID : " + id );
		System.out.println("주문 날짜 : " + date );
		System.out.println("주문자 이름 : " + name );
		System.out.println("주문 상품 번호 : " + prodnum );
		System.out.println("배송 주소 : " + address );
		
	}
	
	public void setOrdernum(String ordernum){
		this.ordernum = ordernum;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setProdnum(String prodnum) {
		this.prodnum = prodnum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
