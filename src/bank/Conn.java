package bank;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bankmanagementsystem";
            String username="root";
	    String password="root";
            c=DriverManager.getConnection(url,username,password);
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
