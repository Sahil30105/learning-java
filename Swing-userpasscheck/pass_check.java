import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class pass_check implements ActionListener
{
JFrame frame;
Container cp;
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1;

public pass_check()
{
frame=new JFrame("login");
frame.setSize(new Dimension(300,200));
frame.setLayout(new GridLayout(4,2));
frame.setLocation(100,100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container cp=frame.getContentPane();

l1=new JLabel("Enter username :");
cp.add(l1);
t1=new JTextField("",15);
cp.add(t1);

l2=new JLabel("Enter password :");
cp.add(l2);
t2=new JTextField("",15);
cp.add(t2);

l3=new JLabel("");
cp.add(l3);

l4=new JLabel("");
cp.add(l4);

b1=new JButton("LOGIN");
b1.addActionListener(this);
cp.add(b1);


frame.setVisible(true);
}
public static void main(String[] args)
{
pass_check app=new pass_check();
}
public void actionPerformed(ActionEvent e)
{
String s1="admin";
String s2=t1.getText();
String s3=t2.getText();

if (s2.equalsIgnoreCase(s1) && s3.equalsIgnoreCase(s1)) {
l4.setText("Welcome User");
}

else{
l4.setText("Wrong username or password");
}
}
}