package test;
import java.util.ArrayList;

import ie.gmit.sw.*;

public class Runner {
	
	
	public static void main(String[] args) throws Exception {
		
		String A = "object, oriented, programming, is, good, fun, for, me";
		//String B = "object, oriented, programming, good, fun, for, me";
		
		//Documents d = new Documents("War and Peace");
		//Documents c = new Documents("Return of Sherlock Holmes");
	
		//	lines.add(A);
		
		
		//JaccardImpl JSI = new JaccardImpl();
		////System.out.println(JSI.Shingle(A));
		//System.out.println(JSI.Shingle(B));
		
		DatabaseImpl DI = new DatabaseImpl();
		
		//DI.pushToDatabase("Return of Sherlock Holmes", JSI.Shingle(A));
		
	
		
		
		//System.out.println(DI.getFromDatabase(d));
		//JaccardImpl JI = new JaccardImpl();
		DI.listDatabaseDocs();
		//JI.PercentageOfSimerlarity(DI.getFromDatabase(d),DI.getFromDatabase(c));
		
		//System.out.println(DI.getFromDatabase(d));
		//System.out.println();
		
	}

}
