import java.io.*;
import java.net.*;

public class Server {

	 //private ObjectInputStream inputFromClient;
	 //private ObjectOutputStream outputToClient;

		private static ServerSocket ss;


	public static void main(String[] args) throws IOException {
		ss = new ServerSocket(10008);
		ss.setReuseAddress(true);
		//Note: Important. Allows socket to be bound, even if other is in timeout state.
		System.out.println("Waiting for connection...");
//		<<<<<<< HEAD
		//MysqlCon.printSQL();		
//=======
//		int genID = ShuffleRand.shuffleID();
//		MysqlCon.printSQL(genID);
//		System.exit(0);
//>>>>>>> 2b335e78900cf259a6bb0c8964707bb5863f961d
	//	
		while (true) {
			Socket client = ss.accept(); //Connect to a client
			System.out.println("Connection accepted"); 
			
			
//			//Accept incoming connections
			
			User userhandler = new User(client);
			//New class object
			
			new Thread(userhandler).start();
			//New thread to handle new class object, while main thread accepts connections.
			
		}
		
	}
	
		
	
	private static class User implements Runnable {
		private Socket userSocket; // a connected socket
		
		public User(Socket socket) {
			//Constructor 
			this.userSocket = socket;
		}
		
		
		@Override
		public void run() {
			// input = null;
			
			DataInputStream input = null;
			DataOutputStream output = null;
			//Initialise, needed later on
			
			// create data input and output streams
			try { 
				input = new DataInputStream(new BufferedInputStream(userSocket.getInputStream()));
				//BufferedReader bfr = new BufferedReader(new InputStreamReader(input));
				output = new DataOutputStream(userSocket.getOutputStream());
				//ObjectOutputStream outputStream = new ObjectOutputStream(userSocket.getOutputStream());

				//String received = bfr.readLine();
				//System.out.println(received);
				//Test to print input from client
				
				/*
				outputToClient = new ObjectOutputStream(ss.getOutputStream());
				 //Create an input stream from socket
				inputFromClient = new ObjectInputStream(ss.getInputStream());
				
				// read from input
				 Object object = inputFromClient.readObject();
				
				
				// Write to Server
				// outputToFile.writeObject(object);
				// System.out.println("");
				*/
				
				String line = ""; 
				String received = "cool";
				//String [] questions = new String[3]; //Empty at the moment
				//questions[0] = "question1";
				//questions[1] = "question2";
				//questions[2] = "question3";
				//String questions[];
				//questions = new String[] {"Question1", "Question2", "Question3"}; //examples
				
				
				while (!line.equals("Over")) { //Unless client types "Over" input will be printed
					line = input.readUTF(); //receives/reads input from client
					//String command = inputFromClient.readUTF();
					//System.out.println("received");
					
					System.out.println(line); //Printing input from client
					
					//initialise the output (q and a) to client  
					
					output.writeUTF(received); //prints string to client 
				
					//	outputStream.writeObject(questions);
				
					//	System.out.println(questions[1]);
					
					//	System.out.println("received");
					
				
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//System.out.println("Unable to start server.");
				e.printStackTrace();
			}
			
			finally {				
				//Close socket				
                try {
                    if (output != null) {
                        output.close();
                    }
                    if (input != null)
                        input.close();
                    userSocket.close();
                } catch (IOException e) { 
                    e.printStackTrace();
                }
		}
		
	}}}
