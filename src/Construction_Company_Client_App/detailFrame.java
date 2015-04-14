package Construction_Company_Client_App;

import java.awt.Color;

import javax.swing.JFrame;

public class detailFrame extends JFrame {
	
	detailPanel panel = new detailPanel();

	public detailFrame()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(200,200);
		setTitle("Tools");
		
		add(panel);
		
	}
}
