import javax.swing.*;
import java.net.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;

/*import miniProject.DataInputStream;
import miniProject.DataOutputStream;
import miniProject.IOException;
import miniProject.Socket;
*/
public class Client {
	
	private Socket socket;
	private static int port = 25565;
	private DataInputStream iStream;
    private DataOutputStream oStream;
    private String input;

    private MainWindow window;
    
    public Client()
    {
        Answer correct = new Answer("Right Answer", true);
        Answer wrong1 = new Answer("Wrong Answer 1", false);
        Answer wrong2 = new Answer("Wrong Answer 2", false);
        Question question = new Question("Question", correct, wrong1, wrong2);

        window = new MainWindow();

        window.setToQuestionPanel(question);

        //String ip = "198.0.0.1";



        //Make the user input IP here, somewhere. Probably through GUI, eventually.
        //s = new Socket(ip, 25565);
        //Connects to IP, Port

		/*try {
			this.socket = new Socket(ip, port);
            this.iStream = new DataInputStream(socket.getInputStream());
            this.oStream = new DataOutputStream(socket.getOutputStream());
        }catch (Exception e) {
            e.printStackTrace();
        }*/



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
