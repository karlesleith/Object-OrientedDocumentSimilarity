package ie.gmit.sw;

import static java.lang.System.out;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import org.w3c.dom.stylesheets.DocumentStyle;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;
import com.db4o.ta.TransparentActivationSupport;
import com.db4o.ta.TransparentPersistenceSupport;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

public class DatabaseImpl implements Database  {
	
	private ObjectContainer db = null;
	private List<Documents> docs = new ArrayList<Documents>();
	
	public DatabaseImpl() {
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().add(new TransparentActivationSupport()); //Real lazy. Saves all the config commented out below
		config.common().add(new TransparentPersistenceSupport()); //Lazier still. Saves all the config commented out below
		config.common().updateDepth(7); //Propagate updates
		
		//Use the XTea lib for encryption. The basic Db4O container only has a Caesar cypher... Dicas quod non est ita!
		config.file().storage(new XTeaEncryptionStorage("password", XTEA.ITERATIONS64));
		
		/*
		config.common().objectClass(Patient.class).cascadeOnUpdate(true);
		config.common().objectClass(Patient.class).cascadeOnActivate(true);
		config.common().objectClass(MDTReview.class).cascadeOnUpdate(true);
		config.common().objectClass(MDTReview.class).cascadeOnActivate(true);
		config.common().objectClass(User.class).cascadeOnUpdate(true);
		config.common().objectClass(HospitalList.class).cascadeOnUpdate(true);
		config.common().objectClass(TumourSet.class).cascadeOnUpdate(true);
		config.common().objectClass(GPLetter.class).cascadeOnUpdate(true);
		*/

		//Open a local database. Use Db4o.openServer(config, server, port) for full client / server
		db = Db4oEmbedded.openFile(config, "docs.data");	
	}

	@Override
	public void init(String textFile) throws Exception {
	
		//Pass in the Shingles into the DB
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the name of the Document: ");
		String input = in.nextLine();
		
		JaccardImpl JI = new JaccardImpl();
		
		TreeMap<String,Integer> shingles = new TreeMap<String,Integer>(); 
		shingles = JI.Shingle(textFile);
		
		//System.out.println(shingles);
		
		Documents doc = new Documents(input, shingles);
		db.store(doc);
		
		//System.out.println(doc.getShingles());
		
		ObjectSet<Documents> docs = db.query(Documents.class);
		for (Documents d : docs) {
			
			//Pull some random shingles
			Random random = new Random();
			List<String> keys = new ArrayList<String>(d.getShingles().keySet());
			String randomKey = keys.get(random.nextInt(keys.size()));
			
			List<String> randomElems = new ArrayList<String>();
			
			for (int i=0; i<10;i++) {
				
				randomKey = keys.get(random.nextInt(keys.size()));
				Integer value = d.getShingles().get(randomKey);
				randomElems.add(randomKey);
			}
			
			
			out.println("[Doc] " + d.getDocName()  + "\t Database ObjID: "+ db.ext().getID(d));
			out.println("[Shingles] "+ randomElems);
			//Removing objects from the database is as easy as adding them
			//db.delete(customer);
			db.commit();
		}
		
	}
	
	@Override
	public void pushToDatabase(TreeMap<String, Integer> shingles) {
		// TO DO 
	}

	@Override
	public TreeMap<String, Integer> getFromDatabase(Documents d) {
		//The new Customer(...) is a prototypical instance of the object(s) we want
				ObjectSet<Documents> document = db.queryByExample(new Documents(d.getDocName(),d.getShingles()));
				if (document.hasNext()) {
					out.println("[DocumenstQBE] found " +d.getDocName());
					//System.out.println(document.next().getShingles());
				} else {
					out.println("[Error] " +d.getDocName() + " is not in the database");
				}
		
	
		return document.next().getShingles();
		
	}

	@Override
	public void listDatabaseDocs() {
		
		
	
		ObjectSet<Documents> docs = db.query(Documents.class);
		for (Documents d : docs) {
			
			
			//Pull some random shingles
			Random random = new Random();
			List<String> keys = new ArrayList<String>(d.getShingles().keySet());
			String randomKey = keys.get(random.nextInt(keys.size()));
			
			List<String> randomElems = new ArrayList<String>();
			
			for (int i=0; i<10;i++) {
				
				randomKey = keys.get(random.nextInt(keys.size()));
				Integer value = d.getShingles().get(randomKey);
				randomElems.add(randomKey);
			}
			
			out.println("[Doc] " + d.getDocName()  + "\t Database ObjID: "+ db.ext().getID(d));
			out.println("[Shingles]"+randomElems);
			//Removing objects from the database is as easy as adding them
			//db.delete(customer);
			db.commit();
		}	
		
		
	}



}
