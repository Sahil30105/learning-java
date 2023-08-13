import java.awt.*;
import javax.swing.*;
public class student_resume
{
public static void main(String[] args)
{
JFrame frame=new JFrame("Resume");
frame.setSize(new Dimension(600,300));
frame.setLocation(100,100);
frame.setLayout(null);
Container cp=frame.getContentPane();

JLabel label=new JLabel("Personal Details");
label.setBounds(600,1,120,40);
cp.add(label);

JLabel l1=new JLabel("Enter your first name : ");
l1.setBounds(40,40,150,20);
cp.add(l1);
JTextField t1=new JTextField("");
t1.setBounds(200,40,120,20);
cp.add(t1);

JLabel l2=new JLabel("Enter your last name : ");
l2.setBounds(340,40,150,20);
cp.add(l2);
JTextField t2=new JTextField("");
t2.setBounds(500,40,120,20);
cp.add(t2);

JLabel l3=new JLabel("Enter your address : ");
l3.setBounds(640,40,150,20);
cp.add(l3);
JTextField t3=new JTextField("");
t3.setBounds(790,40,200,20);
cp.add(t3);

JLabel l4=new JLabel("Enter your phone number : ");
l4.setBounds(1010,40,200,20);
cp.add(l4);
JTextField t4=new JTextField("");
t4.setBounds(1195,40,120,20);
cp.add(t4);

JLabel ln=new JLabel("Select your undergraduate course");
ln.setBounds(550,80,200,40);
cp.add(ln);

JButton b1=new JButton("Plain Bsc");
b1.setBounds(300,120,100,20);
cp.add(b1);
JButton b2=new JButton("Bsc CS");
b2.setBounds(450,120,100,20);
cp.add(b2);
JButton b3=new JButton("Bsc IT");
b3.setBounds(600,120,100,20);
cp.add(b3);
JButton b4=new JButton("BMS");
b4.setBounds(750,120,100,20);
cp.add(b4);
JButton b5=new JButton("BAF");
b5.setBounds(900,120,100,20);
cp.add(b5);

JLabel ln1=new JLabel("Enter your First Year CGPA : ");
ln1.setBounds(120,180,200,20);
cp.add(ln1);
JTextField tn1=new JTextField("");
tn1.setBounds(310,180,120,20);
cp.add(tn1);

JLabel ln2=new JLabel("Enter your Second Year CGPA : ");
ln2.setBounds(450,180,200,20);
cp.add(ln2);
JTextField tn2=new JTextField("");
tn2.setBounds(640,180,120,20);
cp.add(tn2);

JLabel ln3=new JLabel("Enter your Third Year CGPA : ");
ln3.setBounds(780,180,200,20);
cp.add(ln3);
JTextField tn3=new JTextField("");
tn3.setBounds(970,180,120,20);
cp.add(tn3);

JLabel ln4=new JLabel("Have you ever recieved ATKT?");
ln4.setBounds(575,220,200,40);
cp.add(ln4);

JButton b6=new JButton("YES");
b6.setBounds(530,260,100,20);
cp.add(b6);
JButton b7=new JButton("NO");
b7.setBounds(680,260,100,20);
cp.add(b7);

JLabel ln5=new JLabel("If Yes, Select the particular year");
ln5.setBounds(575,300,200,40);
cp.add(ln5);

JButton b8=new JButton("First Year");
b8.setBounds(40,340,100,20);
cp.add(b8);
JButton b9=new JButton("Second Year");
b9.setBounds(600,340,150,20);
cp.add(b9);
JButton b10=new JButton("Third Year");
b10.setBounds(1130,340,100,20);
cp.add(b10);

JLabel ln6=new JLabel("Select Semester");
ln6.setBounds(40,380,200,40);
cp.add(ln6);
JLabel ln7=new JLabel("Select Semester");
ln7.setBounds(620,380,200,40);
cp.add(ln7);
JLabel ln8=new JLabel("Select Semester");
ln8.setBounds(1130,380,200,40);
cp.add(ln8);

JButton b11=new JButton("1st Sem");
b11.setBounds(40,420,100,20);
cp.add(b11);
JButton b12=new JButton("2nd Sem");
b12.setBounds(40,450,100,20);
cp.add(b12);

JButton b13=new JButton("3rd Sem");
b13.setBounds(620,420,100,20);
cp.add(b13);
JButton b14=new JButton("4th Sem");
b14.setBounds(620,450,100,20);
cp.add(b14);

JButton b15=new JButton("5th Sem");
b15.setBounds(1130,420,100,20);
cp.add(b15);
JButton b16=new JButton("6th Sem");
b16.setBounds(1130,450,100,20);
cp.add(b16);

JLabel ln9=new JLabel("Enter your Significant Skills : ");
ln9.setBounds(40,510,200,20);
cp.add(ln9);
JTextField tn4=new JTextField("");
tn4.setBounds(230,510,300,20);
cp.add(tn4);

JLabel ln10=new JLabel("Enter your job experience : ");
ln10.setBounds(40,550,200,20);
cp.add(ln10);
JTextField tn5=new JTextField("");
tn5.setBounds(230,550,120,20);
cp.add(tn5);



frame.setVisible(true);
}
}