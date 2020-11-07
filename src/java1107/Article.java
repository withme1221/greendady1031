package java1107;

public class Article {
	private int id;
	private String title;
	private String body;
	
	public Article(int id, String title, String body) {
		this.id = id; // this는 class에 있는거랑 구분하기위해 넣음. 오른쪽껀 매개변수임.
		this.title = title;
		this.body = body;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
    
	

}
