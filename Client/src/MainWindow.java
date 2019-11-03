import javax.swing.*;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Random;

public class MainWindow
{
    private JFrame window;
    private static QuestionPanel questionPanel;
    private IPinput ipPanel;
    static Question question;

    public MainWindow() throws UnknownHostException, ClassNotFoundException, IOException
    {
    	
        window = new JFrame();
        ipPanel = new IPinput();
        
        panelSet();
        
        
        while(Client.ipConnect == null) {
        	//System.out.println("While.");
        	
        }
        
        System.out.println("Connect next.");
        ConnectionTest.connection();
        System.out.println("Connection passed.");
        //Client.setQuestion();
        
        window.dispose();
        
        Answer correct = new Answer(ConnectionTest.received[1], true);
        Answer wrong1 = new Answer(ConnectionTest.received[2], false);
        Answer wrong2 = new Answer(ConnectionTest.received[3], false);
        Question question = new Question(ConnectionTest.received[0], correct, wrong1, wrong2);
        
        
        
        questionPanel = new QuestionPanel();
        questionPanel.showQuestion(question);
        
        panelSet();
        //setWindow(questionPanel, 1000, 700);

    }

    public void panelSet()
    {
    	if (Client.ipConnect == null) {
            setWindow(ipPanel, 390, 197);    	
        }
        
        else {
        	setWindow(questionPanel, 1000, 700);
        }
    }
    
    
    public void setWindow(JPanel displayPanel, int horSize, int verSize) {
    	window.setSize(horSize, verSize);
    	window.setContentPane(displayPanel);
        // Setup the basic window
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    

    public static void setQuestion() {
    	Answer correct = new Answer(ConnectionTest.received[1], true);
        Answer wrong1 = new Answer(ConnectionTest.received[2], false);
        Answer wrong2 = new Answer(ConnectionTest.received[3], false);
        question = new Question(ConnectionTest.received[0], correct, wrong1, wrong2);
        questionPanel.showQuestion(question);
        System.out.println(question);
        
    }
    
}



