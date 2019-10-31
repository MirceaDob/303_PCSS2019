
import java.net.*;
import java.io.*;

public class ConnectionTest {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Socket s = new Socket("localhost", 10008);
		//Sets Socket
		

		try {
			//DataInputStream input;
			//Input takes terminal data input from client
			DataInputStream userInput = new DataInputStream(System.in);
			int inputNumber;
			//Output is the outgoing data on the socket
			//input = new DataInputStream(new BufferedInputStream(s.getInputStream()));
			ObjectInputStream objectInput = new ObjectInputStream(s.getInputStream());
			
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			
			//Initialise String here
			String line = "";
			String[] received;
			
			while (!line.equals("Over")) {
				//The while loop awaits the user's input to be 'Over', before ending
				
				
				//Assign the string the value of users terminal input				
				line = userInput.readLine();
				inputNumber = Integer.parseInt(line);
				
				//Send the data over socket
				output.writeUTF(line);
				
				received = (String[]) objectInput.readObject();
				
				System.out.println(received[inputNumber]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}
