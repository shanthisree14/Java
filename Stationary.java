import javax. swing. *;
import javax.swing.event.*;
import java.awt. *;
class MyFrame extends JFrame implements ListSelectionListener
{
JLabel title, price;
JList<String> lst = new JList<>();
Container c;
String[] items = {"Books","Pen","Pencil","Eraser","Sharpener"}; int[] lprice = {35,10,5,2,6};
MyFrame()
{
c = this.getContentPane();
c.setLayout(null);
c.setBackground(Color.pink); title = new JLabel("Stationary items"); title.setBounds(100,5,400,30);
c.add(title); lst = new JList<String> (items); lst.setBounds(145,35,100,130);
c.add(lst); price = new JLabel(" "); price.setBounds(150,180,400,20);
c.add(price);
lst.addListSelectionListener(this); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void valueChanged(ListSelectionEvent e)
{
if(lst.getSelectedIndex()==-1)
{
price.setText("No items selected");
}
else
{
int indx = lst.getSelectedIndex(); price.setText("Price: "+ lprice[indx]);
}}}
class Stationary{
public static void main(String args[])
{
MyFrame f= new MyFrame();
f.setVisible(true);
f.setSize(400,400);
f.setTitle("Stationary items list");
}}
