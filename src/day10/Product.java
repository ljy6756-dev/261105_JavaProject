package day10;

public class Product {
    // 제품클래스
	// 재고, 수입원, 원가, 가격, 부가가치세,
	// 판매제품명, 가격
	
	private String productName;
	private int price;
	
	// 생성자
	public Product() {}

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	//객체 생성 이후 상품을 추가하는 메서드 변도필요시...(편리성을 위해)
//	public void inserProduct(String product) {}
	
	// 상품 출력
	public void printProduct() {
		System.out.print(productName + " : " + price + "원 / ");
	}

	// 상품명 가져오기
	public String getProductName() {
		return productName;
	}

	// 가격 가져오기
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}


}