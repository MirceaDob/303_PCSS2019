import javax.swing.*;

public class QuestionWindow {
JFrame q;
QuestionWindow(){
	q=new JFrame();
	
	JButton a1=new JButton("A1");
	a1.setBounds(150,100,100,40);
	q.add(a1);
	
	JButton a2=new JButton("A2");
	a2.setBounds(150,100,100,40);
	q.add(a2);
	
	JButton a3=new JButton("A3");
	a3.setBounds(150,100,100,40);
	q.add(a3);
	
	q.setSize(400,500);
	q.setLayout(null);  
	q.setVisible(true);  
}
	public static void main(String[] args) {
		new QuestionWindow();

	}

}
