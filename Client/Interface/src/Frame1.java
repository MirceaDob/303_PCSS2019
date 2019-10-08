import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollBar;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String opt1 = "Kyle";
		String opt2 = "Mike";
		String opt3 = "Bob";
		
		JButton btnNewButton = new JButton(opt1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(30, 140, 90, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(opt2);
		btnNewButton_1.setBounds(165, 140, 90, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(opt3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(300, 140, 90, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		
		String q = "What is your name?";
		textField = new JTextField(q);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(30, 30, 360, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(417, 0, 17, 306);
		frame.getContentPane().add(scrollBar);
		
	
	}
}
