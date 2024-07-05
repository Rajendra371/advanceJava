import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo extends JFrame
{
Button b1, b2,b3,b4,b5;

    
    public BorderLayoutDemo()
    {
       
        setSize(500,250);
        setTitle("BorderLayout Demo");
         setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());

        b1=new Button("Botton1");
        b2=new Button("Botton2");
        b3=new Button("Botton3");
        b4=new Button("Botton4");
        b5=new Button("Botton5");
       

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
      
        b1.setBackground(Color.gray);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.cyan);
        b4.setBackground(Color.orange);
        b5.setBackground(Color.MAGENTA);

        setVisible(true);
    }
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();

       
         
        
        
    }

}