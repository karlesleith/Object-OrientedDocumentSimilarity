package ie.gmit.sw;

import java.util.TreeMap;

public class Documents {
	private String docName;
	private TreeMap<String,Integer> shingles;
	
	
	public Documents(String n,  TreeMap<String,Integer> shingles) {
		setDocName(n);
		setShingles(shingles);
	
	}
	
	public Documents(String n) {
		setDocName(n);
		setShingles(shingles);
	}
	
	//Getting/Setting name of the Document Added to database
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public TreeMap<String, Integer> getShingles() {
		return shingles;
	}

	public void setShingles(TreeMap<String, Integer> shingles) {
		this.shingles = shingles;
	}


	
	

}
