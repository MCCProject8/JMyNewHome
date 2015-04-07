package Construction_Company_Client_App;


import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomebuilderJPanelTextArea extends JPanel{
	
	Fonts font = new Fonts();
	public static int width = 250;
	public static JTextArea area;
	
	public HomebuilderJPanelTextArea(){
		setBackground(Color.decode("#CCA37A"));
		setLayout(null);
		
		area = new JTextArea();
		area.setLineWrap(true);
		area.setSize(width,HomebuilderMain.HEIGHT);
		area.setFont(font.cosmicArea);
		area.setBorder(Borders.blackline);
		area.setEditable(false);
		area.setText("Enjoy Building Your New Home.\n"
				+ "Aspen = $100,000\nBrittany = $120,000\nColonial = $180,000\nDartmoor = $250,000"
				+ "\n1 bedroom = $10,500\n1 garage = $7,775");
		JScrollPane scroll = new JScrollPane (area, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(20,30,width,HomebuilderMain.HEIGHT / 3);
		
		
		add(scroll);
	}

}
