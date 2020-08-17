package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Symp extends Frame{
    Symp()
    {
    setTitle("SYMPTOMS");
    setSize(500,500);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
    Label l1=new Label("Patients id");
    Label l=new Label("Symptoms");
    TextField tf1=new TextField();
    TextField tf=new TextField();
    Button b=new Button("Submit");
    l1.setBounds(10, 60, 90, 25);
    l.setBounds(10, 130, 90, 25);
    tf1.setBounds(10, 100, 90,25);
    tf.setBounds(10, 160, 200, 200);
    b.setBounds(10, 400, 90, 25);
    b.setBackground(Color.BLACK);
    b.setForeground(Color.WHITE);
    add(l1);
    add(tf1);
    add(l);
    add(tf);
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
           
           String symps=tf.getText();
           String patid=tf1.getText();
        
           String query =  "INSERT INTO SYMPTOMS (SYMPTOM , PATID) VALUES ('" +symps+"' , '"+patid+"')";
            
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
        new Symp();
        
        }
    }
