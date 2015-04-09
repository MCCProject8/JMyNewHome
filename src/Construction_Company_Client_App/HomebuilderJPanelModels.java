package Construction_Company_Client_App;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomebuilderJPanelModels extends JPanel{
	
	public JLabel modelLabel = new JLabel("       Models");
	
	public static JButton modelAspenButton = new JButton("   Aspen   ");
	public static JButton modelBrittanyButton = new JButton(" Brittany  "); 
	public static JButton modelColonialButton = new JButton(" Colonial  ");
	public static JButton modelDartmoorButton = new JButton("Dartmoor");
	
	public JLabel emptySpace = new JLabel(" ");
	public JLabel bedroomLabel = new JLabel("    Bedrooms");
	
	public static JButton bedroom1 = new JButton("1");
	public static JButton bedroom2 = new JButton("2");
	public static JButton bedroom3 = new JButton("3");
	public static JButton bedroom4 = new JButton("4");
	
	public JLabel emptySpace2 = new JLabel(" ");
	public JLabel garageLabel = new JLabel("Garages");
	
	public static JButton garage0 = new JButton("0");
	public static JButton garage1 = new JButton("1");
	public static JButton garage2 = new JButton("2");
	public static JButton garage3 = new JButton("3");


		
	public HomebuilderJPanelModels(){
		setBackground(Color.decode("#CCA37A"));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder("Create Tools"));
		
		modelListener ModelListener = new modelListener();
		bedroomListener BedroomListener = new bedroomListener();
		garageListener GarageListener = new garageListener();

		ButtonGroup modelGroup = new ButtonGroup();
		modelGroup.add(modelAspenButton);
		modelGroup.add(modelBrittanyButton);
		modelGroup.add(modelColonialButton);
		modelGroup.add(modelDartmoorButton);
		
		ButtonGroup bedroomGroup = new ButtonGroup();
		bedroomGroup.add(bedroom1);
		bedroomGroup.add(bedroom2);
		bedroomGroup.add(bedroom3);
		bedroomGroup.add(bedroom4);
		
		JPanel bedroomPanel = new JPanel();
		bedroomPanel.setBackground(Color.decode("#CCA37A"));
		bedroomPanel.setLayout(null);
		bedroom1.setBounds(0,0,45,20);
		bedroom2.setBounds(42,0,45,20);
		bedroom3.setBounds(0,21,45,20);
		bedroom4.setBounds(42,21,45,20);
		garageLabel.setBounds(18,50,50,20);
		garage0.setBounds(0,70,45,20);
		garage1.setBounds(42,70,45,20);
		garage2.setBounds(0,91,45,20);
		garage3.setBounds(42,91,45,20);
		
		
		modelAspenButton.addActionListener(ModelListener);
		modelBrittanyButton.addActionListener(ModelListener);
		modelColonialButton.addActionListener(ModelListener);
		modelDartmoorButton.addActionListener(ModelListener);
		
		bedroom1.addActionListener(BedroomListener);
		bedroom2.addActionListener(BedroomListener);
		bedroom3.addActionListener(BedroomListener);
		bedroom4.addActionListener(BedroomListener);
		
		garage0.addActionListener(GarageListener);
		garage1.addActionListener(GarageListener);
		garage2.addActionListener(GarageListener);
		garage3.addActionListener(GarageListener);
		
		modelAspenButton.setFocusPainted(false);
		modelBrittanyButton.setFocusPainted(false);
		modelColonialButton.setFocusPainted(false);
		modelDartmoorButton.setFocusPainted(false);
		
		modelAspenButton.setFocusable(false);
		modelBrittanyButton.setFocusable(false);
		modelColonialButton.setFocusable(false);
		modelDartmoorButton.setFocusable(false);

		bedroom1.setFocusable(false);
		bedroom2.setFocusable(false);
		bedroom3.setFocusable(false);
		bedroom4.setFocusable(false);
		
		garage0.setFocusable(false);
		garage1.setFocusable(false);
		garage2.setFocusable(false);
		garage3.setFocusable(false);

		bedroomPanel.add(bedroom1);
		bedroomPanel.add(bedroom2);
		bedroomPanel.add(bedroom3);
		bedroomPanel.add(bedroom4);
		bedroomPanel.add(emptySpace2);
		bedroomPanel.add(garageLabel);
		bedroomPanel.add(garage0);
		bedroomPanel.add(garage1);
		bedroomPanel.add(garage2);
		bedroomPanel.add(garage3);
	
		add(modelLabel);
		add(modelAspenButton);
		add(modelBrittanyButton);
		add(modelColonialButton);
		add(modelDartmoorButton);
		add(emptySpace);
		add(bedroomLabel);
		add(bedroomPanel);
		
		
	}
	
	
	
}