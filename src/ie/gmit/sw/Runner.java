package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.crypto.Data;

public class Runner{
	public static void main(String[] args) throws Exception {
		
		JaccardSimerlarityImpl JSI = new JaccardSimerlarityImpl();
		
		DatabaseImpl DBI = new DatabaseImpl();
		
		
		DBI.init();		
		/*	
		ArrayList<String>  N = new ArrayList<>(); 
		N.add("Luke");
		N.add("Karle");
		N.add("Savanna");
		
		ArrayList<String>  N2 = new ArrayList<>(); 
		N2.add("Luke");
		N2.add("Savanna");
		N2.add("Karle");
		
		
		System.out.println("List N: "+N);
		System.out.println("List N2: "+N2);
		
		System.out.println();
		
		JSI.ArrayListIntersection(JSI.StringToHashConverter(N), JSI.StringToHashConverter(N2));

		JSI.ArrayListUnion(JSI.StringToHashConverter(N), JSI.StringToHashConverter(N2));
		

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
		*/
		

	}
}
