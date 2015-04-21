package Construction_Company_Client_App;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JLabel;

public class HomebuilderJPanel extends Panel {
	
	private JLabel title;
	
	private Fonts font = new Fonts();
	
	public HomebuilderJPanel(){
		setBackground(Color.decode("#CCA37A"));
	
		title = new JLabel();
		title.setText("Build Your Home");		
		title.setFont(font.cosmic );
				
		add(title);		
	}

}
