package Construction_Company_Client_App;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class detailPanel extends JPanel {
	
	public static JLabel modelLabel = new JLabel();
	public static JLabel bedroomLabel = new JLabel();
	public static JLabel garageLabel = new JLabel();
	public JLabel title = new JLabel("Tools Selected");

	Fonts font = new Fonts();
	

	
	public detailPanel()
	{
		setBackground(Color.decode("#CCA37A"));
		setLayout(null);
		
		title.setBounds(45, 5, 135, 20);
		title.setFont(font.cosmicTitle);
		
		JLabel modelTitle = new JLabel("Model Selected:");
		JLabel bedroomTitle = new JLabel("Bedrooms Selected:");
		JLabel garageTitle = new JLabel("Garages Selected:");
		
		modelTitle.setBounds(5, 30, 120, 20);
		bedroomTitle.setBounds(5, 50, 120, 20);
		garageTitle.setBounds(5, 70, 120, 20);
		
		modelLabel.setBounds(90, 30, 120, 20);
		bedroomLabel.setBounds(105, 50, 120, 20);
		garageLabel.setBounds(100, 70, 120, 20);
		
		modelLabel.setFont(font.cosmicArea);
		bedroomLabel.setFont(font.cosmicArea);
		garageLabel.setFont(font.cosmicArea);

			
		add(title);
		add(modelLabel);
		add(bedroomLabel);
		add(garageLabel);
		
		add(modelTitle);
		add(bedroomTitle);
		add(garageTitle);
	
	}

}
