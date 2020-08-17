package hosp;   
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Dept extends Frame implements ActionListener{
    Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    Dept(){
        setBackground(Color.LIGHT_GRAY);
        setTitle("Department");
        l=new Label("DEPARTMENTS",Label.RIGHT);
        l1=new Label("Casuality",Label.CENTER);
        l2=new Label("Cardiology",Label.CENTER);
        l3=new Label("Intensive care",Label.CENTER);
        l4=new Label("Neurology",Label.CENTER);
        l5=new Label("Oncology",Label.CENTER);
        l6=new Label("Gynaecology",Label.CENTER);
        l7=new Label("Dentistry",Label.CENTER);
        l8=new Label("Dermatology",Label.CENTER);
        l9=new Label("Radiology",Label.CENTER);
        l10=new Label("Surgery",Label.CENTER);
        l11=new Label("Ophthalmology",Label.CENTER);
        l12=new Label("Orthopaedics",Label.CENTER);
        l13=new Label("Renal",Label.CENTER);
        l14=new Label("Peadiatrics",Label.CENTER);



        b1=new Button("View");
        b2=new Button("View");
        b3=new Button("View");
        b4=new Button("View");
        b5=new Button("View");
        b6=new Button("View");
        b7=new Button("View");
        b8=new Button("View");
        b9=new Button("View");
        b10=new Button("View");
        b11=new Button("View");
        b12=new Button("View");
        b13=new Button("View");
        b14=new Button("View");

        l.setBounds(40,40,120,35);
        l1.setBounds(20, 90, 100, 25);
        l2.setBounds(20, 120, 100, 25);
        l3.setBounds(20, 150, 100, 25);
        l4.setBounds(20, 180, 100, 25);
        l5.setBounds(20, 210, 100, 25);
        l6.setBounds(20, 240, 100, 25);
        l7.setBounds(20, 270, 100, 25);
        l8.setBounds(20, 300, 100, 25);
        l9.setBounds(20, 330, 100, 25);
        l10.setBounds(20, 360, 100, 25);
        l11.setBounds(20, 390, 100, 25);
        l12.setBounds(20, 420, 100, 25);
        l13.setBounds(20, 450, 100, 25);
        l14.setBounds(20, 480, 100, 25);


        b1.setBounds(130,90,60,25);
        b2.setBounds(130,120,60,25);
        b3.setBounds(130,150,60,25);
        b4.setBounds(130,180,60,25);
        b5.setBounds(130,210,60,25);
        b6.setBounds(130,240,60,25);
        b7.setBounds(130,270,60,25);
        b8.setBounds(130,300,60,25);
        b9.setBounds(130,330,60,25);
        b10.setBounds(130,360,60,25);
        b11.setBounds(130,390,60,25);
        b12.setBounds(130,420,60,25);
        b13.setBounds(130,450,60,25);
        b14.setBounds(130,480,60,25);

        l.setForeground(Color.RED);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        b10.setForeground(Color.WHITE);
        b11.setForeground(Color.WHITE);
        b12.setForeground(Color.WHITE);
        b13.setForeground(Color.WHITE);
        b14.setForeground(Color.WHITE);

        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.BLACK);
        b6.setBackground(Color.BLACK);
        b7.setBackground(Color.BLACK);
        b8.setBackground(Color.BLACK);
        b9.setBackground(Color.BLACK);
        b10.setBackground(Color.BLACK);
        b11.setBackground(Color.BLACK);
        b12.setBackground(Color.BLACK);
        b13.setBackground(Color.BLACK);
        b14.setBackground(Color.BLACK);
b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);


        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);

        add(l);
        addWindowListener(new WindowAdapter(){       
            public void windowClosing(WindowEvent e) {        
              System.out.println("Window Closing!");         
              dispose();    }   
            });   


        setSize(200,600);   
        setLayout(null);   
        setVisible(true);   
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            new Doctorlist(1);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b2){
            new Doctorlist(2);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b3){
            new Doctorlist(3);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b4){
            new Doctorlist(4);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b5){
            new Doctorlist(5);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b6){
            new Doctorlist(6);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b7){
            new Doctorlist(7);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b8){
            new Doctorlist(8);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b9){
            new Doctorlist(9);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b10){
            new Doctorlist(10);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b11){
             new Doctorlist(11);
             Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b12){
            new Doctorlist(12);
            Doctorlist.main(new String[0]);
        }
        else if(e.getSource()==b13){
            new Doctorlist(13);
            Doctorlist.main(new String[0]);
        }
        else{
            new Doctorlist(14);
            Doctorlist.main(new String[0]);
        }
       
    }
    

      public static void main(String args[]){
          new Dept();
      }
        
}
