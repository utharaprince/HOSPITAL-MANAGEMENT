package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class doclog extends Frame {
    doclog()
    {
    setTitle("DOCTOR's LOGIN");
    setSize(300,100);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
     Label l1 = new Label("Name:", Label.CENTER);
     Label l2 = new Label("Specialization:", Label.CENTER);
     Label l3 = new Label("Password:", Label.CENTER);
     TextField tf1 = new TextField();
     TextField tf2 = new TextField();
     TextField tf3 = new TextField();
     Button b =new Button("LOGIN");
    tf3.setEchoChar('*');
    l1.setBounds(10,45,90,25);
    l2.setBounds(10,85,90,25);
    l3.setBounds(10,125,90,25);
  
    tf1.setBounds(100, 50, 140,25);
    tf2.setBounds(100, 90, 140,25);
    tf3.setBounds(100, 130, 140,25);
    b.setBounds(200,170,140,25);

    add(l1);
    add(tf1);
    add(l2);
    add(tf2);
    add(l3);
    add(tf3);
    add(b);


    setLayout(null);
    setVisible(true);
    
   addWindowListener(new WindowAdapter() {
        public void windowClosing(final WindowEvent e) {
            System.out.println("Window closing");
            dispose();
            
            
        }
    
   });
b.addActionListener(new ActionListener(){
public void actionPerformed(java.awt.event.ActionEvent evt){  
    PreparedStatement ps;
    ResultSet rs;
    String uname = tf1.getText();
    String pass = tf3.getText();
    
    String query = "SELECT DOCID FROM DOCTORS WHERE DOCNAME='"+uname+"' AND DOCID ='"+pass+"'";
    
    try {
          Class.forName("com.mysql.jdbc.Driver");
          String url ="jdbc:mysql://127.0.0.1:3306/proj1";
          Connection con=DriverManager.getConnection(url,"root","Uthara@1");
          if(con!=null)
           {
              ps = con.prepareStatement(query);
                 
        
              rs = ps.executeQuery();
        
                 if(rs.next())
                    {  
                     new MEDdet();
                    }            
                else
                {
                    System.out.println("login failed");
                }
           }    
     else
          {
            System.out.println("Connection not found");
         }       
        }
         
        
    catch(Exception ae){
        System.out.println(ae);
    } 
}   
} );
}   
    public static void main( String args[]) {
       
        
        new doclog();
        
        }
    }
