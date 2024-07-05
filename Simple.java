import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class Simple extends JFrame implements ActionListener
{
    JLabel l1, l2, l3,l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    public Simple(){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new FlowLayout(FlowLayout.CENTER,50,10));


        l1 = new JLabel("Principle");
        l2= new JLabel("Time");
        l3= new JLabel("Rate");
        l4= new JLabel("Result");


        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);

        b1=new  JButton("Simple Intrest");
        b2= new JButton("Amount");
        b3 = new JButton("Clear");

       

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener( this);
        b3.addActionListener(this);

        


    }

       public void actionPerformed(ActionEvent ax)
       {
        float p, t, r, re, a;
        p=float.parseFloat(t1.getText());
        t=float.parseFloat(t2.getText());
        r=float.parseFloat(t3.getText());


        if(ax.getSource()==b1)
        {
            re=(p*t*r)/100;
            t4.getText(String.valueOf(re));
        }
        else if(ax.getSource()==b2){
            re = p+(p*t*r)/100;
            t4.getText(String.valueOf(re));
        }
        else{
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
          



            
    }
        public static void main(String[] args) {
            new Simple();
        }
        

}