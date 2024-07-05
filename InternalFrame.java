import java.awt.*;
import javax.swing.*;

public class InternalFrame extends JFrame
{
    JDesktopPane dp;
    JInternalFrame iframe;
    JTextField tb;
    JLabel l;

    public InternalFrame() {
        setSize(400, 300);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        dp=new JDesktopPane();
        iframe= new JInternalFrame("Internal Frame");
        iframe.setSize(200,200);
        iframe.setLocation(50, 50);
        dp.add(iframe);
        add(dp);
        l=new JLabel("Email");
        tb=new JTextField(10);
        iframe.setLayout(new FlowLayout(FlowLayout.CENTER));
        iframe.add(l);
        iframe.add(tb);
        iframe.setVisible(true);

        



    }
    public static void main(String[] args) {
        new InternalFrame();
    }

    
}