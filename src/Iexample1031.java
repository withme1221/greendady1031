import java.util.Scanner;

public class Iexample1031 {

	public static void main(String[] args) {
//		명령어를 입력해주세요 : sdfsdf
//		명령어를 입력해주세요 : a2w3er4
//		명령어를 입력해주세요 : cvb
//		명령어를 입력해주세요 : 1314
//		명령어를 입력해주세요 : exit
//		프로그램을 종료합니다.
		Scanner sc = new Scanner(System.in);
		String[] titles = new String[10];
		String[] bodies = new String[10];
		int[] ids = new int[10];
		int index = 0;
		int id = 1;
		
	        while(true) {
	    	System.out.print("명령어를 입력해주세요 : ");
	    	String str = sc.nextLine();
	    	if(str.equals("exit")) {
	    		System.out.println("프로그램을 종료합니다.");
	    		break ;
	    	}
	    
	    	if(str.equals("add")){
	    		
	    		System.out.print("게시물 제목을 입력해 주세요 :");
	    		titles[index] = sc.nextLine();
	    		System.out.print("게시물 내용을 입력해주세요 : ");
	    		bodies[index] = sc.nextLine(); 
	    		System.out.println("게시물이 등록되었습니다.");
	    		ids[index] = id;
	    		
	    		index ++;
	    		id ++;
	    		}
	    	if(str.equals("list")) {
	    		
	    		for(int i = 0 ; i < index; i++) {
	    		System.out.println("번호 : " + ids[i]); //식별 값, 중복 X
	    		System.out.println("제목 : " + titles[i]);
	    		System.out.println("=================");
	    		}
	    	 }
	    
	       }

	}

}
