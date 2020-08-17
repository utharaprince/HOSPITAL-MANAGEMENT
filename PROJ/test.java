package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class test extends Frame{
    test()
    {
    setTitle("TEST");
    setSize(300,300);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
    Label l3 = new Label("PATIENT ID:", Label.CENTER);
     Label l1 = new Label("Test:", Label.CENTER);
     Label l2 = new Label("Amount:", Label.CENTER);

     Button b=new Button("Submit");
     TextField tf3= new TextField();
     TextField tf1 = new TextField();
     TextField tf2 = new TextField();
   
     b.setBackground(Color.BLACK);
     b.setForeground(Color.WHITE);

    l3.setBounds(10,45,90,25);
    l1.setBounds(10,85,90,25);
    l2.setBounds(10,125,90,25);
    tf3.setBounds(200, 50, 140,25);
    tf1.setBounds(200, 90, 140,25);
    tf2.setBounds(200, 120, 140,25);
    
    b.setBounds(150,200,90,25);
    add(l3);
    add(tf3);
    add(l1);
    add(tf1);
    add(l2);
    add(tf2);
  
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
           
           String testid=tf3.getText();
           String med=tf1.getText();
        
           String query =  "INSERT INTO TESTS (TESTID , TEST) VALUES ('" +testid+"' , '"+med+"')";
            
            try {
                  Class.forName("com.mysql.jdbc.Driver");
                  String url ="jdbc:mysql://127.0.0.1:3306/proj1";
                  Connection con=DriverManager.getConnection(url,"root","Uthara@1");
                  if(con!=null)
                   {
                      PreparedStatement ps = con.prepareStatement(query);
                         
                
                   int x=   ps.executeUpdate();
                
                         if(x>0)
                            {  System.out.println("insert success");
                                dispose();
                             
                            }            
                        else
                        {
                            System.out.println("insert failed");
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


public static void main(final String args[]) {
        new test();
        
        }
    }