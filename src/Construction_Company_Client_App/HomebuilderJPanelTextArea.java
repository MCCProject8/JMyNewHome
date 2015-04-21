package Construction_Company_Client_App;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomebuilderJPanelTextArea extends JPanel{
	
	Fonts font = new Fonts();
	public static int width = 250;
	public static JTextArea area;
	public static JButton enter;
	public static JButton clear;

	public static JLabel picLabel;
	
	public HomebuilderJPanelTextArea() throws IOException{
		setBackground(Color.decode("#CCA37A"));
		setLayout(null);
		
		enter = new JButton("Enter");
		clear = new JButton("Clear");
		
		area = new JTextArea();
		area.setLineWrap(true);
		area.setSize(width,HomebuilderMain.HEIGHT);
		area.setFont(font.cosmicArea);
		area.setBorder(Borders.blackline);
		area.setEditable(false);
		area.setText(Global.data.defaultMessage);
		JScrollPane scroll = new JScrollPane (area, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(20,30,width,HomebuilderMain.HEIGHT / 3);
		
		enter.setBounds(20,170,100,25);
		enter.setFocusPainted(false);
		enter.addMouseListener(new OnClick());
		
		clear.setBounds(170,170,100,25);
		clear.setFocusPainted(false);
		clear.addMouseListener(new OnClick());
		
		ImageIcon image = new ImageIcon("blueprint.jpg");
		picLabel = new JLabel();
		picLabel.setIcon(image);
		picLabel.setBounds(30,200,280,130);
		
		add(picLabel);
		add(scroll);
		add(enter);
		add(clear);	
	}
}
