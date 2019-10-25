import javax.swing.*;

public class JoinGame {
	JFrame jg;
	
	JoinGame(){
		jg=new JFrame();
		
		JButton j=new JButton("Join Game");
		j.setBounds(350,500,300,40);
		jg.add(j);
		
		jg.setSize(1000,700);
		jg.setLayout(null);  
		jg.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JoinGame();

	}

}
