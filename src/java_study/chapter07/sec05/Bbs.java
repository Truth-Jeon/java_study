package java_study.chapter07.sec05;

public class Bbs { // 값만 다루고 있음. 이것을 보관하기 위한 역할.
	// 즉, 값을 저장(표현)하기 위한 역할을 Bbs.class 는 하고있다.
	// 이것을 비즈니스 로직이라고 함.
	// 또는 VO(Value Object)라고도 함.
	private int no;
	private String title;
	private String content;
	private String writer;

	public Bbs() {
		super();
	}

	public Bbs(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return no + "\t" + title + "\t" + content + "\t" + writer;
	}

}