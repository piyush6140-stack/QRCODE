package geolife.piyush.com;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.ImageIO; 
public class loc
{
	   
        public static void lt() 
	{  
		JFrame frame = new JFrame("Geolife");  
		frame.setIconImage(new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\ImagesOnQR\\tree1.5.png").getImage());
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		
		ImageIcon bgImg=new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\FarmWithBlackSIdebarAndLogo.jpg");
		JLabel background=new JLabel("", bgImg, JLabel.RIGHT);
		background.setBounds(0, 0, 1200, 800);
		
		JButton php,qr;
		JLabel t1,t2,a1,a2,a11,a21;
		JButton exit=new JButton("EXIT");
		Font exitButtonFont=new Font(exit.getFont().getName(),exit.getFont().getStyle(), 18);    
		exit.setFont(exitButtonFont);
		exit.setBackground(Color.WHITE);
		exit.setBounds(72,650,150,50);
		frame.add(exit);
		exit.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				frame.setVisible(false);
				menu t1=new menu();
				t1.side();				
				
	      		}
		}		
		);
		JButton update=new JButton("UPDATE");
		Font updateButtonFont=new Font(update.getFont().getName(),update.getFont().getStyle(), 22);    
		update.setFont(updateButtonFont);
		update.setBackground(Color.WHITE);
		update.setBounds(600,400,250,50);
		frame.add(update);
		getlc t=new getlc();
				
		a1=new JLabel("CURRENT LOCATION OF PHP FILEs STORAGE IS:\n");
		a1.setFont(new Font(a1.getFont().getName(), a1.getFont().getStyle(), 14));
		a1.setBounds(570,10,850,50);
		frame.add(a1);
		
		a11=new JLabel(t.lphp(), SwingConstants.CENTER);
		a11.setFont(new Font(a11.getFont().getName(), a11.getFont().getStyle(), 14));
		a11.setBounds(310,30,850,50);
		frame.add(a11);

		t1=new JLabel("SELECT FOLDER:");
		t1.setFont(new Font(t1.getFont().getName(), t1.getFont().getStyle(), 22));
		t1.setBounds(830,195,250,50);
		frame.add(t1);
		
		a2=new JLabel("CURRENT LOCATION OF QR CODE STORAGE IS:\n");
		a2.setFont(new Font(a2.getFont().getName(), a2.getFont().getStyle(), 14));
		a2.setBounds(570,80,850,50);
		frame.add(a2);
		
		a21=new JLabel(t.lqr(), SwingConstants.CENTER);
		a21.setFont(new Font(a21.getFont().getName(), a21.getFont().getStyle(), 14));
		a21.setBounds(310,100,850,50);
		frame.add(a21);

		t2=new JLabel("SELECT FOLDER:");
		t2.setFont(new Font(t2.getFont().getName(), t2.getFont().getStyle(), 22));
		t2.setBounds(450,195,250,50);
		frame.add(t2);

		php=new JButton("CHOOSE PHP");
		Font phpButtonFont=new Font(php.getFont().getName(),php.getFont().getStyle(), 22);    
		php.setFont(phpButtonFont);
		php.setBackground(Color.WHITE);
		php.setBounds(450,300,200,50);
		frame.add(php);
		php.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				trial x1=new trial();
				wrlc d=new wrlc();
				d.wrphp(x1.getp());
				replace r=new replace();
				r.rephp();
				//System.out.println(x1.getp());
				frame.setVisible(false);
				lt();				
				
	      		}
		}		
		);
		
		qr=new JButton("CHOOSE QR");
		Font qrButtonFont=new Font(qr.getFont().getName(),qr.getFont().getStyle(), 22);    
		qr.setFont(qrButtonFont);
		qr.setBackground(Color.WHITE);
		qr.setBounds(830,300,200,50);
		frame.add(qr);
		qr.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				trial x1=new trial();
				wrlc d=new wrlc();
				d.wrqr(x1.getp());
				replace r=new replace();
				r.reqr();
				//System.out.println(x1.getp());
				frame.setVisible(false);
				lt();				
	      		}
		}		
		);

//trunk, native , allowed and access
//router forwarding types remote, default, directly connected		
		
		update.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				JOptionPane.showMessageDialog(frame,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
				frame.setVisible(false);
				menu t1=new menu();
				t1.side();								
	      		}
		}		
		);

		frame.setSize(1200,800); 
		frame.add(background);
		//frame.pack();	
		frame.setResizable(false);
        frame.setLayout(null);  
		frame.setVisible(true);  
        }		public static void main(String[] args)
	{
		lt();
	}  
}  
