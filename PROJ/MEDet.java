package hosp;
import java.awt.*;
import java.awt.event.*;
public class MEDdet extends Frame implements ActionListener{
    Button b=new Button("SYMPTOMS");
    Button b1=new Button("MEDICINES");
    Button b2=new Button("TESTS"); 
  
    MEDdet()
    {
    setTitle("MEDICAL TESTS AND MEDICINES");
    setSize(300,300);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
    
b.setBackground(Color.BLACK);
b1.setBackground(Color.BLACK);
b2.setBackground(Color.BLACK);
b.setForeground(Color.WHITE);
b1.setForeground(Color.WHITE);
b2.setForeground(Color.WHITE);
b.setBounds(10,45,90,25);
b1.setBounds(10,90,90,25);
b2.setBounds(10,135,90,25);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
add(b);
add(b1);
add(b2);
    setLayout(null);
    setVisible(true);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(final WindowEvent e) {
            System.out.println("Window closing");
            dispose();
        }
    });
    
}
public void actionPerformed(ActionEvent e) {
   
    if (e.getSource()==b) {
        Symp sym=new Symp(); 
      
    }else if(e.getSource()==b1){  
        med medi=new med();  
        
    }  
    else {
        test tes=new test();
    
    }  
}

public static void main(final String args[]) {
        new MEDdet();
        
        }
    }
