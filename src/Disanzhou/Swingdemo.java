package Disanzhou;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swingdemo {
	public static void main(String[] args) {
		Swingdemo swingdemo = new Swingdemo();
		swingdemo.showview();
	}

	private void showview() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLocation(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel = (JPanel) frame.getContentPane();
		jPanel.setLayout(new FlowLayout());

		final JTextField jTextField1 = new JTextField();
		jTextField1.setPreferredSize(new Dimension(50, 50));
		jPanel.add(jTextField1);

		JLabel jLabel = new JLabel("+");// Ïàµ±ÓÚJlabel jlabel=new
										// Jlabel();jlabel="+";

		jLabel.setPreferredSize(new Dimension(50, 50));
		jPanel.add(jLabel);

		final JTextField jTextField2 = new JTextField();
		jTextField2.setPreferredSize(new Dimension(50, 50));
		jPanel.add(jTextField2);

		JButton jButton = new JButton("=");
		jButton.setPreferredSize(new Dimension(50, 50));
		jPanel.add(jButton);

		final JLabel jLabelresult = new JLabel();
		jLabel.setPreferredSize(new Dimension(50, 50));
		jPanel.add(jLabelresult);
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("actionperformed");
				if ((jTextField1.getText() != null && !jTextField1.getText().equals(""))
						&& (jTextField2.getText() != null && !jTextField2.getText().equals(""))) {
					int num1 = Integer.parseInt(jTextField1.getText());
					int num2 = Integer.parseInt(jTextField2.getText());
					int result = num1 + num2;
					jLabelresult.setText(Integer.toString(result));
				}

			}
		});

		frame.setVisible(true);

	}
}
