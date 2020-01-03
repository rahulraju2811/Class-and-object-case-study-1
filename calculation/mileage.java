package calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mileage {

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
					mileage window = new mileage();
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
	public mileage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MILEAGE CALCULATOR");
		lblNewLabel.setBounds(197, 44, 203, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance covered in km");
		lblNewLabel_1.setBounds(59, 94, 189, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(266, 91, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Petrol Consumed in liter");
		lblNewLabel_2.setBounds(59, 149, 155, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setBounds(266, 146, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE MILEAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int distance = Integer.parseInt(t1.getText());
				int petrol = Integer.parseInt(t2.getText());
				int mileage;
				mileage = distance / petrol;
				t3.setText(String.valueOf(mileage));
			}
		});
		btnNewButton.setBounds(159, 210, 166, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Mileage per liter");
		lblNewLabel_3.setBounds(59, 265, 129, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(266, 262, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
	}

}
