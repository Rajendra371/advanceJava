import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ImageBorder{
public static void main(String[] args) {
    JFrame frame = new JFrame("image matte border Example");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 3, 10, 10 ));

    JLabel imageLabel =  new JLabel("Empty Border");
   ImageIcon icon = new ImageIcon("logo.png");
   MatteBorder imageBorder = new MatteBorder(10, 10, 10, 10, icon);
   panel.add(imageLabel);
   imageLabel.setBorder(imageBorder);
    frame.add(panel);
    frame.setVisible(true);
}
}