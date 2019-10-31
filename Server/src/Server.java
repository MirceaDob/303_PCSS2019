import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Random;


public class Server {

	private static ServerSocket ss;




	public static void main(String[] args) throws IOException {
		ss = new ServerSocket(10008);
		ss.setReuseAddress(true);
		//Note: Important. Allows socket to be bound, even if other is in timeout state.
		System.out.println("Waiting for connection...");
		ArrayList<String> q = new ArrayList<String>();
		q.add("question1");
		q.add("question2");
		q.add("question");
		
		
		//MysqlCon.printSQL();
		while (true) {
			Socket client = ss.accept();//accepting client
	
			System.out.println("Success");
			//Accept incoming connections
			
			User userhandler = new User(client);
			//New class object
			
			new Thread(userhandler).start();
			//New thread to handle new class object, while main thread accepts connections.
			
		}
		
	}
	
		
	
	private static class User implements Runnable {
		private Socket userSocket;
		
		public User(Socket socket) {
			//CONSTRUCTOR
			this.userSocket = socket;
		}
		
		
		@Override
		public void run() {
			// input = null;
			ObjectOutputStream objectOutput = null;
			DataInputStream input = null;
			DataOutputStream output = null;
			//Initialise, needed later on
			
			
			try {
				input = new DataInputStream(new BufferedInputStream(userSocket.getInputStream()));
				//BufferedReader bfr = new BufferedReader(new InputStreamReader(input));
				output = new DataOutputStream(userSocket.getOutputStream());
				objectOutput = new ObjectOutputStream(userSocket.getOutputStream());

				//String received = bfr.readLine();
				//System.out.println(received);
				//Test to print input from client
				
				String line = ""; 
				//String received = "";
				//String [] questions = new String[3]; //Empty at the moment
				//questions[0] = "question1";
				//questions[1] = "question2";
				//questions[2] = "question3";
				//String questions[];
				//questions = new String[] {"Question1", "Question2", "Question3"}; //examples
				String [] questions = {"hello", "no thanks", "whatever"};
				while (!line.equals("Over")) { //Unless client types "Over" input will be printed
					line = input.readUTF();
					// --> ? sendQuestion = getRandomQuestion(listWithQuestions);
					System.out.println(line); //Printing input from client
					output.writeUTF("cool");
					objectOutput.writeObject(questions);
					//outputStream.writeObject(questions);
					//System.out.println(questions[1]);
					//System.out.println("received");
					
				
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
