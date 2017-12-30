package ie.gmit.sw;

import static java.lang.System.out;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.db4o.*;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentActivationSupport;
import com.db4o.ta.TransparentPersistenceSupport;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

public class DatabaseImpl implements Database {
	
	private ObjectContainer db = null;
	private List<Documents> docs = new ArrayList<Documents>();

	@Override
	public void init() throws Exception {
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
		
		/*
		//reading in Doc to DB
		FileReader in = null;
		try {
			in = new FileReader("war-and-peace.txt");
		} catch (FileNotFoundException e) {
			System.out.println("War and Peace Not Found");// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    BufferedReader br = new BufferedReader(in);
	    
		String line;
		String txt = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		    txt = txt + line;
		}
		
		Documents doc = new Documents("War and Peace", txt);
		db.store(doc);
		*/
		
		
		ObjectSet<Documents> d = db.query(Documents.class);
		for (Documents customer : d) {
			out.println("[Doc] " + customer.getDocName() + "\t ***Database ObjID: " + db.ext().getID(customer));

			//Removing objects from the database is as easy as adding them
			//db.delete(customer);
			db.commit();
		}
		
	}

	@Override
	public void compare() {
		// TODO Auto-generated method stub
		
	}

}
