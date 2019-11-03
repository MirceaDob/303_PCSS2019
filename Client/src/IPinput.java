import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;


public class IPinput extends JPanel {
	private JTextField ipInput;

	/**
	 * Create the panel.
	 */
	public IPinput() {
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setBounds(151, 133, 89, 23);
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Client.ipConnect = ipInput.toString();
			}
		});
		setLayout(null);
		
		JTextArea txtrInputIpTo = new JTextArea();
		txtrInputIpTo.setBackground(UIManager.getColor("Button.background"));
		txtrInputIpTo.setText("Input IP to connect to:");
		txtrInputIpTo.setBounds(36, 25, 204, 22);
		txtrInputIpTo.setEditable(false);
		add(txtrInputIpTo);
		add(btnAccept);
		
		ipInput = new JTextField();
		ipInput.setBounds(36, 58, 261, 22);
		add(ipInput);
		ipInput.setColumns(10);

	}

}
