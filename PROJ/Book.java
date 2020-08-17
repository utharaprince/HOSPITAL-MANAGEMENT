package hosp;
import java.sql.*;



import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

public class Book extends Frame{
  public static String DOC_NAME;
  Button b;
  Label l1;
  TextField tf1;
  String username,password;
  Book(String DOC_NAME){
        Doctor.DOC_NAME = DOC_NAME;
        setBackground(Color.LIGHT_GRAY);
        setTitle("Booking");
        l1=new Label("Patient ID:",Label.CENTER);
        tf1=new TextField();
        
        b=new Button("Submit");   
        l1.setBounds(10,45,100,25);
     
        tf1.setBounds(120,45,60,25);
      b.setBounds(85,150,80,30);   
      b.setBackground(Color.BLACK);
      b.setForeground(Color.WHITE); 
        add(l1);
        add(tf1);
        
        add(b);   
        setSize(400,400);   
        setLayout(null);   
        setVisible(true);   
        addWindowListener(new WindowAdapter(){       
      public void windowClosing(WindowEvent e) {        
        System.out.println("Window Closing");         
        dispose();       } 
          });  


          b.addActionListener(new ActionListener(){
          public void actionPerformed(java.awt.event.ActionEvent evt){  
              String id=tf1.getText();
             
                try {
                  Class.forName("com.mysql.jdbc.Driver");
                  String url ="jdbc:mysql://127.0.0.1:3306/proj1";
                  Connection con=DriverManager.getConnection(url,"root","Uthara@1");
                   if (con!=null){
                       String query="SELECT EMAIL FROM PATIENTS WHERE PAT_ID='"+id+"'";
                      String query1="SELECT DOCNAME FROM DOCTORS WHERE DOCNAME='"+DOC_NAME+"'";
                       PreparedStatement ps = con.prepareStatement(query);
                       PreparedStatement ps1= con.prepareStatement(query1);
                       ResultSet rs=ps.executeQuery();
                       ResultSet rs1=ps1.executeQuery();
                          if(rs.next()){
                             String mail=rs.getString(1);
                               if(rs1.next())
                               {
                             String name=rs1.getString(1);
                               
                             SendEmail send= new SendEmail(mail, "Confirmation", "Your Appointment is confirmed with Dr."+name);
                             dispose();
                            }

                        }
                          else{
                              System.out.println("Not found");
                          } 
                       }
                   
                   else{
                      System.out.println("Connection not found");
                   }
      
      
                }
                catch(Exception ae)
                {
                  System.out.println(ae);
                }
                   
              }    

          
        });
    }

     public static void main(String[] args) {
         new Book(DOC_NAME);
     }
}package hosp;
import java.sql.*;



import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

public class Book extends Frame{
  public static String DOC_NAME;
  Button b;
  Label l1;
  TextField tf1;
  String username,password;
  Book(String DOC_NAME){
        Doctor.DOC_NAME = DOC_NAME;
        setBackground(Color.LIGHT_GRAY);
        setTitle("Booking");
        l1=new Label("Patient ID:",Label.CENTER);
        tf1=new TextField();
        
        b=new Button("Submit");   
        l1.setBounds(10,45,100,25);
     
        tf1.setBounds(120,45,60,25);
      b.setBounds(85,150,80,30);   
      b.setBackground(Color.BLACK);
      b.setForeground(Color.WHITE); 
        add(l1);
        add(tf1);
        
        add(b);   
        setSize(400,400);   
        setLayout(null);   
        setVisible(true);   
        addWindowListener(new WindowAdapter(){       
      public void windowClosing(WindowEvent e) {        
        System.out.println("Window Closing");         
        dispose();       } 
          });  


          b.addActionListener(new ActionListener(){
          public void actionPerformed(java.awt.event.ActionEvent evt){  
              String id=tf1.getText();
             
                try {
                  Class.forName("com.mysql.jdbc.Driver");
                  String url ="jdbc:mysql://127.0.0.1:3306/proj1";
                  Connection con=DriverManager.getConnection(url,"root","Uthara@1");
                   if (con!=null){
                       String query="SELECT EMAIL FROM PATIENTS WHERE PAT_ID='"+id+"'";
                      String query1="SELECT DOCNAME FROM DOCTORS WHERE DOCNAME='"+DOC_NAME+"'";
                       PreparedStatement ps = con.prepareStatement(query);
                       PreparedStatement ps1= con.prepareStatement(query1);
                       ResultSet rs=ps.executeQuery();
                       ResultSet rs1=ps1.executeQuery();
                          if(rs.next()){
                             String mail=rs.getString(1);
                               if(rs1.next())
                               {
                             String name=rs1.getString(1);
                               
                             SendEmail send= new SendEmail(mail, "Confirmation", "Your Appointment is confirmed with Dr."+name);
                             dispose();
                            }

                        }
                          else{
                              System.out.println("Not found");
                          } 
                       }
                   
                   else{
                      System.out.println("Connection not found");
                   }
      
      
                }
                catch(Exception ae)
                {
                  System.out.println(ae);
                }
                   
              }    

          
        });
    }

     public static void main(String[] args) {
         new Book(DOC_NAME);
     }
}package hosp;
import java.sql.*;



import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

public class Book extends Frame{
  public static String DOC_NAME;
  Button b;
  Label l1;
  TextField tf1;
  String username,password;
  Book(String DOC_NAME){
        Doctor.DOC_NAME = DOC_NAME;
        setBackground(Color.LIGHT_GRAY);
        setTitle("Booking");
        l1=new Label("Patient ID:",Label.CENTER);
        tf1=new TextField();
        
        b=new Button("Submit");   
        l1.setBounds(10,45,100,25);
     
        tf1.setBounds(120,45,60,25);
      b.setBounds(85,150,80,30);   
      b.setBackground(Color.BLACK);
      b.setForeground(Color.WHITE); 
        add(l1);
        add(tf1);
        
        add(b);   
        setSize(400,400);   
        setLayout(null);   
        setVisible(true);   
        addWindowListener(new WindowAdapter(){       
      public void windowClosing(WindowEvent e) {        
        System.out.println("Window Closing");         
        dispose();       } 
          });  


          b.addActionListener(new ActionListener(){
          public void actionPerformed(java.awt.event.ActionEvent evt){  
              String id=tf1.getText();
             
                try {
                  Class.forName("com.mysql.jdbc.Driver");
                  String url ="jdbc:mysql://127.0.0.1:3306/proj1";
                  Connection con=DriverManager.getConnection(url,"root","Uthara@1");
                   if (con!=null){
                       String query="SELECT EMAIL FROM PATIENTS WHERE PAT_ID='"+id+"'";
                      String query1="SELECT DOCNAME FROM DOCTORS WHERE DOCNAME='"+DOC_NAME+"'";
                       PreparedStatement ps = con.prepareStatement(query);
                       PreparedStatement ps1= con.prepareStatement(query1);
                       ResultSet rs=ps.executeQuery();
                       ResultSet rs1=ps1.executeQuery();
                          if(rs.next()){
                             String mail=rs.getString(1);
                               if(rs1.next())
                               {
                             String name=rs1.getString(1);
                               
                             SendEmail send= new SendEmail(mail, "Confirmation", "Your Appointment is confirmed with Dr."+name);
                             dispose();
                            }

                        }
                          else{
                              System.out.println("Not found");
                          } 
                       }
                   
                   else{
                      System.out.println("Connection not found");
                   }
      
      
                }
                catch(Exception ae)
                {
                  System.out.println(ae);
                }
                   
              }    

          
        });
    }

     public static void main(String[] args) {
         new Book(DOC_NAME);
     }
}
