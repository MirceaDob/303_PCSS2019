import javax.swing.*;

public class QuestionWindow {
JFrame qw;
int scor;

QuestionWindow(){
	qw=new JFrame();
	
	JTextArea score=new JTextArea("Score:", scor, scor);
	score.setBounds(400,50,200,100);
	score.setEditable(false);
	qw.add(score);
	
	JTextArea question=new JTextArea("Question");
	question.setBounds(100,250,800,200);
	question.setEditable(false);
	qw.add(question);
	
	JButton next=new JButton("Next Question");
	next.setBounds(700,75,150,40);
	qw.add(next);
		
	JButton a1=new JButton("Answer 1");
	a1.setBounds(50,500,900,40);
	qw.add(a1);
	
	JButton a2=new JButton("Answer 2");
	a2.setBounds(50,550,900,40);
	qw.add(a2);
	
	JButton a3=new JButton("Answer 3");
	a3.setBounds(50,600,900,40);
	qw.add(a3);
	
	qw.setSize(1000,700);
	qw.setLayout(null);  
	qw.setVisible(true);  
}
	public static void main(String[] args) {
		new QuestionWindow();

	}

}
