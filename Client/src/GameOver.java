import javax.swing.*;

public class GameOver {
	JFrame go;
	
	GameOver(){
		go=new JFrame();
		
		JTextArea score=new JTextArea("Score:");
		score.setBounds(400,200,200,100);
		score.setEditable(false);
		go.add(score);
		
		JButton g=new JButton("Finish");
		g.setBounds(350,500,300,40);
		go.add(g);
		g.addActionListener(e -> System.exit(0));
		
		go.setSize(1000,700);
		go.setLayout(null);  
		go.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameOver();

	}

}
