package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelrollno;
    JDateChooser  dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    
    Random ran=new Random();
    long first10= Math.abs((ran.nextLong()% 15000L) + 1000000000L); 
    AddStudent(){
    
    setSize(900,700);
    setLocation(350,50);
    
    setLayout(null);
    
    //heading
    JLabel heading= new JLabel("New Student Details");
    heading.setBounds(310,30,500,50);
    heading.setFont(new Font("serif",Font.BOLD, 30));
    add(heading);
    
    //label1
    JLabel lblname= new JLabel("Name");
    lblname.setBounds(50,150,100,30);
    lblname.setFont(new Font("serif",Font.BOLD, 20));
    add(lblname);
    
    tfname= new JTextField();
    tfname.setBounds(200,150,150,30);
    add(tfname);
    
    //fathers
    JLabel lblfname= new JLabel("Fathers Name");
    lblfname.setBounds(400,150,200,30);
    lblfname.setFont(new Font("serif",Font.BOLD, 20));
    add(lblfname);
    
    tffname= new JTextField();
    tffname.setBounds(600,150,150,30);
    add(tffname);
    
    //roll
    JLabel lblrollno= new JLabel("Roll Number");
    lblrollno.setBounds(50,200,200,30);
    lblrollno.setFont(new Font("serif",Font.BOLD, 20));
    add(lblrollno);
    
    labelrollno= new JLabel("RA"+first10);
    labelrollno.setBounds(200,200,200,30);
    labelrollno.setFont(new Font("serif",Font.BOLD, 20));
    add(labelrollno);
    
    //dob
    JLabel lbldob= new JLabel("Date of Birth");
    lbldob.setBounds(400,200,200,30);
    lbldob .setFont(new Font("serif",Font.BOLD, 20));
    add(lbldob);
    
    dcdob = new JDateChooser();
    dcdob.setBounds(600, 200, 150, 30);
    add(dcdob);
    
   //address
    JLabel lbladdress= new JLabel("Address");
    lbladdress.setBounds(50,250,200,30);
    lbladdress.setFont(new Font("serif",Font.BOLD, 20));
    add(lbladdress);
    
    tfaddress= new JTextField();
    tfaddress.setBounds(200,250,150,30);
    add(tfaddress);
    
    //phone
    JLabel lblphone= new JLabel("Phone number");
    lblphone.setBounds(400,250,200,30);
    lblphone.setFont(new Font("serif",Font.BOLD, 20));
    add(lblphone);
    
    tfphone= new JTextField();
    tfphone.setBounds(600,250,150,30);
    add(tfphone);
    
    //email
    JLabel lblemail= new JLabel("Email id");
    lblemail.setBounds(50,300,200,30);
    lblemail.setFont(new Font("serif",Font.BOLD, 20));
    add(lblemail);
    
    tfemail= new JTextField();
    tfemail.setBounds(200,300,200,30);
    add(tfemail);
    
    // class 10
    JLabel lblx= new JLabel("Class x (%)");
    lblx.setBounds(400,300,200,30);
    lblx.setFont(new Font("serif",Font.BOLD, 20));
    add(lblx);
    
    tfx= new JTextField();
    tfx.setBounds(600,300,150,30);
    add(tfx);
    
    // xii
    JLabel lblxii =new JLabel("Class XII(%)");
    lblxii.setBounds(50,350,200,30);
    lblxii.setFont(new Font("serif",Font.BOLD, 20));
    add(lblxii);
    
    tfxii= new JTextField();
    tfxii.setBounds(200,350,150,30);
    add(tfxii);
    
    //Aadhar
    JLabel lblaadhar =new JLabel("Aadhar Number");
    lblaadhar.setBounds(400,350,200,30);
    lblaadhar.setFont(new Font("serif",Font.BOLD, 20));
    add(lblaadhar);
    
    tfaadhar= new JTextField();
    tfaadhar.setBounds(600,350,150,30);
    add(tfaadhar);
    
    
    //course
    JLabel lblcourse =new JLabel("Course");
    lblcourse.setBounds(50,400,200,30);
    lblcourse.setFont(new Font("serif",Font.BOLD, 20));
    add(lblcourse);
    
    String course[]= {"Select a course", "B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MTech", "MCom", "MA", "BA"};
    
    
    cbcourse= new JComboBox(course);
    cbcourse.setBounds(200, 400, 150, 30);
    cbcourse.setBackground(Color.white);
    add(cbcourse);
    
    //Branch
    JLabel lblbranch =new JLabel("Branch");
    lblbranch.setBounds(400,400,200,30);
    lblbranch.setFont(new Font("serif",Font.BOLD, 20));
    add(lblbranch);
    
    String branch[]= {"Select a Branch", "Computer Science", "Bio Technology", "Finance", "Chemical", "Mechanical", "HR", "Electrical Engineering", "Civil", "IT", "Electronics", "Artificial Intelligence"};
    
    
    cbbranch= new JComboBox(branch);
    cbbranch.setBounds(600, 400, 150, 30);
    cbbranch.setBackground(Color.white);
    add(cbbranch);
    
    //button
    submit = new JButton ("Submit");
    submit.setBounds(250, 550, 120, 40 ); 
    submit.addActionListener(this);
    add(submit);
        
    cancel = new JButton ("Cancel");
    cancel.setBounds(500, 550, 120, 40 );
    cancel.addActionListener(this);
    add(cancel );
    
    
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            
            try {
                String query = "insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";

                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new AddStudent();
    }
    
}
