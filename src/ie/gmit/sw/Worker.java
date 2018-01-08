package ie.gmit.sw;

//this class acts as an interface that the runnable Worker will use to get the txt parsed
//from the Service Handler to the logic application 

public interface Worker {
	public void run();
	public void setSim(double sim);
	public double getSim();
}
