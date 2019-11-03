import javax.swing.*;
import java.net.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;


public class Client {
	
	private Socket socket;
	public static String ipConnect = null;
	private static int port = 25565;
	private DataInputStream iStream;
    private DataOutputStream oStream;
    private String input;

    private MainWindow window;


    public Client() throws UnknownHostException, IOException, ClassNotFoundException
    {
    	
        window = new MainWindow(); 

       // window.setToQuestionPanel(question);



    }

    public static void main(String[] args) throws Exception {
        new Client();

	}
    
    		
	
	protected void send (String message) {
        try {
            oStream.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Closes the connection to the client
     
    protected void close () {
        try {
            iStream.close();
            oStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
