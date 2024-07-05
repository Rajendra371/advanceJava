import javax.swing.*;
public class HelloFrame extends JFrame
{
	JLabel l;
	JTextField t;
	JButton b;
	HelloFrame(){
	setSize(600,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("GUI Test");
	setLayout(null);
	l=new JLabel("Your Name");
	t=new JTextField(30);
	b=new JButton("Save");
	l.setBounds(150,100,200,30);
	add(l);
	t.setBounds(275,100,200,30);
	add(t);
	b.setBounds(275,200,100,40);
	add(b);
	setVisible(true);
	
}
public static void main(String args[])
{
	HelloFrame hf=new HelloFrame();
}
}