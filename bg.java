package geolife.piyush.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class bg extends JFrame
{
public class Panel extends JPanel
{

    public void paintComponent(Graphics g)
    {
        Image img; 
        try 
        {
        img = ImageIO.read(new File("root/Desktop/Geolife/img/FarmUsed.jpeg"));
        g.drawImage(img, 0, 0, this);
        } 
        catch (IOException e) 
        {
        e.printStackTrace();
        }

    }
}

public bg(String title, int width, int height)
{
    this.setTitle(title);
    this.setSize(width, height);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Panel()); 
    this.setVisible(true);
}
}

