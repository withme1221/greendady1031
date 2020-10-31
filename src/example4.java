
import java.util.Scanner;
public class example4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		String str = sc.nextLine();
		
		int a = Integer.parseInt(str);
		
		if(a % 2 ==0) {
			System.out.println("짝수");
					
		} else { System.out.println("홀수"); }
		
		
	}

}
