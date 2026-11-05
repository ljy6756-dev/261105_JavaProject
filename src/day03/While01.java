package day03;

public class While01 {

	public static void main(String[] args) {
		// While
		/* While(조건식_{실행문};
		 * 조건식이 참이면 실행문 실행
		 * 반복할 조건의 증감식이 항상 실행문에 포함(무한루프)
		 * for : 반복횟수가 정해져 있을 경우
		 * while : 반복횟수가 정해져 있지 않을 경우
		 * 
		 * 
		 * 
		 */

		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		int i = 1;
		//while(true) 해도 됨
		while(i<=10) {
			System.out.println(i);
			i++;
		// 조건을 이용한 break;
		}
		
		
		
	    i = 0;
	    while(i<=10) {
	    	i++;
	    	if(i % 2==0) {
	    	System.out.println("짝수"+i);
	    }
	    	
	    	//break 사용
		i = 0;
		int sum = 0;
		while(true) {
			if(i % 2==0){
				System.out.println(i);		
				sum += i;
			}
			if(i==11) {
				break;
			}
            i++;
		}
		System.out.println(sum);
	    	
	    	
	    	
	}
	}
}
