package hosp;
import java.awt.*;
import java.awt.event.*;
public class patmain extends Frame implements ActionListener{
    Button b=new Button("LOGIN");
    Button b1=new Button("REGISTER");
    
  
    patmain()
    {
    setTitle("PATIENTS");
    setSize(300,300);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
    
b.setBackground(Color.BLACK);
b1.setBackground(Color.BLACK);

b.setForeground(Color.WHITE);
b1.setForeground(Color.WHITE);

b.setBounds(150,100,90,25);
b1.setBounds(150,200,90,25);

b.addActionListener(this);
b1.addActionListener(this);

add(b);
add(b1);

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
        new patlog();
      
    }else {  
        new Details();
        
    }  
    
}

public static void main(final String args[]) {
        new patmain();
        
        }
    }
