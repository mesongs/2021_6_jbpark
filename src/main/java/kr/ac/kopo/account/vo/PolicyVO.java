package kr.ac.kopo.account.vo;

public class PolicyVO {
	
	private String name;
	private String title;
	private String content;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "PolicyVO [name=" + name + ", title=" + title + ", content=" + content + "]";
	}
	
}
