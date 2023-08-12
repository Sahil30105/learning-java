import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Simple_calc implements ActionListener
{
JFrame frame;
Container contentPane;
JLabel label,label1,label2,label3;
JTextField t1,t2,t3;
JButton button,b1,b2,b3,b4,b5;

public Simple_calc()
{
frame=new JFrame("Swing Arithmetics");
frame.setSize(new Dimension(300,200));
frame.setLocation(100,100);
frame.setLayout(new GridLayout(6,2,5,5));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container contentPane=frame.getContentPane();

label=new JLabel("First Number :");
contentPane.add(label);
t1=new JTextField("",15);
contentPane.add(t1);

label1=new JLabel("Second Number");
contentPane.add(label1);
t2=new JTextField("",15);
contentPane.add(t2);

label3=new JLabel("Result");
contentPane.add(label3);
t3=new JTextField("",15);
contentPane.add(t3);

button=new JButton("+");
button.addActionListener(this);
contentPane.add(button);

b1=new JButton("-");
b1.addActionListener(this);
contentPane.add(b1);

b2=new JButton("*");
b2.addActionListener(this);
contentPane.add(b2);

b3=new JButton("/");
b3.addActionListener(this);
contentPane.add(b3);

b4=new JButton("%");
b4.addActionListener(this);
contentPane.add(b4);

b5=new JButton("CLEAR");
b5.addActionListener(this);
contentPane.add(b5);

frame.setVisible(true);
}
public static void main(String[] args)
{
Simple_calc app=new Simple_calc();
}
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
String s2=t2.getText();
int s3,s4,s5,s6,s7;

int a=Integer.parseInt(s1);  
int c=Integer.parseInt(s2);  
s3=a+c;
s4=a-c;
s5=a*c;
s6=a/c;
s7=a%c;
if(e.getSource()==button)
{
String r1=String.valueOf(s3);  
t3.setText(r1);
}
else if (e.getSource()==b1)
{
String r2=String.valueOf(s4);  
t3.setText(r2);
}
else if (e.getSource()==b2)
{
String r3=String.valueOf(s5);  
t3.setText(r3);
}
else if (e.getSource()==b3)
{
String r4=String.valueOf(s6);  
t3.setText(r4);
}
else if (e.getSource()==b4)
{
String r5=String.valueOf(s7);  
t3.setText(r5);
}
else 
{
String r6="";
t3.setText(r6);
}
}
}