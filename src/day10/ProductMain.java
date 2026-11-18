package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/* product(상품) class : 상품명, 가격(판매금액)
		 * order(주문) class : 상품명, 개수, 가영(판매금액), 금액(개수*가격)
		 */

		// product[] menu = new product[5]; // => 상품리스트
		// 임의의 상품등록
		// 주문 => Order 객체 발생 => Order[] order = new Order[5];
		
		/* 1. 전체 제품 보여주기
		 * 2. 주문 > 제품명. 수령 입력받기
		 * 3. order 객체 생성 => 추가
		 * 4. 반복 주문=> 종료 키워드 생성 반복 주문이 가능하도록
		 * 5. order => 배열이 다 차면 배열 증가(배열복사)
		 * 6. 주문 완료시 => 영수증 출력 (전체 주문내역 / 총지불금액)
		 * 
		 * 예시)
		 * 김밥 2줄 3000원 => 6000원
		 * 라면 3개 500 => 15000원
		 * 사이다 2개 500 => 1000
		 *-------------------------
		 *총 지불금액 22000원
		 */
		

			Scanner sc = new Scanner(System.in);

			// 상품 등록
			Product[] menu = new Product[5];

			menu[0] = new Product("김밥", 3000);
			menu[1] = new Product("라면", 5000);
			menu[2] = new Product("사이다", 500);
			menu[3] = new Product("떡볶이", 4000);
			menu[4] = new Product("순대", 4500);
			
			//객체 생성 후 = insertProduct 호출 => 배열에 등록
//			Product p = new Product();
//			p.printProduct("111", 11111);
//		    menu[4] = p;


			// 주문 배열 생성
			Order[] order = new Order[5];

			int orderCount = 0;

			// 상품 보여주기
			System.out.println("===== 상품 목록 =====");

			for(int i = 0; i < menu.length; i++) {
				menu[i].printProduct();
			}


			// 주문 시작
			while(true) {
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.print("주문할 상품명 입력 (종료 입력 시 주문완료) : ");

				String name = sc.nextLine();

				// 종료 조건
				if(name.equals("종료")) {
					break;
				}


				// 상품 찾기
				int price = 0;
				boolean check = false;

				for(int i = 0; i < menu.length; i++) {

					if(name.equals(menu[i].getProductName())) {

						price = menu[i].getPrice();
						check = true;
						break;
					}
				}
				// 상품이 없는 경우
				if(check == false) {
					System.out.println("등록되지 않은 상품입니다.");
					continue;
				}

				// 주문 개수 입력
				System.out.print("수량 입력 : ");
				int count = sc.nextInt();
				sc.nextLine();
				if(count <1 || count > 5) {
					System.out.println("없는 주문번호 입니다");
					continue;
				}

				if(count <= 0) {
					System.out.println("1개 이상 주문해주세요.");
					continue;
				}

				// 주문 객체 생성
				Order o = new Order(name, count, price);


				// 배열이 가득 찼는지 확인
				if(orderCount == order.length) {
					Order[] temp = new Order[order.length * 2];
					System.arraycopy(order, 0, temp, 0, order.length);
					// 기존 배열을 새로운 배열로 변경
					order = temp;
				}
				// 주문 배열에 추가
				order[orderCount] = o;

				orderCount++;

				System.out.print("주문이 완료되었습니다.");

			}  // while 닫힘
			// 영수증 출력
			System.out.println();
			System.out.println("========== 영수증 ==========");

			int sum = 0;
			for(int i = 0; i<orderCount; i++) {
				order[i].printOrder();
				sum += order[i].getTotal();
			}

			System.out.println("---------------------------");
			System.out.println("총 지불금액 : " + sum + "원");
			System.out.println("===========================");

			sc.close();

		}
	}