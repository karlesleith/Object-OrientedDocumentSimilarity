package ie.gmit.sw;

import java.util.TreeMap;

public interface Database {
	public void init(String textFile) throws Exception;
	public void pushToDatabase(TreeMap<String,Integer> shingles);
	public TreeMap<String,Integer> getFromDatabase(final Documents d );
	public void listDatabaseDocs();
}
