package java_ch04_20240510;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1 ; i<=10 ; i++) { // 초기값 ; 조건식 ; 증가감식
			System.out.println(i);
		}
		
		for(int j=10 ; j<=100 ; j = j + 10) {
			System.out.println(j);
		}
		
		for(int k=100 ; k > 10 ; k--) {	// k--  >> k=k-1
			System.out.println(k);
		}
		
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 의 합 :" + sum);
		
//		for 문을 이용해서 1~100까지의 정수 중에서 3의 배수 총합을 구하세요.
		int threeSum = 0;
		for(int i=1 ; i<=100 ; i++) {
			if (i%3 == 0) {	// 3으로 나눈 나머지가 0인 i 만 threeSum에 누적 합
			threeSum = threeSum + i;}
		}
		System.out.println("1~100 에서 3의 배수 합 :" + threeSum);
	}

}
