package ie.gmit.sw;

import java.util.ArrayList;
import java.util.TreeMap;

public interface Jaccard {

	public TreeMap<String,Integer> Shingle(String txt);
	public TreeMap<String,Integer> ShingleListIntersection();
	public TreeMap<String,Integer> ShingleListUnion();
	public void PercentageOfSimerlarity(TreeMap<String,Integer> x, TreeMap<String,Integer> y);
	
}
