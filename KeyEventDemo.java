import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

 class KeyEventDemo extends JFrame implements KeyListener
{
    private JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1;

    public KeyEventDemo(){
        super("Handling Key Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("Firs Value");
        l2=new JLabel("Second Value");
        l3=new JLabel("Result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        b1= new JButton("Calculate");
        b1.addKeyListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        setSize(400,300);
        setVisible(true);

    }
    public void KeyPresses(KeyEvent ke){
        int x, y, z = 0;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());

        if(ke.getKeyChar()=='a')
        x = x + y;
        else if(ke.getKeyChar()=='s')
        z = x - y;
        else{
            t3.setText("Press a or s");
            return;
        }
        t3.setText(String.valueOf(z));
    
    }
    public void KeyType(KeyEvent ke){}
    public void keyReleased(KeyEvent ke){}
    public static void main(String[] args) {
        new KeyEventDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}