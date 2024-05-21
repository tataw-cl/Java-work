import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI1 implements ActionListener {
	private JButton button;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	int count =0;
	public GUI1() {
		button = new JButton("Click me");
		// Set the maximum size of the button to 100x50 pixels
		button.setMaximumSize(new Dimension(10, 20));
		label = new JLabel("Number of Clicks: 0");
		button.addActionListener(this);
		
		frame = new JFrame();
		panel= new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Example GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count ++;
		label.setText("Number of Clicks: "+count);
	}

}