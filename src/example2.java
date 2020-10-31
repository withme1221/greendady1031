


import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {

		//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
		//입출력 예시
		//첫번째 숫자를 입력해주세요: 12
		//두번째 숫자를 입력해주세요: 33
		//12 + 33 = 45
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 숫자를 입력해주세요 : " );
		String str = sc.nextLine();
		System.out.print("두번재 숫자를 입력해주세요 : " );
		String str2 = sc.nextLine();

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1+num2);
	
	}

}
