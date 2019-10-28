import java.io.*;
import java.net.*;

public class Server {

	private static ServerSocket ss;




	public static void main(String[] args) throws IOException {
		ss = new ServerSocket(10008);
		ss.setReuseAddress(true);
		//Note: Important. Allows socket to be bound, even if other is in timeout state.
		System.out.println("Waiting for connection...");
		//MysqlCon.printSQL();
		while (true) {
			Socket client = ss.accept();
	
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
			
			DataInputStream input = null;
			DataOutputStream output = null;
			//Initialise, needed later on
			
			try {
				input = new DataInputStream(new BufferedInputStream(userSocket.getInputStream()));
				//BufferedReader bfr = new BufferedReader(input);
				output = new DataOutputStream(userSocket.getOutputStream());

				//String received = bfr.readLine();
				//System.out.println(received);
				//Test to print input from client
				
				String line = "";
				
				while (!line.equals("Over")) {
					line = input.readUTF();
					System.out.println(line);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
