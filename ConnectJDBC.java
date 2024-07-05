import java.sql.*;

class ConnectJDBC{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/advance_java";
            String username= "root";
            String password="";
            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("connection successfull...");
            }
        }
        catch(Exception e){ 
            
           e.printStackTrace();
        }
    }

}