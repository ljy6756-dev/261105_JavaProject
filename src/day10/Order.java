package day10;


public class Order {
	// 주문 클래스 : 손님이 주문
	// 날짜, 세금 등
	// 상품명, 개수, 가격(판매금액), 금액(개수*가격)
	
	//주문추가
	
	private String productName;
	private int count;
	private int price;
	private int total;

	// 생성자
	public Order() {}

	public Order(String productName, int count, int price) {
		this.productName = productName;
		this.count = count;
		this.price = price;
		this.total = count * price;
	}

	// 주문내역 출력
	public void printOrder() {
		System.out.println(productName + " " + count + "개 "
				+ price + "원 => " + total + "원");
	}

	// 총금액 가져오기
	public int getTotal() {
		return total;
	}
	
	
	
}