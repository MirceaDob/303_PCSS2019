
import java.net.*;
import java.io.*;

public class ConnectionTest {
	public static String[] received;
	public static Socket s;
	static DataOutputStream output;
	static ObjectInputStream objectInput;
	//static ObjectInputStream objectInput;
	static String line = "Test";



	public static void connection() throws UnknownHostException, IOException, ClassNotFoundException {


		System.out.println("Connecting to " + Client.ipConnect + "...");
		s = new Socket(Client.ipConnect, 10008);
		System.out.println("Connected.");
		//Sets Socket
		output = new DataOutputStream(s.getOutputStream());

		
		
		try {
			//DataInputStream input;
			//Input takes terminal data input from client
			DataInputStream userInput = new DataInputStream(System.in);
			int inputNumber;
			//Output is the outgoing data on the socket
			//input = new DataInputStream(new BufferedInputStream(s.getInputStream()));
			ObjectInputStream objectInput = new ObjectInputStream(s.getInputStream());


			//Initialise String here
			

			
			//while (!line.equals("Over")) {
				//The while loop awaits the user's input to be 'Over', before ending
				
				
				//Assign the string the value of users terminal input				
				//line = userInput.readLine();
				//inputNumber = Integer.parseInt(line);
				
				//Send the data over socket
				output.writeUTF(line);
				
				received = (String[]) objectInput.readObject();
				
				//System.out.println(received[inputNumber]);
			//}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		public static void response(String rw) throws UnknownHostException, IOException, ClassNotFoundException
		{
			output.writeUTF(rw);
			System.out.println("Sent");
		}
		
		public static void newQuest() throws IOException, ClassNotFoundException {
			output.writeUTF(line);
			
			System.out.println(line);
			
			//objectInput = (ObjectInputStream) (s.getInputStream());
			System.out.println("Streaming in.");
			
			//Object receivedObject = objectInput.readObject();
			//System.out.println(receivedObject);
			//received = (String[]) objectInput.readObject();
			System.out.println(received);
			MainWindow.setQuestion();
			
		}

	}
