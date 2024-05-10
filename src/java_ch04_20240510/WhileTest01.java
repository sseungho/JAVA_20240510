package java_ch04_20240510;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=100) {
			System.out.print(i + " th dog days over!" + "\n");
			i++;	// 100 번 실행
		}
		
		int j=1;
		while(true) { // 무한루프
			j++;
			System.out.print(j + "\n");
			if (j == 10) {
				break;
			}
		}
		
		do {	// 1번은 무조건 실행하고  그 다음 조건에 따라 반복 여부를 결정
			System.out.print("안녕하세요!" + "\n");
		} while(false);
	
		for(int k=1;k<=10;k++) {
			if(k%3==0) {
				continue;
			}
			System.out.print(k + "\n");
		}
	}

}
