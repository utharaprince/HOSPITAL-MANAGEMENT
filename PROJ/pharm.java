package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class pharm extends Frame{
    pharm()
    {
    setTitle("PHARMACY");
    setSize(500,500);
    setBackground(Color.LIGHT_GRAY);
    setSize(500,500);
     Label l1=new Label();
     Label l3=new Label();
   
  
     Label l2 = new Label("Patient Id", Label.CENTER);
     TextField tf2 = new TextField();
     Button b =new Button("SUBMIT");
     l2.setBounds(20,165,90,25);
     tf2.setBounds(150, 170, 140,25);
     l1.setBounds(20, 250, 90, 25);
     l3.setBounds(20, 270, 90, 25);
    b.setBounds(100,210,200,25);
    
   
    add(l3);
    add(l2);
    add(tf2);
    add(l1);
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
           
         
          
           String id=tf2.getText();
           ResultSet rs,rs1;
         
          
          
           String query =  "SELECT MEDICINE FROM MEDICINES WHERE MEDID='"+id+"'";
           String query1 =  "SELECT PAT_NAME FROM PATIENTS WHERE PAT_ID='"+id+"'";
            try {
                  Class.forName("com.mysql.jdbc.Driver");
                  String url ="jdbc:mysql://127.0.0.1:3306/proj1";
                  Connection con=DriverManager.getConnection(url,"root","Uthara@1");
                  if(con!=null)
                   {
                    PreparedStatement ps = con.prepareStatement(query);
                    PreparedStatement ps1 = con.prepareStatement(query1);
        
                    rs = ps.executeQuery();
                    rs1 = ps1.executeQuery();
                       if(rs.next())
                        if(rs1.next())
                        {
                          {
                            l1.setText("Name:"+rs1.getString(1));  
                             l3.setText(rs.getString(1));
                           
                          }   
                        }         
                      else
                      {
                          System.out.println("Enter correct id");
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
    
   new pharm();
        
        }
    }
