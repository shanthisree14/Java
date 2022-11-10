import java.rmi.*;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.io.*;
public class ArithClient extends JFrame implements ActionListener
{
JLabel title,l1,l2,res;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5;
double n1,n2,d1;
String str;
ArithIntf a;
public ArithClient()
{
Container c= getContentPane(); setVisible(true); 
setSize(440,440);
c.setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setTitle("Calculations");
title = new JLabel("Remote Object Arithmetic Operator"); 
title.setBounds(55,20,400,30); 
l1 = new JLabel("1st number: ");
l1.setBounds(50,70,100,25); 
l2 = new JLabel("2nd number: "); 
l2.setBounds(50,120,150,30);
res = new JLabel("Result: "); 
res.setBounds(50,170,150,30); 
t1 = new JTextField(); 
t1.setBounds(150,70,200,30); 
t2 = new JTextField(); 
t2.setBounds(150,120,200,30); 
t3 = new JTextField(); 
t3.setBounds(150,170,200,30);
b1 = new JButton("+"); 
b1.setBounds(66,230,60,25);
b2 = new JButton("-"); 
b2.setBounds(140,230,60,25); 
b3 = new JButton("*"); 
b3.setBounds(215,230,60,25); 
b4 = new JButton("/"); 
b4.setBounds(290,230,60,25); 
b5 = new JButton("Reset"); 
b5.setBounds(170,290,100,25);
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
b5.addActionListener(this);
c.add(title);
c.add(l1);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(res);
c.add(t3);
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
c.add(b5);
}
public void actionPerformed(ActionEvent ae)
{
try{
String url = "rmi://localhost:192.168.0.106/arithserver"; a = (ArithIntf)Naming.lookup(url);
}
catch(Exception e) { e.printStackTrace();
}
str = ae.getActionCommand();
if(ae.getSource() == b1)
{
n1 = Double.parseDouble(t1.getText());
n2 = Double.parseDouble(t2.getText());
try {
d1= a.add(n1,n2);
str = String.valueOf(d1); t3.setText(str);
}
catch(Exception e) { e.printStackTrace();
}
}
else if(ae.getSource() == b2)
{
n1 = Double.parseDouble(t1.getText());
n2 = Double.parseDouble(t2.getText());
try {
d1 = a.sub(n1,n2);
str = String.valueOf(d1); t3.setText(str);
}
catch(Exception e) { e.printStackTrace();
}
}
else if(ae.getSource() == b3)
{
n1 = Double.parseDouble(t1.getText());
n2 = Double.parseDouble(t2.getText());
try {
d1 = a.mul(n1,n2);
str = String.valueOf(d1); t3.setText(str);
}
catch(Exception e) { e.printStackTrace();
}
}
else if(ae.getSource() == b4)
{
n1 = Double.parseDouble(t1.getText()); n2 = Double.parseDouble(t2.getText());
try { d1 = a.div(n1,n2); str = String.valueOf(d1); t3.setText(str);
}
catch(Exception e) { e.printStackTrace();
}
}
else
{
str = ae.getActionCommand();
if(ae.getSource() == b5)
{
t1.setText(" ");
t2.setText(" "); res.setText(" ");
} }
}
public static void main(String[] args)
{
JFrame f = new ArithClient();
}
}