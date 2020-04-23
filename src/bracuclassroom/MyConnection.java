package bracuclassroom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection {
 public static void main(String[] args) {

     
    MyConnection db= new MyConnection();
    db.getConnection();
    
}
public static Connection  getConnection() {
  Connection conn = null;
    try{
Class.forName("com.mysql.cj.jdbc.Driver");  
        //Connection DriverManager = null;
 conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
//System.out.println("Successss");
    }catch(ClassNotFoundException ex){
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
    }catch(SQLException ex){
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
    }
    return conn;
}



}