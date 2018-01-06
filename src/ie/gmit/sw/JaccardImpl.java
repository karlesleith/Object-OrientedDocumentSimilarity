package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Set;
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
	public ArrayList<Integer> ShingleListIntersection(TreeMap<String, Integer> x, TreeMap<String, Integer> y) {
		
		System.out.println("[Jaccard Debug Intersection 1]Size of First Shingle list: "+x.size());
		System.out.println("[Jaccard Debug Intersection 2]Size of Second Shingle list: "+y.size());
		//Number of elements in First Array
		int n1 = x.size();
		//Number of elements in First Array
		int n2 = y.size();
		
		ArrayList<Integer> ListIntersection = new ArrayList<>();
		for (String k : x.keySet()) {
		    if (y.containsKey(k)) {
		    	ListIntersection.add(x.get(k));
		    }
		} 
		int i=0,j = 0;
		
		
	//	System.out.println("The intersection is: "+ListIntersection);
		System.out.println("\nSize of Array Lists: "+n1 +"	"+n2 + " //THIS CAME FROM "+this.getClass());
		System.out.println("Size of Intersection: "+ListIntersection.size());
		
		return ListIntersection;
	}

	@Override
	public ArrayList<Integer> ShingleListUnion(TreeMap<String, Integer> x, TreeMap<String, Integer> y) {
		System.out.println("[Jaccard Debug Union 1]Size of First Shingle list: "+x.size());
		System.out.println("[Jaccard Debug Union 2]Size of Second Shingle list: "+y.size());
		//Number of elements in First Array
		int n1 = x.size();
		//Number of elements in First Array
		int n2 = y.size();
		
		ArrayList<Integer> ListUnion = new ArrayList<>();
		for (String k : x.keySet() ) {
			  if(!y.containsKey(k)) { 
			  ListUnion.add(x.get(k));
			  }
		}
		
	//	System.out.println("The intersection is: "+ListIntersection);
		System.out.println("\nSize of Array Lists: "+n1 +"	"+n2 + " //THIS CAME FROM "+this.getClass());
		System.out.println("Size of Union: "+ListUnion.size());
		
		return ListUnion;
	}

	@Override
	public void PercentageOfSimerlarity(TreeMap<String, Integer> x, TreeMap<String, Integer> y) {
		ArrayList<Integer>  ListIntersection =ShingleListIntersection(x, y);
		ArrayList<Integer>  ListUnion= ShingleListUnion(x, y);
		
		int n1 = ListIntersection.size();
		int n2 = ListUnion.size();
		float percentageOfSim = 0;
		
		percentageOfSim = n2/n1;
		
		System.out.println("\nThe Percentage is " + percentageOfSim + "%");
		
	}

}
