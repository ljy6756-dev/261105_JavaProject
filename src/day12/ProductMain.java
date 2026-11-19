package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product[] menu = new Product[5];
		menu[0] = new Product("떡볶이", 4000);
		menu[1] = new Product("어묵", 2000);
		menu[2] = new Product("순대", 3000);
		menu[3] = new Product("닭꼬치", 3000);
		menu[4] = new Product("떡꼬치", 1000);
		
		Order[] order = new Order[5];
		int index = 0;
		
		String ok = "y";
		while(!ok.equals("n")) {
			System.out.println("주문하시겠습니까? (y/n)");
			ok = scan.next();
			
			if(ok.toLowerCase().equals("y")) {
				// 주문 시...
				// 메뉴 출력
				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1)+". "+menu[i]);
				}
				
				System.out.println("메뉴선택>");
				int menuNo = scan.nextInt();
				
				System.out.println("수량>");
				int count = scan.nextInt();
				
				String name = menu[menuNo-1].getName();
				int price = menu[menuNo-1].getPrice();
				Order o = new Order(name, price, count);
				
				// 배열이 꽉 찼는지 확인 후 => 배열 늘리기
				if(order.length == index) {
					Order[] tmp = new Order[order.length+3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order = tmp;
				}
				
				// 배열에 추가
				order[index] = o;
				index++;
				
			}else if(ok.toLowerCase().equals("n")) {
				System.out.println("주문종료!!");
				break;
			}else {
				System.out.println("y/n을 선택해주세요.");
			}
		}
		
		// 주문 출력
		System.out.println("--주문내역출력--");
		int sum = 0;
		for(int i=0; i<index; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		System.out.println("---------------");
		System.out.println("총 지불금액 : "+ sum);
		
		
		
		scan.close();

	}

}