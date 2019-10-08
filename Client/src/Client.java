import java.net.*;
import java.nio.file.*;
import java.io.*;

public class Client {
	
	static Socket s;
	
	public static void main(String[] args) throws Exception {
		String ip;
		
		
		//Make the user input IP here, somewhere. Probably through GUI, eventually.


		s = new Socket(ip, 25565);
		//Connects to IP, Port
		
	}

}
