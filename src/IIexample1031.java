import java.util.Scanner;
public class IIexample1031 {

	public static void main(String[] args) {
//		명령어를 입력해주세요 : add
//	    게시물 제목을 입력해주세요 : 제목1
//	    게시물 내용을 입력해주세요 : 내용1
//	    게시물이 등록되었습니다.
//	    명령어를 입력해주세요 : add
//	    게시물 제목을 입력해주세요 : 제목2
//	    게시물 내용을 입력해주세요 : 내용2
//	    게시물이 등록되었습니다.
//	    명령어를 입력해주세요 :
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String str = sc1.nextLine();
			if(str.equals("add")){
			System.out.print("게시물 제목을 입력해 주세요 :");
			String str2 = sc1.nextLine();
			System.out.print("게시물 내용을 입력해주세요 : ");
			String str3 = sc1.nextLine(); }
			System.out.println("게시물이 등록되었습니다.");
		}
//		명령어를 입력해주셍 : list
//	    번호 : 1
 //	    제목 : 제목1
 //	    ===================
 //	    번호 : 2
 //	    제목 : 제목2
 //	    
		

		
	}

}
