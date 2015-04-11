package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class modelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelModels.modelAspenButton)
		{
			Global.data.setmodelPrice("Aspen");	
			ImageIcon i = new ImageIcon("Aspen.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
		}
		if(source == HomebuilderJPanelModels.modelBrittanyButton)
		{
			Global.data.setmodelPrice("Brittany");
			ImageIcon i = new ImageIcon("Brittany.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
		}
		if(source == HomebuilderJPanelModels.modelColonialButton)
		{
			Global.data.setmodelPrice("Colonial");
			ImageIcon i = new ImageIcon("Colonial.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
			HomebuilderJPanelTextArea.picLabel.setBounds(57,200,300,130);
		}
		if(source == HomebuilderJPanelModels.modelDartmoorButton)
		{
			Global.data.setmodelPrice("Dartmoor");
			ImageIcon i = new ImageIcon("Dartmoor.jpg");
			HomebuilderJPanelTextArea.picLabel.setIcon(i);
			HomebuilderJPanelTextArea.picLabel.setBounds(17,200,300,130);

		}
		

	}

}
