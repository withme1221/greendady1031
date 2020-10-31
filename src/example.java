
import java.util.Scanner;
public class example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("aaa");
		
		// 1. 입력값 받기 -nextLine 입력한값을 반환함.
//		String str = sc.nextLine();
//		System.out.println(str);
//		String str2 = sc.nextLine();
//		System.out.println(str2);
//		
//		System.out.println(str + str2);
//		
		// 2. 문자 숫자로 변환하기
		String str1 = sc.nextLine();
		int num1 = Integer.parseInt(str1); // 문자 -> 숫자 리턴
		System.out.println(num1 + 100);
		

	}

}
