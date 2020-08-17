package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class docreg extends Frame{
    docreg()
    {
    setTitle("REGISTER DOCTOR");
    setSize(500,500);
    setBackground(Color.LIGHT_GRAY);
    setSize(500,600);
     
    
     Label l1 = new Label("Doctor Name:", Label.CENTER);
     Label l2 = new Label("Email Id", Label.CENTER);
     Label l3 = new Label("Specialization:", Label.CENTER);
     Label l4 = new Label("Time:", Label.CENTER);
     Label l8 = new Label("Fees:",Label.CENTER);
     
    

     TextField tf2 = new TextField();
     TextField tf1 = new TextField();
     TextField tf3 = new TextField();
     TextField tf4 = new TextField();
     TextField tf8 = new TextField();
     
     Button b =new Button("SUBMIT");
   
     
  
    l2.setBounds(20,125,90,25);
    l1.setBounds(20,85,90,25);
    l3.setBounds(20,165,90,25);
    l4.setBounds(30,305,90,25);
    l8.setBounds(30,345,90,25);
    
   
    tf2.setBounds(150, 130, 140,25);
    tf1.setBounds(150, 90, 140,25);
    tf3.setBounds(150, 170, 200,100);
    tf4.setBounds(150, 300, 200,25);
    tf8.setBounds(150, 350, 200,25);
    
    b.setBounds(100,500,200,25);
    
    
    add(l2);
    add(tf2);
    add(l1);
    add(tf1);
    add(l3);
    add(tf3);
    add(l4);
    add(tf4);
    add(l8);
    add(tf8);
    
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
           
          String mail=tf2.getText();
           String name=tf1.getText();
           String spec=tf3.getText();
           String time=tf4.getText();
           String fees=tf8.getText();
         
          
          
           String query =  "INSERT INTO DOCTORS(DOCNAME,SPCIALIZATION,TIME,FEES,EMAIL) VALUES ('"+name+ "','" +spec+ "','" +time+ "','" +fees+ "','"+mail+"')";
            
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
    
   new docreg();
        
        }
    }
