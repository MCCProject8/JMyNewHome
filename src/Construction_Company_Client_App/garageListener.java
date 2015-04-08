package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class garageListener implements ActionListener {

		int garagePrice;
	
		HomebuilderData storeData = new HomebuilderData();

	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object source = e.getSource();
			
		
		if(source == HomebuilderJPanelModels.garage0)
		{
			storeData.setgaragePrice(0);
			HomebuilderJPanelModels.garage0.setFocusable(true);
	
		}
		else if(source == HomebuilderJPanelModels.garage1)
		{
			storeData.setgaragePrice(7775);
			HomebuilderJPanelModels.garage1.setFocusable(true);
	
		}
		else if(source == HomebuilderJPanelModels.garage2)
		{
			storeData.setgaragePrice(7775 * 2);
			HomebuilderJPanelModels.garage2.setFocusable(true);
	
	
		}
		else if(source == HomebuilderJPanelModels.garage3)
		{
			storeData.setgaragePrice(7775 * 3);
			HomebuilderJPanelModels.garage3.setFocusable(true);
	
		}
		
	
	}

}