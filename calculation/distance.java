package calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class distance {

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
					distance window = new distance();
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
	public distance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distance Calculator");
		lblNewLabel.setBounds(202, 47, 172, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Source Location");
		lblNewLabel_1.setBounds(80, 111, 110, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(243, 108, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Destination Location");
		lblNewLabel_2.setBounds(80, 188, 127, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setBounds(243, 185, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton calc = new JButton("CALCULATE DISTANCE");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String source = t1.getText();
				String destination = t2.getText();
				double dist = 2.3;
				int stop = 57;
				double mileage;
				mileage = dist*stop;
				t3.setText(String.valueOf(mileage +"km"));
				
				
			}
		});
		calc.setBounds(167, 244, 179, 23);
		frame.getContentPane().add(calc);
		
		JLabel lblNewLabel_3 = new JLabel("Distance Covered");
		lblNewLabel_3.setBounds(80, 310, 110, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(243, 307, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
	}

}
