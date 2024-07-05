import java.awt.*;
import javax.swing.*;

public class DialogBoxDemo extends JFrame
{
    JLabel l;
    JTextField f;
    JDialog d;
    JButton b;
     DialogBoxDemo(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Pareant Frame");
        
        l=new JLabel("Email");
        f=new JTextField(15);
        d=new JDialog(this,"DialogBox Example");
        b= new JButton("Submit");

        b.setSize(10, 10);
        d.setLayout(new FlowLayout(FlowLayout.CENTER));
        d.setSize(300,200);
        d.setLocation(50, 50);

        d.add(l);
        d.add(f);
        d.add(b);
        setVisible(true);
        d.setVisible(true);
      

        //


     }
     public static void main(String[] args) {
         new DialogBoxDemo();
     }
}