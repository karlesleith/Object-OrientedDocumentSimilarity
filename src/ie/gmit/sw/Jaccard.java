package ie.gmit.sw;

import java.util.ArrayList;
import java.util.TreeMap;

public interface Jaccard {

	public TreeMap<String,Integer> Shingle(String txt);
	public ArrayList<Integer> ShingleListIntersection(TreeMap<String, Integer> x, TreeMap<String, Integer> y);
	public ArrayList<Integer> ShingleListUnion(TreeMap<String, Integer> x, TreeMap<String, Integer> y);
	public void PercentageOfSimerlarity(TreeMap<String,Integer> x, TreeMap<String,Integer> y);
	
}
