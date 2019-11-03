import javax.swing.*;
import java.util.Random;

public class MainWindow
{
    private JFrame window;
    private QuestionPanel questionPanel;
    private IPinput ipPanel;

    public MainWindow()
    {
        window = new JFrame();
        ipPanel = new IPinput();
        questionPanel = new QuestionPanel();
        
        panelSet();
        
        while(Client.ipConnect == null) {
        	System.out.println("Awaiting User Input...");
        	
        }
        window.dispose();
        
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
    
    
    
}



