package ie.gmit.sw;

import java.util.ArrayList;
import java.util.TreeMap;

public class JaccardImpl implements Jaccard {

	@Override
	public TreeMap<String, Integer> Shingle(String txt) {
		//REF: https://www.programcreek.com/java-api-examples/index.php?source_dir=StatusParser-master/com/statusParser/Shingle.java
		DocumentHandlerImpl DHI = new DocumentHandlerImpl();
		ArrayList<String> docArray = DHI.docReader(txt);
		String[] lines =docArray.toArray(new String[docArray.size()]);
		TreeMap<String, Integer> shingles = new  TreeMap<String, Integer>();
		System.out.println("This is called from "+this.getClass()+ " txt: "+ txt);
		
		System.out.println("Please wait...");
		for(String line : lines) {
	        String words[] = line.split(" "); 
	        
	        int shinglesNumber = words.length -3; 
	       
	        int i =0; int j=0;
			
	        //Create all shingles 
	        for ( i = 0; i <= shinglesNumber; i++) { 
	            String shingle = ""; 
	         
	            //Create one shingle 
	            for ( j = 0; j < 3; j++) { 
	                shingle = shingle + words[i+j] + " "; 
	                //System.out.println(j);
	               
	                if (j==2) {
	                	//System.out.println(shingle);
	                	shingles.put(shingle,shingle.hashCode());
	                	
	                }
	            }
	        }
        }
        
		System.out.println("Done");
	
		return shingles;
	}

	@Override
	public TreeMap<String, Integer> ShingleListIntersection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<String, Integer> ShingleListUnion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void PercentageOfSimerlarity(TreeMap<String, Integer> x, TreeMap<String, Integer> y) {
		// TODO Auto-generated method stub
		
	}

}
