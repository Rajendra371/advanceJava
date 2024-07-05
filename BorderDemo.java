import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderDemo{
public static void main(String[] args) {
    JFrame frame = new JFrame("Border Example");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 3, 10, 10 ));

    JLabel emptyLabel =  new JLabel("Empty Border");
    emptyLabel.setBorder(new EmptyBorder(10, 100, 10, 10));
    panel.add(emptyLabel);
    frame.add(panel);
    frame.setVisible(true);
}
}