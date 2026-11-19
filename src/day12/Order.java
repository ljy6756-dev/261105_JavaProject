package day12;

public class Order extends Product {
	// product => name, price
	private int count;
	private int total;
	
	// 생성자
	public Order() {}
	public Order(String name, int price, int count) {
		super(name, price); 
		//super.setName(name);
		this.count = count;
		this.total = super.getPrice() * this.count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		// 이름 가격 수량 금액
		return "["+ super.getName()+"\t"+ super.getPrice() +"\t" 
				+ count + "\t" + total + "]";
	}
	
}