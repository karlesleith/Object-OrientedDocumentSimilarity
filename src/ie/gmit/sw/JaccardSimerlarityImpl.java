package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

public class JaccardSimerlarityImpl implements JaccardSimerlarity {

	@Override
	public List<Integer> StringToHashConverter(ArrayList<String> x) {
		List<Integer> Chash = new ArrayList<Integer>();
		for(String str : x) {
			
			Chash.add(str.hashCode());
		}
		
		System.out.println(Chash);
		System.out.println("THIS RESULT CAME BACK FROM JSI");
		
		return Chash;
	}

	@Override
	public void Shingle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> ArrayListIntersection(ArrayList<Integer> x, ArrayList<Integer> y) {
		ArrayList<Integer>  ListIntersection = new ArrayList<>(); 
		int i=0,j = 0;
		
		//Number of elements in First Array
		int n1 = x.size();
		//Number of elements in First Array
		int n2 = y.size();
		
		//Array list Union
		while( i<n1 &&  j<n2) {
			if(x.get(i)<y.get(j)) {
				//Debug 1
				//System.out.println(x.get(i));
				i++;
			}
			else if(x.get(i)>y.get(j)) {
				//Debug 2
				//System.out.println(y.get(j));
				j++;
			}
			else {
				ListIntersection.add(y.get(j));
				i++;
				j++;
			}
			
		}
		 if(i<n1)
	            while(i<n1)
	            {
	                i++;
	            }
	        
	        if(j<n2)
	            while(j<n2)
	            {
	                j++;
	            }
		System.out.println("The intersection is: "+ListIntersection);
		System.out.println("\nSize of Array Lists: "+n1 +"	"+n2 + " //THIS CAME FROM "+this.getClass());
		
		return null;
	}

	//Provides the Union of Each Array
	@Override
	public List<Integer> ArrayListUnion(ArrayList<Integer> x, ArrayList<Integer> y) {
		
		ArrayList<Integer>  ListUnion = new ArrayList<>(); 
		int i=0,j = 0;
		
		//Number of elements in First Array
		int n1 = x.size();
		//Number of elements in First Array
		int n2 = y.size();
		
		//Array list Union
		while( i<n1 &&  j<n2) {
			if(x.get(i)<y.get(j)) {
				//Debug 1
				//System.out.println(x.get(i));
				ListUnion.add(x.get(i));
				i++;
			}
			else if(x.get(i)>y.get(j)) {
				//Debug 2
				//System.out.println(y.get(j));
				ListUnion.add(y.get(j));
				j++;
			}
			else {
				ListUnion.add(y.get(j));
				i++;
				j++;
			}
			
		}
		 if(i<n1)
	            while(i<n1)
	            {
	            	ListUnion.add(x.get(i));
	                i++;
	            }
	        
	        if(j<n2)
	            while(j<n2)
	            {
	            	ListUnion.add(y.get(j));
	                j++;
	            }
		System.out.println("The Union is"+ListUnion);
		System.out.println("\nSize of Array Lists: "+n1 +"	"+n2 + " //THIS CAME FROM "+this.getClass()+"\n");
		
		return null;
	}

}
