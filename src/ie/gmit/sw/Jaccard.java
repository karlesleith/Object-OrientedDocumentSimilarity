package ie.gmit.sw;

import java.util.ArrayList;
import java.util.TreeMap;

/*This class acts as the interface for "The Jaccard index", also known as Intersection over Union and the Jaccard similarity 
coefficient (originally coined coefficient by Paul Jaccard), is a statistic
used for comparing the similarity and diversity of sample sets. The Jaccard coefficient measures
similarity between finite sample sets, and is defined as the size of the intersection divided by 
the size of the union of the sample sets:
*/

public interface Jaccard {

	public TreeMap<String,Integer> Shingle(String txt);
	public ArrayList<Integer> ShingleListIntersection(TreeMap<String, Integer> x, TreeMap<String, Integer> y);
	public ArrayList<Integer> ShingleListUnion(TreeMap<String, Integer> x, TreeMap<String, Integer> y);
	public void PercentageOfSimerlarity(TreeMap<String,Integer> x, TreeMap<String,Integer> y);
	
}
