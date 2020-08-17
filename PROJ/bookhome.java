package hosp;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class bookhome extends Frame{
    bookhome()
    {
    setTitle("BOOK FROM HOME");
    setSize(500,500);
    setBackground(Color.LIGHT_GRAY);
    setSize(500,500);
     
    
     Label l1 = new Label("Patient ID:", Label.CENTER);
     Label l4 = new Label("Doctor ID:", Label.CENTER);
  
     TextField tf1 = new TextField();
     TextField tf4 = new TextField();
  
     Button b =new Button("BOOK");
    l1.setBounds(20,85,90,25);
    l4.setBounds(20,125,90,25);
  
    tf1.setBounds(150, 90, 140,25);
    tf4.setBounds(150, 130, 140,25);
 
    b.setBounds(100,270,200,25);
    
    
    add(l1);
    add(tf1);

    add(l4);
    add(tf4);
    
    
    
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
        String id=tf4.getText();
         
          String patid =tf1.getText();
          try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://127.0.0.1:3306/proj1";
            Connection con=DriverManager.getConnection(url,"root","Uthara@1");
             if (con!=null){
                 String query="SELECT EMAIL,DOCNAME FROM DOCTORS WHERE DOCID='"+id+"'";
                 String query1="SELECT EMAIL FROM PATIENTS WHERE PAT_ID='"+patid+"'";
                 PreparedStatement ps = con.prepareStatement(query);
                 PreparedStatement ps1 = con.prepareStatement(query1);
                 ResultSet rs=ps.executeQuery();
                 ResultSet rs1=ps1.executeQuery();
                    if(rs.next()){
                        if(rs1.next())
                        {
                       String docmail=rs.getString(1);
                       String name=rs.getString(2);
                       String mail=rs1.getString(1);
                       SendEmail send=new SendEmail(docmail,"Appointment","Your Appointment is confirmed with patient "+patid);
                       SendEmail send2= new SendEmail(mail, "Confirmation", "Your Appointment is confirmed with Dr. " +name);
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
        } );
        }   
         


public static void main(final String args[]) {
    
   new bookhome();
        
        }
    }
