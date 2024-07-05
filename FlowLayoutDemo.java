import java.awt.FlowLayout;
import javax.swing.*;


class FlowLayoutDemo extends JFrame
{
    JButton b1, b2,b3,b4,b5;

    FlowLayoutDemo() 
    
     {
        setSize(100,150);
        setTitle("flolatout demo");
        setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        setLayout(new FlowLayout(FlowLayout.LEFT));

         b1=new JButton("Botton1");
        b2=new JButton("Botton2");
        b3=new JButton("Botton3");
        b4=new JButton("Botton4");
        b5=new JButton("Botton5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
    public static void main(String[] args) {
       FlowLayoutDemo fld =new FlowLayoutDemo();
    }

    
}