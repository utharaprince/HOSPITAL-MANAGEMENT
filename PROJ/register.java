package hosp;
import java.awt.*;
import java.awt.event.*;
public class register extends Frame implements ActionListener{
    Button b=new Button("DEPARTMENTS");
    
    Button b2=new Button("PATIENTS REGISTER"); 
  
    register()
    {
    setTitle("REGISTERATION");
    setSize(300,300);
    setBackground(Color.LIGHT_GRAY);
    setSize(400,400);
    
b.setBackground(Color.BLACK);

b2.setBackground(Color.BLACK);
b.setForeground(Color.WHITE);
;
b2.setForeground(Color.WHITE);
b.setBounds(80,80,200,50);

b2.setBounds(80,145,200,50);
b.addActionListener(this);

b2.addActionListener(this);
add(b);

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
        new Dept();

    }  
    else {
        new Details();
    
    }  
}

public static void main(final String args[]) {
        new register();
        
        }
    }
