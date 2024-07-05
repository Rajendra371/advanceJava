import java.awt.*;
import javax.swing.*;


//custom JPanel demo
public class TwoDObject extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //custom drwaing code 

        g.setColor(Color.BLUE);
        g.fillRect(50,50,100,100);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("custom JPanel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

    TwoDObject td = new TwoDObject();
    frame.add(td);
    frame.setVisible(true);
    }
}