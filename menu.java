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
  
public class menu 
{  
        public static void side() 
	{  
		JFrame frame = new JFrame("Geolife"); 
		frame.setIconImage(new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\ImagesOnQR\\tree1.5.png").getImage());
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		
		ImageIcon bgImg=new ImageIcon("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\FarmWithBlackSIdebarAndLogo.jpg");
		JLabel background=new JLabel("", bgImg, JLabel.RIGHT);
		background.setBounds(0, 0, 1200, 800);

		JButton redirect=new JButton("PHP") ;	
		redirect.setBounds(85,325,130,50);      
		Font redirectButtonFont=new Font(redirect.getFont().getName(),redirect.getFont().getStyle(),18);    
		redirect.setFont(redirectButtonFont);
		redirect.setBackground(Color.WHITE);
		frame.add(redirect);
		redirect.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				frame.setVisible(false);
				php t1=new php();
				t1.php();				
	      		}
		}		
		);
		

		JButton exit=new JButton("EXIT");
		Font exitButtonFont=new Font(exit.getFont().getName(),exit.getFont().getStyle(), 18);    
		exit.setFont(exitButtonFont);
		exit.setBackground(Color.WHITE);
		exit.setBounds(95,625,100,50);
		frame.add(exit);
		exit.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				frame.setVisible(false);			
	      		}
		}		
		);
		
		JButton qr=new JButton("QR CODE");
		Font qrButtonFont=new Font(qr.getFont().getName(),qr.getFont().getStyle(),18);    
		qr.setFont(qrButtonFont);
		qr.setBackground(Color.WHITE);
		qr.setBounds(85,425,120,50);
		frame.add(qr);
		qr.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				frame.setVisible(false);
				grcode t1=new grcode();
				t1.qr();				
	      		}
		}		
		);

		JButton lc=new JButton("CHANGE LOCATION");
		Font locButtonFont=new Font(lc.getFont().getName(),lc.getFont().getStyle(),18);    
		lc.setFont(locButtonFont);
		lc.setBackground(Color.WHITE);
		lc.setBounds(30,525,230,50);
		frame.add(lc);
		lc.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
	      		{
				frame.setVisible(false);
				loc t1=new loc();
				t1.lt();				
	      		}
		}		
		);

		frame.setSize(1200, 800);  
		//frame.pack();
		frame.setResizable(false);	
        frame.setLayout(null);  
		frame.setVisible(true);
		frame.add(background);
        }
	public static void main(String[] args)
	{
		side();
	} 
}  