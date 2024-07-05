import java.awt.*;
import javax.swing.*;

public class LayoutManagerDemo extends JFrame
{
    

    public LayoutManagerDemo() {
        JLabel l1, l2,l3;
        JTextField t1, t2;
        JButton b1, b2;

        setSize(400,250);
        setTitle("BorderLayout Demo");
         setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        setLayout(new BorderLayout(0,0));

        l1= new JLabel("User Login");
        l2= new JLabel("User_ID");
        l3= new JLabel("Password");

        add(l1,BorderLayout.NORTH);
        add(l2,BorderLayout.CENTER);
        add(l3,BorderLayout.CENTER);

        t1=new JTextField();
        t2=new JTextField();

        add(t1,BorderLayout.EAST);
        add(t2,BorderLayout.EAST);

        b1= new JButton("Ok");
        b2= new JButton("Cancel");
        add(b1,BorderLayout.SOUTH);
        add(b2,BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        LayoutManagerDemo lmd= new LayoutManagerDemo();
    
    }


}