package ie.gmit.sw;

import java.util.TreeMap;

//This class acts as the objects that will be passed into the database, here we define the 2 parts of the Object
//we will be storing, 1. The String that will be used to store the Document Name the user inputs, 2. The TreeMap that will store
//the Shingle<String> and the HashCode<Integer>
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
