package test;
import ie.gmit.sw.*;

public class Runner {
	
	public static void main(String[] args) throws Exception {
		
		//String A = "object, oriented, programming, is, good, fun, for, me";
		//String B = "object, oriented, programming, good, fun, for, me";
		
		
		
		Documents d = new Documents("War and Peace");
		
		//JaccardImpl JSI = new JaccardImpl();
		//System.out.println(JSI.Shingle(A));
		//System.out.println(JSI.Shingle(B));
		
		DatabaseImpl DI = new DatabaseImpl();
		DI.init("war-and-peace.txt");
		//System.out.println(DI.getFromDatabase(d));
		//System.out.println();
		
	}

}
