package java_ch04_20240510;

public class ForClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				a++;
				System.out.println(a + "번째 커피 주문 $$$");
			}
		}
		// 2~9 > 99단 출력 for 문
		
		for(int i = 2; i <= 9;  i++) {
			System.out.println(i + " 단 " + "------------");	
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);			
			}				
		}
		
		// 이중 for 문 * 찍기
		// *
		// **
		// ***
		// ****
		String s = "*";
		System.out.println(s);
		for  (int i = 1; i <= 5; i++) {
			System.out.println(s = s + "*" );
			}		
	}


	
}
