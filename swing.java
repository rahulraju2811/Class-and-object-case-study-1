package pkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Registration Form");
		lblNewLabel.setBounds(224, 11, 132, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(27, 52, 112, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(27, 77, 112, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DOB");
		lblNewLabel_3.setBounds(27, 109, 112, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		lblNewLabel_4.setBounds(27, 134, 112, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(27, 159, 112, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(27, 184, 112, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 246, 402, 114);
		frame.getContentPane().add(textArea);
		
		JRadioButton rdb = new JRadioButton("F");
		rdb.setBounds(247, 155, 109, 23);
		frame.getContentPane().add(rdb);
		
		JRadioButton rdb2 = new JRadioButton("M");
		rdb2.setBounds(394, 155, 109, 23);
		frame.getContentPane().add(rdb2);
 
       
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		textArea.setText("Registration Successful!! Your details are:\n");
		textArea.append("First Name:             "+txt1.getText()+"\n");
		textArea.append("Second Name:       "+txt2.getText()+"\n");
		textArea.append("DOB:                        "+txt3.getText()+"\n");
		textArea.append("Mobile Number:     "+txt4.getText()+"\n");
		if(rdb.isSelected())
		{
			textArea.append("Gender:                  Female\n");
		}
		else if(rdb2.isSelected())
		{
			textArea.append("Gender:                   Male\n");
		}
		textArea.append("Email:                      "+txt5.getText());
			}
		});
		btn.setBounds(188, 212, 89, 23);
		frame.getContentPane().add(btn);
		
		txt1 = new JTextField();
		txt1.setBounds(253, 36, 176, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(253, 71, 176, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(253, 102, 176, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(253, 131, 176, 20);
		frame.getContentPane().add(txt4);
		txt4.setColumns(10);
		
				
		txt5 = new JTextField();
		txt5.setBounds(253, 181, 176, 20);
		frame.getContentPane().add(txt5);
		txt5.setColumns(10);
		
			}
}
