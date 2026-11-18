package day05;

public class Array04 {

	public static void main(String[] args) {

	    int sum = 0;
		int arr[] = {70, 80, 90, 40, 50, 60, 75, 65, 75, 24};
		
		for(int i=0; i<arr.length; i++);{
			//sum += arr[i];
		}
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+ sum / arr.length);
		
		
	//가장 큰 값, 가장 작은값
		int max = arr[0];  //90
		int min = arr[0];   // 24

		for(int i= 0; i< arr.length; i++) {
			if(max < arr[i]) {  //90
			   max = arr[i]; 
			}
			if(min > arr[i]) {
				min = arr[i];
			}

			
		}
		
		
		System.out.println(max);
		System.out.println(min);
		

		System.out.println("----Math class 활용");


	
	//Math.max(a, b); Math.min(a,b);

	max = arr[0];
	min = arr[0];
	for(int i=0; i<arr.length; i++) {
		max = Math.max(max, arr[i]);
	    min = Math.min(min, arr[i]);
	}
	System.out.println("최대값: "+max);
	System.out.println("최소값: "+min);
	
	


}
}