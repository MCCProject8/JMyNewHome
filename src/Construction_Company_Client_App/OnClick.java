package Construction_Company_Client_App;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OnClick implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		HomebuilderJPanelTextArea.enter.setFocusable(false);
		HomebuilderJPanelTextArea.clear.setFocusable(false);
		
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelTextArea.enter)
		{
			String message = Global.data.finalMessage();	
			HomebuilderJPanelTextArea.area.setText(message);
			String type = Global.data.getModelType();
		
			
		}
		
		if(source == HomebuilderJPanelTextArea.clear)
		{
			HomebuilderJPanelTextArea.area.setText(Global.data.defaultMessage);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		HomebuilderJPanelTextArea.enter.setFocusable(false);
		HomebuilderJPanelTextArea.clear.setFocusable(false);
		
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelTextArea.enter)
		{
			String message = Global.data.finalMessage();	
			HomebuilderJPanelTextArea.area.setText(message);
		}
		
		if(source == HomebuilderJPanelTextArea.clear)
		{
			HomebuilderJPanelTextArea.area.setText(Global.data.defaultMessage);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
