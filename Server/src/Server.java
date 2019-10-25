import java.io.*;
import java.net.*;

public class Server {

	private static ServerSocket ss;




	public static void main(String[] args) throws IOException {
		ss = new ServerSocket(10002);
		ss.setReuseAddress(true);
		//Note: Important. Allows socket to be bound, even if other is in timeout state.
		System.out.println("Waiting for connection...");
		MysqlCon.printSQL();
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
			InputStreamReader input = null;
			PrintWriter output = null;
			//Instantiate, needed later on
			
			try {
				input = new InputStreamReader(userSocket.getInputStream());
				BufferedReader bfr = new BufferedReader(input);
				output = new PrintWriter(userSocket.getOutputStream(), true);

				String inpstr = bfr.readLine();
				System.out.println(inpstr);
				//Test to print input from client
				
				String received;
				
				while ((received = bfr.readLine()) != null) {
					System.out.println(received);
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
