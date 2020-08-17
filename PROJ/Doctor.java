package hosp;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Doctor extends Frame {
    public static String DOC_NAME;
    Label l,l1,l2,l3,l4,l5;
    Button b3;
    Doctor(String DOC_NAME){
      
        Doctor.DOC_NAME = DOC_NAME;
        setBackground(Color.LIGHT_GRAY);
        setTitle("Doctors");
       
        l=new Label();
        l1=new Label();
        l2=new Label();
        l3=new Label();
        l4=new Label();
        l5=new Label();
        b3=new Button("Book OP");
      
        l.setBounds(30,40,150,45);
        l1.setBounds(30, 80, 300, 50);
        l2.setBounds(30, 110,300, 50);
        l3.setBounds(30, 140, 300, 50);
        l4.setBounds(30, 170, 300, 50);
        l5.setBounds(30, 200, 300, 50);
        
        b3.setBounds(50,300,90,25);
       
       
        b3.setForeground(Color.WHITE);
        
       
       
        b3.setBackground(Color.BLACK);
       
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(b3);
       
         addWindowListener(new WindowAdapter(){       
            public void windowClosing(WindowEvent e) {        
              System.out.println("Window Closing!");         
              dispose();    }   
            });  
            

            String sql="SELECT * FROM DOCTORS WHERE DOCNAME='"+DOC_NAME+"'"; //for getting doctor list in each department
            try{

              Class.forName("com.mysql.jdbc.Driver");  
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proj1","root","Uthara@1");  
              
              if(con!=null){
               Statement stmt=con.createStatement();  
               ResultSet rs=stmt.executeQuery(sql);
               while(rs.next()){
                 int id=rs.getInt("DOCID");
                 String Name=rs.getString("DOCNAME");
                 String Specl=rs.getString("SPCIALIZATION");
                 String time=rs.getString("TIME");
                 String fee=rs.getString("FEES");
                 int deptid=rs.getInt("DEPTID");
               
               
               l.setText("Doctor id: "+id);
               l1.setText("Name: "+Name);
               l2.setText("Specialization: "+Specl);
               l3.setText("Time: "+time);
               l4.setText("Consulting Fees: "+fee);
               l5.setText("Department id: "+deptid);
               }


               stmt.close();
               con.close();
              }
              else{
                  System.out.println("Unable to get connection!");
              }
                
               }catch(Exception ex){ System.out.println(ex); 
               }
               b3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   new Book(DOC_NAME);
                }
              });
          

        setSize(270,350);   
        setLayout(null);   
        setVisible(true);   
    }
      public static void main(String args[]){
        
          new Doctor(DOC_NAME);
      }
        
}
