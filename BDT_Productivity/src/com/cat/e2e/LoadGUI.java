package com.cat.e2e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LoadGUI implements ActionListener {

	
	
	JRadioButton rb1,rb2;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1;
	
	public LoadGUI() {
		
		JFrame f = new JFrame("Load GUI");
		
		
		//radio buttons for custom or standard
		rb1 = new JRadioButton("Standard");
		rb2 = new JRadioButton("Custom");
		rb1.setBounds(50,50,70,30);
		rb2.setBounds(120,50,70,30); 
		ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        f.add(rb1);f.add(rb2);
		
		//text fields for Standard type
        int sX=50;
        int sY=100;
        int bL=100;
        int bH=30;
        
        tf1=new JTextField();
        tf1.setBounds(sX,sY,bL,bH);
        l1= new JLabel("Initial Start time");
        l1.setBounds(sX,sY-30,bL,bH);
        tf2=new JTextField();
        tf2.setBounds(sX+110,sY,bL,bH);
        l2= new JLabel("Final Start time");
        l2.setBounds(sX+110,sY-30,bL,bH);
        tf3=new JTextField();
        tf3.setBounds(sX+110+110,sY,bL,bH);
        l3= new JLabel("each line offset");
        l3.setBounds(sX+110+110,sY-30,bL,bH);
        tf1.setVisible(false);tf2.setVisible(false);tf3.setVisible(false);
        tf4=new JTextField();
        tf4.setBounds(sX,sY+70,bL,bH);
        l4=new JLabel("Initial Service hours");
        l4.setBounds(sX,sY+70-30,bL,bH);
        tf5=new JTextField();
        tf5.setBounds(sX+110,sY+70,bL,bH);
        l5=new JLabel("Final Service hours");
        l5.setBounds(sX+110,sY+70-30,bL,bH);
        tf6=new JTextField();
        tf6.setBounds(sX+110+110,sY+70,bL,bH);
        l6=new JLabel("timezone offset");
        l6.setBounds(sX+110+110,sY+70-30,bL,bH);
        tf4.setVisible(false);tf5.setVisible(false);tf6.setVisible(false);
        l1.setVisible(false);l2.setVisible(false);l3.setVisible(false);
        l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);
        f.add(tf1);f.add(tf2);f.add(tf3);
        f.add(tf4);f.add(tf5);f.add(tf6);
        f.add(l1);f.add(l2);f.add(l3);
        f.add(l4);f.add(l5);f.add(l6);
        
		
        
        //text field for custom
        
        
        //generate button
        b1 = new JButton("Add");
        b1.setBounds(sX+100, sY+120, bL, bH);
        b1.addActionListener(this);
        f.add(b1);
        
		//frame settings
				f.setSize(600, 400);
				f.setLayout(null);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
	
		if(rb1.isSelected()) {
			tf1.setVisible(true);tf2.setVisible(true);tf3.setVisible(true);
			tf4.setVisible(true);tf5.setVisible(true);tf6.setVisible(true);
			l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);
	        l4.setVisible(true);l5.setVisible(true);l6.setVisible(true);
	        
	        if(e.getSource()==b1) {
	        	List<String> data = new ArrayList<String>();
	        	data.add(tf1.getText());
	        	data.add(tf2.getText());
	        	data.add(tf3.getText());
	        	data.add(tf4.getText());
	        	data.add(tf5.getText());
	        	data.add(tf6.getText());
	        }
	        
	        
		}else if(rb2.isSelected()) {
			tf1.setVisible(false);tf2.setVisible(false);tf3.setVisible(false);
			tf4.setVisible(false);tf5.setVisible(false);tf6.setVisible(false);
			l1.setVisible(false);l2.setVisible(false);l3.setVisible(false);
	        l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);
		}
		
	}
	

	
}
