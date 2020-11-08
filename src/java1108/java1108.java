//package java1108;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//
//public class java1108 {
//	static ArrayList<Article> articles = new ArrayList<>();
//	
//	public static int getArticleIndexById(int aid) {
//		int existFlag = 1; // 1 없다, 2 있다.
//		int index = -1; // -1이면 없는거
//		for(int i = 0; i < articles.size() ; i++) {
//			Article article = articles.get(i);
//			if(aid == article.getId()) {	
//				existFlag = 2;
//				index = i;				    				
//				
//			}
//	}
//		return index;
//}
//		
//
//	public static void main(String[] args) {		
//		
//		Scanner sc = new Scanner(System.in);			
//		
//		int id = 4;
//		
//		Article a1 = new Article(1, "제목1", "내용1");
//		Article a2 = new Article(2, "제목2", "내용2");
//		Article a3 = new Article(3, "제목3", "내용3");
//		articles.add(a1);
//		articles.add(a2);
//		articles.add(a3);
//		
//		
//	        while(true) {
//	    	System.out.print("명령어를 입력해주세요 : ");
//	    	String str = sc.nextLine();
//	    	if(str.equals("exit")) {
//	    		System.out.println("프로그램을 종료합니다.");
//	    		break ;
//	    	}
//	    
//	    	if(str.equals("add")){
//	    		
//	    		
//	    		System.out.print("게시물 제목을 입력해 주세요 :");
//	    		String title = sc.nextLine();
//	    		System.out.print("게시물 내용을 입력해주세요 : ");
//	    		String body = sc.nextLine(); 
//	    		System.out.println("게시물이 등록되었습니다.");
//	    		
//	    		
//	    		Article article1= new Article(id, title, body);
//	    		articles.add(article1);	    			    		
//	    		id ++;
//	    		
//	    	}
//	    	
//	    	if(str.equals("list")) {    		
//	    		
//	    		for(int i = 0 ; i < articles.size(); i++) {
//	    			Article article = articles.get(i);
//	    		System.out.println("번호 : " + article.getId()); //식별 값, 중복 X
//	    		System.out.println("제목 : " + article.getTitle());	    		
//	    		System.out.println("=================");
//	    		}
//	    		
//	    	 }
//	    	
//	    	if(str.equals("update")) {	    	
//	    		System.out.print("수정할 게시물 번호 : ");
//	    		String aid = sc.nextLine();
//	    		int targetId = Integer.parseInt(aid);
//	    		int index = getArticleIndexById(targetId);
//	    		
//	    		if(index == -1) {
//	    			System.out.println("없는 게시물입니다.");
//	    		} else {
//	    			System.out.print("제목 : ");
//    				String title = sc.nextLine();
//    				System.out.print("내용 : ");
//    				String body = sc.nextLine();
//    				
//    				Article article2 = new Article(targetId, title ,body);
//    				articles.set(index, article2);	
//	    		}
//	    		
////	    		int existFlag = 1; // 1 없다, 2 있다.
////	    		
////	    		for(int i = 0; i < articles.size() ; i++) {
////	    			Article article = articles.get(i);
////	    			if(targetId == article.getId()) {	
////	    				existFlag = 2;
////	    				
////	    				System.out.print("제목 : ");
////	    				String title = sc.nextLine();
////	    				System.out.print("내용 : ");
////	    				String body = sc.nextLine();
////	    				
////	    				Article article2 = new Article(targetId, title ,body);
////	    				
////	    				articles.set(i, article2);	    					    				
////	    				break;
//	    			
////	    			} 	    			
////	    		}
////	    		
//	    	}
//	    	
//	    	if(str.equals("delete")) {
//	    		System.out.print("삭제할 게시물 번호 : ");
//	    		String aid = sc.nextLine();
//	    		int targetId = Integer.parseInt(aid);
//	    		int index = getArticleIndexById(targetId);
//	    		if(index == -1) {
//	    			System.out.println("없는 게시물입니다.");
//	    		} else {
//	    			articles.remove(index);
//	    			 System.out.println("삭제가 완료되었습니다.");
//	    		
//	    		}
//	    		
//	    		
////	    		int existFlag = 1; // 1 없다, 2 있다.
////	    		
////	    		for(int i = 0; i < articles.size() ; i++) {
////	    			Article article = articles.get(i);
////	    			if(targetId == article.getId()) {	
////	    				existFlag = 2;	    				
////	    				    
////	    			    articles.remove(i);
////	    			    System.out.println("삭제가 완료되었습니다.");
////	    				break;	    			
////	    			} 	 			
////	    			    		
////	    	}
////	    		if(existFlag == 1) {
////		    		System.out.println("없는 게시물입니다.");
////		    		}	 			 
//	           	   	    	    
//	       }
//	    	if(str.equals("read")) {
//	    		System.out.print("원하는 게시물 번호를 선택하세요 : ");
//	    		String aid = sc.nextLine();
//	    		int targetId = Integer.parseInt(aid);
//	    		int index = getArticleIndexById(targetId);
//	    		if(index == -1) {
//	    			System.out.println("게시물이 존재하지 않습니다.");
//	    			
//	    		} else {
//	    			Article article = articles.get(index);
//	    			System.out.println("================");
//    				System.out.println(article.getId() + "번 게시물" );
//    				System.out.println("제목 : " + article.getTitle());
//    				System.out.println("내용 : " + article.getBody());
//    				System.out.println("================");    		
//	    			
//	    		}
//	    		
//	    			
//	    
//	    		
//	    		
//	    		
//	    	}
//	       
// 	
//	    }
//
//	 }
//	
//	
//	
//	
//}
//
//
//  
//
