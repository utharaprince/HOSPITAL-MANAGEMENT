
package hosp;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Recplogin extends Frame{
Button b;
Label l1,l2;
TextField tf1,tf2;
String password;
int id;
Recplogin(){
setBackground(Color.LIGHT_GRAY);
setTitle("Login");
l1=new Label("Userid:",Label.CENTER);
l2=new Label("Password:",Label.CENTER);
tf1=new TextField();
tf2=new TextField();
tf2.setEchoChar('*');
b=new Button("Submit");
l1.setBounds(10,45,90,25);
l2.setBounds(10,85,90,25);
tf1.setBounds(100,50,140,25);
tf2.setBounds(100,90,140,25);
b.setBounds(85,140,80,30);
b.setBackground(Color.BLACK);
b.setForeground(Color.WHITE);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e) {
System.out.println("Window Closing");
dispose(); }
});


b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
id = tf1.getX();
password = tf2.getText();

String sql ="SELECT Password FROM register WHERE RegisterID='"+username+"' AND Password ='"+password+"'";

try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proj1","root","Uthara@1");
//here Hospital is database name, root is username
if(con!=null){
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
if(rs.next())
{



System.out.println("Login Successfull!");
register reg =new register();
}
else{
System.out.println("Login Failed!");
}stmt.close();
con.close();
}

else{
System.out.println("Unable to get connection!");

}

}catch(Exception ex){ System.out.println(ex);
}
}
});

}

public static void main(String args[]){
new Recplogin();
}
}