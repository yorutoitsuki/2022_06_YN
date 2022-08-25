package stack.cd;

public class CD {
	private String cdTitle;

	public CD(String cdTitle) {
		super();
		this.cdTitle = cdTitle;
	}

	public String getCdTitle() {
		return cdTitle;
	}

//	public void setCdTitle(String cdTitle) {
//		this.cdTitle = cdTitle;
//	}
	@Override
	public String toString() {
		return cdTitle;
	}
	
}
