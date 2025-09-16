package dya4;

public class InstagramPost {
	private String user;
	private String content;
	public InstagramPost(String user, String content) {
		super();
		this.user = user;
		this.content = content;
	}
	
	
	void post() {
		System.out.println(this.user + "이 작성한 글입니다. \n" + this.content );
	}
	
}
