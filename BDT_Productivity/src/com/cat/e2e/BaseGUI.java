package com.cat.e2e;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BaseGUI implements ActionListener {

	
	JTextField tf1,tf2,tf3;
	JLabel ltf1,ltf2,ltf3;
	JButton b1,b2,b3,b4,b5,b6;
	JFrame f;
	
	public BaseGUI() {
		
		//base window
		f = new JFrame("BDT_Productivity");

		
		//text field in the first row for asset id, material, operator
		
		tf1= new JTextField();
		tf1.setBounds(50, 50, 150, 20);
		ltf1 = new JLabel("asset id");
		ltf1.setBounds(80, 32, 150, 20);
		
		tf2= new JTextField();
		tf2.setBounds(210, 50, 150, 20);
		ltf2 = new JLabel("material");
		ltf2.setBounds(210, 32, 150, 20);
		
		tf3= new JTextField();
		tf3.setBounds(380, 50, 150, 20);
		ltf3 = new JLabel("asset id");
		ltf3.setBounds(380, 32, 150, 20);
		
		f.add(tf1);f.add(tf2);f.add(tf3);
		f.add(ltf1);f.add(ltf2);f.add(ltf3);
		
		
		//Buttons for each blocks
		
		b1 = new JButton("Load");
		b1.setBounds(80, 150, 150, 40);
		b1.addActionListener(this);
		
		b2 = new JButton("Cycle");
		b2.setBounds(80+150, 150, 150, 40);
		
		b3 = new JButton("Segment");
		b3.setBounds(80+150+150, 150, 150, 40);
		
		b4 = new JButton("Status");
		b4.setBounds(80, 250, 150, 40);
		
		b5 = new JButton("Payload");
		b5.setBounds(80+150, 250, 150, 40);
		
		b6 = new JButton("GPS");
		b6.setBounds(80+150+150, 250, 150, 40);
		
		f.add(b1);f.add(b2);f.add(b3);
		f.add(b4);f.add(b5);f.add(b6);
		
		
		
		
		//frame settings
		f.setSize(800, 800);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String test = tf1.getText();
		System.out.println(test);
		
		if(e.getSource()==b1) {
			new LoadGUI();
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BaseGUI();
	}




	


}
