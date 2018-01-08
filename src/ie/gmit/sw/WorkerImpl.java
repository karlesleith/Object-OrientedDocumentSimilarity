package ie.gmit.sw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;


//This class is the logical implementation of the Worker Interface

public class WorkerImpl implements Worker, Runnable {

	private double sim;
	private JaccardImpl JSI;
	private Documents d;
	private DatabaseImpl DI;
	
	String title; 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

	ArrayList<String> lines;
	
	public WorkerImpl(String t, ArrayList<String> s) throws IOException {
		
		System.out.println("[Debug WorkerImpl 1] Hello from the Worker constructor");
		sim = 999;
		JSI = new JaccardImpl();
		DI = new DatabaseImpl();
		
		//System.out.println("[Debug WorkerImpl 1.5]\n[Title: ]"+t+"\n[lines: ]"+s);
		
	setTitle(t);
	setLines(s);
	}
	
	public WorkerImpl() {
		//Default
	}
	
	@Override
	public void run() {
	
		//System.out.println("[Debug WorkerImpl 2]\n[Title: ]"+title+"\n[lines: ]"+lines);
		
		TreeMap<String, Integer> shingleUpload = JSI.Shingle(lines);
		d = new Documents("Ob1");
		
		Documents tempDoc = new Documents(title,shingleUpload);
		
		DI.pushToDatabase(title, shingleUpload);
		
		double tempSim = JSI.PercentageOfSimerlarity(DI.getFromDatabase(tempDoc), DI.getFromDatabase(d));
		
		
		System.out.println("Percentage of Simerlarity is :"+tempSim);
		setSim(tempSim);
		
		
	}

	public double getSim() {
		return sim;
	}

	public void setSim(double sim) {
		this.sim = sim;
	}


}
