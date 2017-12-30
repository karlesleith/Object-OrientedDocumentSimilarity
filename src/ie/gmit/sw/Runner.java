package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner{
	public static void main(String[] args) {
		
		JaccardSimerlarityImpl JSI = new JaccardSimerlarityImpl();
		ArrayList<Integer>  A = new ArrayList<>(); 
		A.add(1);
		A.add(2);
		A.add(3);
		
		ArrayList<Integer>  B = new ArrayList<>(); 
		B.add(3);
		B.add(4);
		B.add(5);
		B.add(6);
		
		
		System.out.println("List A : "+ A);
		System.out.println("List B : "+ B);
		
		JSI.ArrayListUnion(A, B);
		JSI.ArrayListIntersection(A, B);
		

	}
}
