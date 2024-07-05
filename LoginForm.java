import javax.swing.*;

public class LoginForm extends JFrame{
    
    JLabel l1, l2,l3;
    JButton b1, b2,b3;
    JTextField t1, t2,t3;

    public LoginForm()  {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("LoginForm");
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        //setLayout(new BorderLayout(0, 0));

        l1= new JLabel("First Number");
        l2= new JLabel("Second Number");
        l3= new JLabel("Result");

        add(l1);
        add(l2);
        add(l3);

        t1=new JTextField(50);
        t2= new JTextField(50);
        t3=new JTextField(50);

        add(t1);
        add(t2);
        add(t3);
       

        b1= new JButton("Add");
        b2= new JButton("Sub");
        b3= new JButton("Mul");
        
       
        l1.setBounds(100, 50, 200, 30);
        l2.setBounds(100, 100, 200, 30);
        l3.setBounds(100, 150, 200, 30);
        

        t1.setBounds(250, 50, 200, 30);
        t2.setBounds(250, 100, 200, 30);
        t3.setBounds(250, 150, 200, 30);



        b1.setBounds(250, 200, 80, 50);
        b2.setBounds(400, 200, 80, 50);
        b3.setBounds(550, 200, 80, 50);

         add(b1);
         add(b2);
         add(b3);

        
    }
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
    }


    


}