import javax.swing.*;
import java.awt.Graphics;

public class QuestionWindow {
JFrame q;
Graphics g;
int scor;

QuestionWindow(){
	q=new JFrame();
	
	JTextArea score=new JTextArea("Score:", scor, scor);
	score.setBounds(400,50,200,100);
	score.setEditable(false);
	q.add(score);
	
	JTextArea question=new JTextArea("Question");
	question.setBounds(100,250,800,200);
	question.setEditable(false);
	q.add(question);
	
	JButton next=new JButton("Next Question");
	next.setBounds(700,75,150,40);
	q.add(next);
		
	JButton a1=new JButton("Answer 1");
	a1.setBounds(50,500,900,40);
	q.add(a1);
	
	JButton a2=new JButton("Answer 2");
	a2.setBounds(50,550,900,40);
	q.add(a2);
	
	JButton a3=new JButton("Answer 3");
	a3.setBounds(50,600,900,40);
	q.add(a3);
	
	q.setSize(1000,700);
	q.setLayout(null);  
	q.setVisible(true);  
}
	public static void main(String[] args) {
		new QuestionWindow();

	}

}
