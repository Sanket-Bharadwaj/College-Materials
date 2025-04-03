package q07;

public class Address {
	private int plotNo, post;
	private String at;

	public Address(int plotNo, String at, int post) {
		super();
		this.plotNo = plotNo;
		this.at = at;
		this.post = post;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}
	

}
