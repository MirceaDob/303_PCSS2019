import java.io.OutputStream;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

public class QuestionWindow {
    List<String> qstlist = (List<String>) AnswerRandomizer.shuffler();
    JFrame qw;
int scor;
String temp = "Test";

QuestionWindow(){
	qw=new JFrame();


	
	int f= Questions.question;
	
	JTextArea score=new JTextArea("Score:", scor, scor);
	score.setBounds(400,50,200,100);
	score.setEditable(false);
	qw.add(score);
	
	JTextArea questionArea=new JTextArea();
	
	questionArea.append(String.valueOf((String)temp));
	
	questionArea.update(questionArea.getGraphics());
	questionArea.setBounds(100,250,800,200);
	questionArea.setEditable(false);
	qw.add(questionArea);
		
	JButton next=new JButton("Next Question");
	next.setBounds(700,75,150,40);
	qw.add(next);
		
	JButton a1=new JButton(qstlist.get(1));
	a1.setBounds(50,500,900,40);
	qw.add(a1);
	
	JButton a2=new JButton(qstlist.get(2));
	a2.setBounds(50,550,900,40);
	qw.add(a2);
	
	JButton a3=new JButton(qstlist.get(3));
	a3.setBounds(50,600,900,40);
	qw.add(a3);
	
	qw.setSize(1000,700);
	qw.setLayout(null);  
	qw.setVisible(true);  
}

    /*public static void main (String[] args)
    {
        try
        {
            QuestionWindow obj = new QuestionWindow();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }


    public void run (String[] args) throws Exception
    {
    }*/

}
