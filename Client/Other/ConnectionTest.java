import java.net.*;
import java.io.*;

public class ConnectionTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 10008);
		//Sets Socket

		try {
			//Input takes terminal data input from client
			DataInputStream input = new DataInputStream(System.in);
			//Output is the outgoing data on the socket
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			
			//Initialise String here
			String line = "";
			
			while (!line.equals("Over")) {
				//The while loop awaits the user's input to be 'Over', before ending
				
				
				//Assign the string the value of users terminal input				
				line = input.readLine();
				
				//Send the data over socket
				output.writeUTF(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}
