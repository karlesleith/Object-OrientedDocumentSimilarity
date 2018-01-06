package ie.gmit.sw;

import java.io.IOException;
import java.util.TreeMap;
//Interface for the Database Classes, these classes Manage the connection to the DB40 Database and passes the "Documents" Objects
//to the Jaccard Interface
public interface Database {
	public void init() throws IOException;
	public void pushToDatabase(TreeMap<String,Integer> shingles);
	public TreeMap<String,Integer> getFromDatabase(final Documents d );
	public void listDatabaseDocs();
}
