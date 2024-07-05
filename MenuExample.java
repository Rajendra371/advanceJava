import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuExample extends Frame
{
   
    
    TextArea tx;
    public MenuExample(){
        MenuBar mnb= new MenuBar();
        setMenuBar(mnb);

        Menu files = new Menu("Files");
        Menu date = new Menu("Data");
        Menu exit= new Menu("Exit");
        Menu contact= new Menu("Contact");

        tx= new TextArea(10, 40);
        tx.setBackground(Color.cyan);
        add(tx);


        mnb.add(files);
        mnb.add(date);
        mnb.add(exit);
        mnb.add(contact);

        Menu mnew= new Menu("New");
        files.add(mnew);
        MenuItem save = new MenuItem("Save");
        files.add(save);
        MenuItem open= new MenuItem("Open");
        files.add(open);

        files.addSeparator();

        MenuItem print= new MenuItem("Print");
        files.add(print);

        CheckboxMenuItem tb = new CheckboxMenuItem("ToolBar");
        files.add(tb);
        date.add(new MenuItem("Today"));
        exit.add(new MenuItem("Close"));
        setSize(500,300);
        setVisible(true);

        // add window litsner to handle window closing evwnt

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose(); // close the window
                System.exit(0); // exit the application
            }

        });
        
    


    }
    public static void main(String[] args) {
        new MenuExample();
    }
}