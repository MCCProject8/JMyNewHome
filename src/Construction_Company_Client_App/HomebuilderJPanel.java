package Construction_Company_Client_App;

import java.awt.Color;
import java.awt.Panel;

import javafx.scene.layout.Border;

import javax.swing.JLabel;

public class HomebuilderJPanel extends Panel {
	
	private JLabel title;
	
	private Fonts font = new Fonts();
	private Borders border = new Borders();
	
	public HomebuilderJPanel(){
		setBackground(Color.decode("#CCA37A"));
		
		
		title = new JLabel();
		title.setText("Build Your Home");		
		title.setFont(font.cosmic );
		
		
		add(title);
		
		
		
	}

}
