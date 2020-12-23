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
import javax.swing.*;
import javax.imageio.ImageIO; 

public class grcode
{  
        public static void qr() 
	{  
		JFrame frame = new JFrame("Geolife");  
		frame.setIconImage(new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\ImagesOnQR\\tree1.5.png").getImage());
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		
		ImageIcon bgImg=new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\FarmWithBlackSIdebarAndLogo.jpg");
		JLabel background=new JLabel("", bgImg, JLabel.RIGHT);
		background.setBounds(0, 0, 1200, 800);
		
		JTextField link,name;
		JLabel t1,t2,a1,a2;
		
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

		JButton genrate=new JButton("GENERATE");
		Font generateButtonFont=new Font(genrate.getFont().getName(),genrate.getFont().getStyle(), 22);    
		genrate.setFont(generateButtonFont);
		genrate.setBackground(Color.WHITE);
		genrate.setBounds(600,400,250,50);
		frame.add(genrate);

//		a1=new JLabel("ENTER NAME OF THE QR CODE TO BE GENERATED");
//		a1.setFont(new Font(a1.getFont().getName(), a1.getFont().getStyle(), 18));
//		a1.setForeground(Color.WHITE);
//		a1.setBounds(50,300,250,50);
//		frame.add(a1);

		t1=new JLabel("ENTER NAME OF QR:");
		t1.setFont(new Font(t1.getFont().getName(), t1.getFont().getStyle(), 22));
		t1.setBounds(810,195,250,50);
		frame.add(t1);

//		a2=new JLabel("ENTER LINK FOR QR CODE");
//		a2.setFont(new Font(a1.getFont().getName(), a1.getFont().getStyle(), 18));
//		a2.setBounds(650,450,250,50);
//		frame.add(a2);

		t2=new JLabel("ENTER LINK TO GENERATE QR:");
		t2.setFont(new Font(t2.getFont().getName(), t2.getFont().getStyle(), 22));
		t2.setBounds(390,195,350,50);
		frame.add(t2);

		link=new JTextField();
		link.setFont(new Font(link.getFont().getName(), link.getFont().getStyle(), 20));
		link.setBounds(430,280,250,50);
		frame.add(link);

		name=new JTextField();
		name.setFont(new Font(name.getFont().getName(), name.getFont().getStyle(), 20));
		name.setBounds(800,280,250,50);
		frame.add(name);


		frame.setSize(1200,800);  
		//frame.pack();
		genrate.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				String lin=link.getText();
				String na=name.getText();
			//	System.out.println(na);
			//	qrgen x=new qrgen();
				//x.gen(lin,na);
				QRCodeWithLogo qr=new QRCodeWithLogo();
				qr.gen(lin, na);
				JOptionPane.showMessageDialog(frame,"Successfully Created.","Alert",JOptionPane.WARNING_MESSAGE);					
	      		}
		}		
		);

		frame.setSize(1200, 800);
		frame.setResizable(false);	
        frame.setLayout(null);  
		frame.setVisible(true);
		frame.add(background); 
        }
	public static void main(String[] args)
	{
		qr();
	} 
  
}  
