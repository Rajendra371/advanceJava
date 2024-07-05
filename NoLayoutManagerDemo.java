import javax.swing.*;

 class NoLayoutManagerDemo extends JFrame
{
public static void main(String[] args) {
    JFrame frame = new JFrame("No Layout Manage Example1");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    frame.setLayout(null);

    JButton button= new JButton("Button1");
    button.setBounds(50, 50, 100, 30);
    frame.add(button);

    JButton button1= new JButton("Button2");
    button1.setBounds(200, 50, 100, 30);
    frame.add(button1);

    frame.setVisible(true);
}
}
