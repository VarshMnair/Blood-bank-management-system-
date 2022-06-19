 import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
import java.util.*;

class Donation implements ActionListener

{
 JFrame f1,f2,f3,f4,f5,f6;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25;
 JLabel l1,l2,l3,l4,l5,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,background,l29;
 JPasswordField p1,p2;

 Donation()
 {
  f1=new JFrame("HOME");
  f2=new JFrame("ADMISSION");
  f3=new JFrame("DONOR AD");
  f4=new JFrame("RECIPIENT AD");
  f5=new JFrame("SIGN IN");
  f6=new JFrame("VOLUNTEER");
  f1.setSize(2500,1200);
  f2.setSize(400,400);
  f3.setSize(400,400);
  f4.setSize(400,400);
  f5.setSize(400,300);
  f6.setSize(400,300);
  b1=new JButton("REGISTER");
  b2=new JButton("SIGN IN");
  b3=new JButton("VOLUNTEER");
  b4=new JButton("DONOR");
  b5=new JButton("RECIPIENT");
  b6=new JButton("COORDINATOR DETAILS");
  b7=new JButton("OK");
  b8=new JButton("SUBMIT");
  b9=new JButton("APPLY");
  b10=new JButton("DONE");
 
 
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
 
 
  
  b1.setBounds(600,50,300,100);
  b2.setBounds(600,200,300,100);
  b3.setBounds(600,350,300,100);
  b6.setBounds(600,550,300,100);
  b4.setBounds(70,50,100,50);
  b5.setBounds(70,200,100,50);
  b7.setBounds(200,300,100,50);
  b8.setBounds(200,200,100,50);
  b9.setBounds(200,200,100,50);
  b10.setBounds(200,200,100,50);

  


  
  f1.add(b1);
  f1.add(b2);
  f1.add(b3);
  f1.add(b6);
  f2.add(b4);
  f2.add(b5);
  f3.add(b7);
  f6.add(b8);
  f4.add(b9);
  f5.add(b10);
  
  f1.setLayout(null);
  f2.setLayout(null);
  f3.setLayout(null);
  f4.setLayout(null);
  f5.setLayout(null);
  f6.setLayout(null);
  f1.setVisible(true);
 
  ImageIcon img =new ImageIcon("blood1.jpg");
  background=new JLabel();
  background.setIcon(img);
  background.setSize(2000,1000);
  f1.add(background);
  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  l1=new JLabel("ID");
  l2=new JLabel("PASSWORD");
  l3=new JLabel("NAME");
  l4=new JLabel("USERNAME");
  l5=new JLabel("BLOOD GROUP");
  l9=new JLabel("AGE");
  l10=new JLabel("WEIGHT");
  l11=new JLabel("PLACE");
  l12=new JLabel("PHONE NUMBER");
  l13=new JLabel("DONATION HISTORY");
  l14=new JLabel("PASSWORD");
  l15=new JLabel("NAME");
  l16=new JLabel("USERNAME");
  l17=new JLabel("BLOOD GROUP");
  l18=new JLabel("AGE");
  l19=new JLabel("WEIGHT");
  l20=new JLabel("PLACE");
  l21=new JLabel("PHONE NUMBER");
  l22=new JLabel("DONATION HISTORY");
  l23=new JLabel("PASSWORD");
  l24=new JLabel("NAME");
  l25=new JLabel("USERNAME");
  l26=new JLabel("BLOOD GROUP");
  l27=new JLabel("HOSPITAL NAME");
  l28=new JLabel("PASSWORD");
  l29=new JLabel();
  
  t1=new JTextField(15);
  t2=new JTextField(15);
  t3=new JTextField(15);
  t4=new JTextField(15);
  t5=new JTextField(15);
  t6=new JTextField(15);
  t7=new JTextField(15);
  t8=new JTextField(15);
  t9=new JTextField(15);
  t10=new JTextField(15);
  t11=new JTextField(15);
  t12=new JTextField(15);
  t13=new JTextField(15);
  t14=new JTextField(15);
  t15=new JTextField(15);
  t16=new JTextField(15);
  t17=new JTextField(15);
  t18=new JTextField(15);
  t19=new JTextField(15);
  t20=new JTextField(15);
  t21=new JTextField(15);
  t22=new JTextField(15);
  t23=new JTextField(15);
  t24=new JTextField(15);
  t25=new JTextField(15);
  
  

 


 /* p1=new JPasswordField(15);
  p2=new JPasswordField(15);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
*/

  l1.setBounds(25,100,100,30);
 t24.setBounds(150,100,100,30);

  l2.setBounds(25,200,100,30);
 t25.setBounds(150,200,100,30);

 l3.setBounds(25,50,100,30);
 t1.setBounds(150,50,100,30);

// p1.setBounds(100,105,200,30);

  l4.setBounds(25,100,100,30);
  t2.setBounds(150,100,100,30);

  l5.setBounds(25,150,100,30);
  t3.setBounds(150,150,100,30);

 // p2.setBounds(100,65,100,30);

  l9.setBounds(25,200,100,30);
  t4.setBounds(150,200,100,30);

  l10.setBounds(25,250,100,30);
  t5.setBounds(150,250,100,30);

  l11.setBounds(25,300,100,30);
   t6.setBounds(150,300,100,30);

  l12.setBounds(25,350,100,30);
  t7.setBounds(150,350,100,30);

  l13.setBounds(25,400,100,30);
  t8.setBounds(150,400,100,30);

  l14.setBounds(25,450,100,30);
  t9.setBounds(150,450,100,30);


  l15.setBounds(25,50,100,30);
  t10.setBounds(100,50,100,30);

  l16.setBounds(25,100,100,30);
  t11.setBounds(100,100,100,30);

 
 l17.setBounds(25,150,100,30);
  t12.setBounds(100,150,100,30);

  l18.setBounds(25,200,100,30);
  t13.setBounds(100,200,100,30);

  l19.setBounds(25,250,100,30);
  t14.setBounds(100,250,100,30);
 
   l20.setBounds(25,300,100,30);
   t15.setBounds(100,300,100,30);

   l21.setBounds(25,350,100,30);
   t16.setBounds(100,350,100,30);


  l22.setBounds(25,400,100,30);
   t17.setBounds(100,400,100,30);

  l23.setBounds(25,450,100,30);
  t18.setBounds(100,450,100,30);

  l24.setBounds(25,50,100,30);
  t19.setBounds(100,50,100,30);


  l25.setBounds(25,100,100,30);
  t20.setBounds(100,100,100,30);


  l26.setBounds(25,150,100,30);
  t21.setBounds(100,150,100,30);


  l27.setBounds(25,200,100,30);
  t22.setBounds(100,200,100,30);

  l28.setBounds(25,250,100,30);
  t23.setBounds(100,250,100,30);

  l29.setBounds(25,250,100,30);
  

   
  
f3.add(l3);
f3.add(t1);
f3.add(l4);
f3.add(t2);
f3.add(l5);
f3.add(t3);
f3.add(l9);
f3.add(t4);
f3.add(l10);
f3.add(t5);
f3.add(l11);
f3.add(t6);
f3.add(l12);
f3.add(t7);
f3.add(l13);
f3.add(t8);
f3.add(l14);
f3.add(t9);

f6.add(l15);
f6.add(t10);
f6.add(l16);
f6.add(t11);
f6.add(l17);
f6.add(t12);
f6.add(l18);
f6.add(t13);
f6.add(l19);
f6.add(t14);
f6.add(l20);
f6.add(t15);
f6.add(l21);
f6.add(t16);
f6.add(l22);
f6.add(t17);
f6.add(l23);
f6.add(t18);



f4.add(l24);
f4.add(t19);
f4.add(l25);
f4.add(t20);
f4.add(l26);
f4.add(t21);
f4.add(l27);
f4.add(t22);
f4.add(l28);
f4.add(t23);

f5.add(l1);
f5.add(t24);
f5.add(l2);
f5.add(t25);
f5.add(l29);

  f2.setVisible(false);
  f3.setVisible(false);
  f4.setVisible(false);
  f5.setVisible(false);
  f6.setVisible(false);
 }
 public void actionPerformed(ActionEvent e)
 {
  String s=e.getActionCommand();
  String s1=new String();
  Boolean a=true;
   
   try
  {
    Class.forName("org.postgresql.Driver");
    Connection c=DriverManager.getConnection("jdbc:postgresql://jelani.db.elephantsql.com/dtgnwkky","dtgnwkky","aUOyZz8H3NZKH9ajrHslTHs-WX1Uc699");
    Statement stat=c.createStatement();
    ResultSet rs;
    int b;
    if(s.equals("REGISTER"))
    {
      f2.setVisible(true);
    }
      else if(s.equals("DONOR"))
       {
           f3.setVisible(true);
         }
       else if(s.equals("RECIPIENT"))
         {
           f4.setVisible(true);
         }
    else if(s.equals("SIGN IN"))
    {
      f5.setVisible(true);
    }
    else if(s.equals("VOLUNTEER"))
    {
     f6.setVisible(true);
    }
  
  else if(s.equals("OK"))
    {
     String name=t1.getText();
     String usrnm=t2.getText();
     String bldgrp=t3.getText();
     String age=t4.getText();
     String wt=t5.getText();
     String pl=t6.getText();
     String ph=t7.getText();
     String dnh=t8.getText();
     String ps=t9.getText();

     s1="INSERT INTO DONORS VALUES('"+name+"','"+usrnm+"','"+bldgrp+"','"+age+"','"+wt+"','"+pl+"','"+ph+"','"+dnh+"','"+ps+"');";
      b=stat.executeUpdate(s1);
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t8.setText("");
   
    }
 else if(s.equals("SUBMIT"))
    {
     String name1=t10.getText();
     String usrnm1=t11.getText();
     String bldgrp1=t12.getText();
     String age1=t13.getText();
     String wt1=t14.getText();
     String pl1=t15.getText();
     String ph1=t16.getText();
     String dnh1=t17.getText();
     String ps1=t18.getText();

    s1="INSERT INTO VOLUNTEERS VALUES('"+name1+"','"+usrnm1+"','"+bldgrp1+"','"+age1+"','"+wt1+"','"+pl1+"','"+ph1+"','"+dnh1+"','"+ps1+"');";
    b=stat.executeUpdate(s1);
    t10.setText("");
    t11.setText("");
    t12.setText("");
    t13.setText("");
    t14.setText("");
    t15.setText("");
    t16.setText("");
    t17.setText("");
    t18.setText("");
    
    }

else if(s.equals("APPLY"))
    {
     String name2=t19.getText();
     String usrnm2=t20.getText();
     String bldgrp2=t21.getText();
     String hspn=t22.getText();
     String ps2=t23.getText();
    
    s1="INSERT INTO RECIPIENTS VALUES('"+name2+"','"+usrnm2+"','"+bldgrp2+"','"+hspn+"','"+ps2+"');";
    b=stat.executeUpdate(s1);
    t19.setText("");
    t20.setText("");
    t21.setText("");
    t22.setText("");
    t23.setText("");
    
    
    }


    else if(s.equals("DONE"))
    {
     String username=t24.getText();
     String password=t25.getText();
     rs=stat.executeQuery("SELECT PASSWORD FROM DONORS WHERE v_id ='"+username+"';");
     while(rs.next())
     {
      String str=rs.getString("password");
      if(password.equals(str))
      {
         a=false;
      }
      if(a)
      {
        l29.setText("incorrect password");
      }
      else
      {
        l29.setText("welcome");
      }
      t24.setText("");
      t25.setText("");
     }
    }
 


 stat.close();
   c.close();

   }

  catch(java.lang.Exception ex)
   {
    System.out.println(ex);
   }
 
  }

public static void main(String[]args)
 {
  Donation l=new Donation();
 }
}





