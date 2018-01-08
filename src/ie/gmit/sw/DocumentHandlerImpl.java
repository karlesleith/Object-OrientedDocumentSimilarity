package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//This class is the logic implementation for the reader for the documents that are originally stored in the DB

public class DocumentHandlerImpl implements DocumentHandler{

	@Override
	public ArrayList<String> docReader() {
		BufferedReader reader = null;
	     String line ="";
	     ArrayList<String> lines = new ArrayList<String>();

		try {
		    File file = new File("./war-and-peace.txt");
		    reader = new BufferedReader(new FileReader(file));


		    while ((line = reader.readLine()) != null) {
		   //     System.out.println(line);
		        lines.add(line);
		    }

		} catch (IOException e) {
		    e.printStackTrace();
		
		}

		return lines;
}
}
