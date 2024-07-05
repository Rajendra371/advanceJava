import java.awt.GridLayout;
import javax.swing.*;


class GridLayoutDemo extends JFrame
{
    JButton b1, b2,b3,b4,b5;

    GridLayoutDemo() 
    
     {
        setSize(100,150);
        setTitle("Flowlatout demo");
        setLayout(new GridLayout(2,3));

        b1=new JButton("Button1");
        b2=new JButton(" This is long Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
         }