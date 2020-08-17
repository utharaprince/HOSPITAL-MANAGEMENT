package hosp;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Doctorlist {
private Frame mainFrame;
private Label headerLabel;
private Panel controlPanel;
public static int DEPT_ID;

public Doctorlist(int DEPT_ID) {
Doctorlist.DEPT_ID = DEPT_ID;
prepareGUI();
}

public static void main(String[] args) {
Doctorlist M = new Doctorlist(DEPT_ID);
M.showListDemo();
}

private void prepareGUI() {
mainFrame = new Frame("Doctors available");
mainFrame.setSize(400, 400);
mainFrame.setLayout(new GridLayout(3, 1));
mainFrame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent) {
System.exit(0);
}
});
headerLabel = new Label();
headerLabel.setAlignment(Label.CENTER);

controlPanel = new Panel();
controlPanel.setLayout(new FlowLayout());
mainFrame.add(headerLabel);
mainFrame.add(controlPanel);

mainFrame.setVisible(true);
}

private void showListDemo() {
String sql = "SELECT DOCNAME FROM DOCTORS WHERE DEPTID='"+DEPT_ID+"'";
try {

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj1", "root", "Uthara@1");
// here Hospital is database name, root is username
if (con != null) {
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
headerLabel.setText("Our Doctors..");
final List DrList = new List();
while (rs.next()) {
DrList.add(rs.getString(1));

}

Button selectButton = new Button("Select");
selectButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String data = DrList.getItem(DrList.getSelectedIndex());
new Doctor(data);
}
});
controlPanel.add(DrList);
controlPanel.add(selectButton);
mainFrame.setVisible(true);

stmt.close();
con.close();
} else {
System.out.println("Unable to get connection!");
}

} catch (Exception ex) {
System.out.println(ex);
}

}
}
