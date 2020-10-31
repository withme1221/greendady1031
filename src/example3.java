
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		// Scanner를 이용해 입력값을 받아
	    // 구구단을 원하는 단이 나오게 해주세요.

	    //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

	    // 4단 출력.
	   System.out.print("원하는 단을 입력해주세요 : " );
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   int num1 = Integer.parseInt(str);
	   
	   int dan = num1 ;
	   for(int i =1 ; i<=9 ; i++) {
		   System.out.println(dan + " * " + i + " = " + dan * i);
	   }
	   
	  

	}
	


}

