package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Details extends Frame{
    Details()
    {
    setTitle("DETAILS OF PATIENTS");
    setSize(500,500);
    setBackground(Color.LIGHT_GRAY);
    setSize(500,600);
     
     Label l1 = new Label("Name:", Label.CENTER);
     Label l2 = new Label("Age:", Label.CENTER);
     Label l3 = new Label("Address:", Label.CENTER);
     Label l7 = new Label("Email:", Label.CENTER);
     Label l4 = new Label("Sex:", Label.CENTER);
     Label l5 = new Label("Phone no.:", Label.CENTER);
     Label l6= new Label("Blood group:", Label.CENTER);
     Label l8 =new Label("Password:",Label.CENTER);
    
     TextField tf1 = new TextField();
     TextField tf2 = new TextField();
     TextField tf3 = new TextField();
     TextField tf7= new TextField();
     TextField tf4 = new TextField();
     TextField tf5= new TextField();
     TextField tf6= new TextField();
     TextField tf8=new TextField();
     Button b =new Button("SUBMIT");
   
     
    l1.setBounds(20,85,90,25);
    l2.setBounds(20,125,90,25);
    l3.setBounds(20,165,90,25);
    l7.setBounds(30,305,90,25);
    l4.setBounds(30,345,90,25);
    l5.setBounds(30,385,90,25);
    l6.setBounds(30,425,90,25);
    l8.setBounds(30,465,90,25);;
    tf1.setBounds(150, 90, 140,25);
    tf2.setBounds(150, 130, 140,25);
    tf3.setBounds(150, 170, 200,100);
    tf7.setBounds(150, 300, 200,25);
    tf4.setBounds(150, 350, 200,25);
    tf5.setBounds(150,400,200,25);
    tf6.setBounds(150,450,200,25);
    tf8.setBounds(150,500,200,25);
    b.setBounds(100,550,200,25);
    
    add(l1);
    add(tf1);
    add(l2);
    add(tf2);
    add(l3);
    add(tf3);
    add(l7);
    add(tf7);
    add(l4);
    add(tf4);
    add(l5);
    add(tf5);
    add(l6);
    add(tf6);
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
           
           String pname=tf1.getText();
           String age=tf2.getText();
           String address=tf3.getText();
           String sex=tf4.getText();
           String phno=tf5.getText();
           String bld=tf6.getText();
           String email=tf7.getText();
           String pass=tf8.getText();
         
           String query =  "INSERT INTO PATIENTS(PAT_NAME,SEX,ADDRESS,BLOOD_GROUP,PHONENUMBER,AGE,EMAIL,PASSWORD) VALUES ('" +pname+"','" + sex+ "','" + address+ "','" +bld+ "','" +phno+ "' , '"+age+"','"+email+"','"+pass+"')";
            
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
    
   new Details();
        
        }
    }
