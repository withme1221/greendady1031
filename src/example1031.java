import java.util.Scanner;

public class example1031 {

	public static void main(String[] args) {
//		명령어를 입력해주세요 : sdfsdf
//		명령어를 입력해주세요 : a2w3er4
//		명령어를 입력해주세요 : cvb
//		명령어를 입력해주세요 : 1314
//		명령어를 입력해주세요 : exit
//		프로그램을 종료합니다.
		Scanner sc = new Scanner(System.in);
	        while(true) {
	    	System.out.print("명령어를 입력해주세요 : ");
	    	String str = sc.nextLine();
	    	if(str.equals("exit")) {
	    		break ;
	    	}
	    
	    	}
				
    		System.out.println("프로그램을 종료합니다.");

	}

}
