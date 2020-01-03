package calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class discount {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					discount window = new discount();
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
	public discount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel.setBounds(131, 21, 172, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPAL AMOUNT");
		lblNewLabel_1.setBounds(27, 65, 123, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(205, 61, 86, 23);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DISCOUNT PERCENTAGE");
		lblNewLabel_2.setBounds(27, 113, 144, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setBounds(205, 110, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		t3 = new JTextField();
		t3.setBounds(205, 206, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton calc = new JButton("CALCULATE");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int principal = Integer.parseInt(t1.getText());
				int discount = Integer.parseInt(t2.getText());
				int net;
				net = (principal * discount)/100;
				int total;
				total = principal - net;
				t3.setText(String.valueOf(total));
			}
		});
		calc.setBounds(120, 153, 144, 23);
		frame.getContentPane().add(calc);
		
		JLabel lblNewLabel_3 = new JLabel("NET PRICE");
		lblNewLabel_3.setBounds(37, 209, 98, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Rs");
		lblNewLabel_4.setBounds(301, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(301, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs");
		lblNewLabel_6.setBounds(301, 212, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
