package swing5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Book {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;

/**
* Launch the application.
*/
public static void main(String[]args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Book window = new Book();
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
public Book() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 514, 415);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel bk = new JLabel(" BOOK YOUR TRAIN TICKET");
bk.setBounds(164, 11, 177, 14);
frame.getContentPane().add(bk);

JLabel from = new JLabel("FROM");
from.setBounds(50, 58, 46, 14);
frame.getContentPane().add(from);

JLabel to = new JLabel("TO");
to.setBounds(50, 111, 46, 14);
frame.getContentPane().add(to);

JLabel date = new JLabel("DATE");
date.setBounds(50, 160, 46, 14);
frame.getContentPane().add(date);

JLabel cl = new JLabel("CLASS");
cl.setBounds(50, 222, 46, 14);
frame.getContentPane().add(cl);

JLabel pass = new JLabel("NO OF PASSENGERS");
pass.setBounds(50, 281, 124, 14);
frame.getContentPane().add(pass);

JButton nxt = new JButton("NEXT");
nxt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
Passenger ps = new Passenger();
ps.NewScreen();
}
});
nxt.setBounds(179, 330, 99, 23);
frame.getContentPane().add(nxt);

textField = new JTextField();
textField.setBounds(268, 55, 99, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setBounds(268, 108, 99, 20);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);

JDateChooser dateChooser = new JDateChooser();
dateChooser.setBounds(268, 154, 99, 20);
frame.getContentPane().add(dateChooser);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sleeper", "Semi sleeper", "Car chair "}));
comboBox.setBounds(266, 219, 101, 20);
frame.getContentPane().add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
comboBox_1.setBounds(268, 278, 99, 20);
frame.getContentPane().add(comboBox_1);
}


}