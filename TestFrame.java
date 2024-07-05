import javax.swing.*;
import java.awt.*;
class TestFrame{
public static void main(String args[]){

JFrame frame=new JFrame();
frame.setVisible(true);
frame.setLocation(200,200);
frame.setSize(700,500);
frame.setTitle("USER REGISTRATION");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//ImageIcon icon=new ImageIcon("Drawing.png");
//frame.setIconImage(icon.getImage());
Container c=frame.getContentPane();
c.setBackground(Color.MAGENTA);
frame.setResizable(false);


}
}