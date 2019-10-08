import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(25565);
		Socket s = ss.accept();
		
		System.out.println("Success");
		

		InputStreamReader input = new InputStreamReader(s.getInputStream());
		BufferedReader bfr = new BufferedReader(input);
		
		String inpstr = bfr.readLine();
		System.out.println(inpstr);
		
	}
	
	
}
