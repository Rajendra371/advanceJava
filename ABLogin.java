// import java.awt.*;
// import java.awt.event.*;
// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import javax.swing.*;


// abstract  class ABLogin implements ActionListener{
//     JTextField tf1;
//     JPasswordField tf2;
//     JLabel l1, l2, l3;
//     JButton b1;
//     JDialog d;
//     Connection con = null;
//     Statement stmt = null;

//     public ABLogin() throws  ClassNotFoundException, SQLException{


//         d= new JDialog();
//         d.setTitle("Login");
//         d.setSize(400,250);
//         d.setLayout(null);
//         d.setModal(true);
//         d.setLocation(200, 100);

//         d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         con=DriverManager.getConnection("jdbc:mysql://localhost/Abook","root","arjun");

//         stmt=con.createStatement();

//         Font f1 = new Font("Lucida HandWriting", Font.ITALIC,18);

//         l3= new JLabel("Arjun's Address Book");
//         l3.setBounds(100, 10, 300, 25);
//         l3.setFont(f1);

//         d.add(l3);

//         l1= new JLabel("User Name");
//         l1.setBounds(50, 70, 100, 25);
//         d.add(l1);

//         tf1= new JTextField();
//         tf1.setBounds(160, 70, 100, 25);
//         d.add(tf1);

//         l2= new JLabel("Password");
//         l2.setBounds(50, 100, 100, 25);
//         d.add(l2);

//         tf2= new JPasswordField();
//         tf2.setBounds(160, 140, 100, 25);
//         d.add(tf2);

//         b1=new JButton("Login");
//         b1.setBounds(150,140,100,25);
//         d.add(b1);
//         b1.addActionListener(this);
//         d.setVisible(true);






//     }
//     public void addActionListener(ActionEvent ae)
//     {
//         String s1 = tf1.getText();
//         String s2 = tf2.getText();
//         if(ae.getActionCommand()=="Login")
//         {
//             try {
//                 ResultSet rs = stmt.executeQuery("Select * from login");
//                 while(rs.next())
//                 {
//                     String s3 = rs.getString(1);
//                     String s4 = rs.getString(2);
//                     if(s3.equals(s1) && s4.equals(s2)){
//                         d.hide();
//                     }
//                 }
//                 tf1.setText("");
//                 tf2.setText("");
//                 tf1.requestFocus();
//             } catch (SQLException se) {
//                 System.out.println(se);
//             }
//         }
//     }
    

// }