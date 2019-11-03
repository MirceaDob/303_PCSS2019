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
    	
    	
        System.out.println("Connect next.");
        //ConnectionTest.connection();
        System.out.println("Connection passed.");
        //Answer correct = new Answer(ConnectionTest.received[1], true);
        //Answer wrong1 = new Answer(ConnectionTest.received[2], false);
        //Answer wrong2 = new Answer(ConnectionTest.received[3], false);
        //Question question = new Question(ConnectionTest.received[0], correct, wrong1, wrong2);

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
