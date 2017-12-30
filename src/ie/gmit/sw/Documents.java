package ie.gmit.sw;

public class Documents {
	private String docName;
	private String docTxt;
	
	
	public Documents(String n, String txt) {
		setDocName(n);
		setDocTxt(txt);
	}
	
	//Getting/Setting name of the Document Added to database
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	//getting/setting DocText
	public String getDocTxt() {
		return docTxt;
	}

	/**
	 * @param docTxt the docTxt to set
	 */
	public void setDocTxt(String docTxt) {
		this.docTxt = docTxt;
	}
	
	

}
