import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Student extends JFrame
{
Student()
{
Container c = getContentPane(); setVisible(true); setSize(400,500);
c.setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setTitle("Registration Form");
JLabel title = new JLabel("Student Registration Form"); title.setBounds(100,20,400,30);
JLabel name = new JLabel("Name: "); name.setBounds(50,70,100,25);
JLabel gender = new JLabel("Gender: "); gender.setBounds(50,110,150,30);
JLabel addr = new JLabel("Address: "); addr.setBounds(50,150,150,30);
JLabel course = new JLabel("Course: "); course.setBounds(50,250,150,30);
JTextField t1 = new JTextField(); t1.setBounds(150,70,200,30);
JTextArea t2 = new JTextArea(); t2.setBounds(150,150,200,80);
JComboBox jb_course = new JComboBox(); jb_course.addItem("--Select Course--"); jb_course.addItem("Java"); jb_course.addItem("Python"); jb_course.addItem("SQL"); jb_course.addItem("CSS"); jb_course.setBounds(150,250,200,30);
JRadioButton rb1 = new JRadioButton("Male");
JRadioButton rb2 = new JRadioButton("Female");
rb1.setBounds(150,110,75,30); rb2.setBounds(220,110,80,30);
ButtonGroup bg = new ButtonGroup(); bg.add(rb1); bg.add(rb2);
JButton b1 = new JButton("Register"); b1.setBounds(120,330,90,25);
JButton b2 = new JButton("Reset"); b2.setBounds(230,330,100,25);
c.add(title);
c.add(name);
c.add(t1);
c.add(gender);
c.add(rb1);
c.add(rb2);
c.add(addr);
c.add(t2);
c.add(course);
c.add(jb_course);
c.add(b1);
c.add(b2);
}
public static void main(String[] args)
{
new Student();
} }
