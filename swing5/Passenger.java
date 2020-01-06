package swing5;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Passenger {

private JFrame frame;
private JTextField na;
private JTextField an;

/**
* Launch the application.
*/
public static void NewScreen() {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Passenger window = new Passenger();
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
public Passenger() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 747, 496);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("PASSENGER DETAILS");
lblNewLabel.setBounds(187, 0, 137, 19);
frame.getContentPane().add(lblNewLabel);

JLabel name = new JLabel("NAME");
name.setBounds(23, 33, 46, 14);
frame.getContentPane().add(name);

JLabel aadhar = new JLabel("AADHAR NO");
aadhar.setBounds(23, 64, 81, 14);
frame.getContentPane().add(aadhar);

JLabel db = new JLabel("DOB");
db.setBounds(23, 89, 46, 14);
frame.getContentPane().add(db);

JLabel gen = new JLabel("GENDER");
gen.setBounds(23, 138, 46, 14);
frame.getContentPane().add(gen);

JButton ap = new JButton("ADD PASSENGER");
ap.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

}
});
ap.setBounds(157, 164, 137, 23);
frame.getContentPane().add(ap);

JButton pb = new JButton("PRINT BILL");
pb.addActionListener(new ActionListener() {
private AbstractButton Male;

public void actionPerformed(ActionEvent e) {
String Name,DOB, Class;

Name = na.getText().toString();
DOB = db.getText().toString();
String Gender;
if(Male.isSelected())
{
Gender ="Male";
}
else
{
Gender="Female";
}










}
});
pb.setBounds(157, 192, 137, 23);
frame.getContentPane().add(pb);

na = new JTextField();
na.setBounds(218, 30, 144, 20);
frame.getContentPane().add(na);
na.setColumns(10);

an = new JTextField();
an.setBounds(218, 61, 144, 20);
frame.getContentPane().add(an);
an.setColumns(10);

JDateChooser dob = new JDateChooser();
dob.setBounds(218, 92, 144, 20);
frame.getContentPane().add(dob);

JRadioButton male = new JRadioButton("M");
male.setBounds(224, 134, 52, 23);
frame.getContentPane().add(male);

JRadioButton female = new JRadioButton("F");
female.setBounds(291, 134, 46, 23);
frame.getContentPane().add(female);

JTextArea textArea = new JTextArea();
textArea.setBounds(23, 226, 685, 153);
frame.getContentPane().add(textArea);
}
}
