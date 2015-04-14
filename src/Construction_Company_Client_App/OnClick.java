package Construction_Company_Client_App;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OnClick implements MouseListener {
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		

		String bedroomAmount = String.valueOf(Global.data.getBedroomAmount());
		String garageAmount = String.valueOf(Global.data.getGarageroomAmount());
		
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelTextArea.enter)
		{
			HomebuilderJPanelTextArea.enter.setFocusable(false);
			String message = Global.data.finalMessage();	
			HomebuilderJPanelTextArea.area.setText(message);

			if(Global.data.getModelType() == null)
			{
				Global.data.setmodelPrice("null");	
			}
			
			detailPanel.modelLabel.setText(Global.data.getModelType());
			detailPanel.bedroomLabel.setText(bedroomAmount);
			detailPanel.garageLabel.setText(garageAmount);

		}
		
		if(source == HomebuilderJPanelTextArea.clear)
		{
			HomebuilderJPanelTextArea.clear.setFocusable(false);
			HomebuilderJPanelTextArea.area.setText(Global.data.defaultMessage);
			Global.data.setmodelPrice("null");
			Global.data.setbedroomPrice(5);
			Global.data.setgaragePrice(5);
			Global.data.setBedroomAmount(0);
			Global.data.setGarageroomAmount(0);
			
			ImageIcon i = new ImageIcon("blueprint.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
			HomebuilderJPanelTextArea.picLabel.setBounds(25,200,250,130);
			
			detailPanel.modelLabel.setText(Global.data.getModelType());
			detailPanel.bedroomLabel.setText(bedroomAmount);
			detailPanel.garageLabel.setText(garageAmount);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		
		String bedroomAmount = String.valueOf(Global.data.getBedroomAmount());
		String garageAmount = String.valueOf(Global.data.getGarageroomAmount());
		
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelTextArea.enter)
		{
			HomebuilderJPanelTextArea.enter.setFocusable(false);
			String message = Global.data.finalMessage();	
			HomebuilderJPanelTextArea.area.setText(message);
			
			if(Global.data.getModelType() == null)
			{
				Global.data.setmodelPrice("null");	
			}
			
			
			detailPanel.modelLabel.setText(Global.data.getModelType());
			detailPanel.bedroomLabel.setText(bedroomAmount);
			detailPanel.garageLabel.setText(garageAmount);

		}
		
		if(source == HomebuilderJPanelTextArea.clear)
		{
			HomebuilderJPanelTextArea.clear.setFocusable(false);
			HomebuilderJPanelTextArea.area.setText(Global.data.defaultMessage);
			Global.data.setmodelPrice("null"); // Pass null will be handled by the else
			Global.data.setbedroomPrice(-1); // This will be handled by the else
			Global.data.setgaragePrice(-1); // This will be handled by the else
			Global.data.setBedroomAmount(0);
			Global.data.setGarageroomAmount(0);
			
			ImageIcon i = new ImageIcon("blueprint.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
			HomebuilderJPanelTextArea.picLabel.setBounds(25,200,250,130);
			
			detailPanel.modelLabel.setText(Global.data.getModelType());
			detailPanel.bedroomLabel.setText(bedroomAmount);
			detailPanel.garageLabel.setText(garageAmount);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
