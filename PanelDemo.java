import java.awt.*;
import javax.swing.*;
class PanelDemo extends JFrame
{
    public static void main(String args[]){
        JFrame frame= new JFrame("JPanel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
       

// create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
       // panel.setLayout(new BorderLayout);


// add some bottons to the JPanel

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        //border
        panel.setLayout(new BorderLayout());


// add the JPanel to the JFrame
        frame.add(panel);
// make the frame visible
        frame.setVisible(true);

        // border with 10 px and color after that drow a circle

        

    }
}
