package ie.gmit.sw;

import com.db4o.*;

public interface Database {
	
	public void init() throws Exception;
	public void compare();

}
