package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bedroomListener implements ActionListener {

		int bedroomPrice;
	
		HomebuilderData storeData = new HomebuilderData();

	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object source = e.getSource();
			
		
		if(source == HomebuilderJPanelModels.bedroom1)
		{
			storeData.setbedroomPrice(10500);
			HomebuilderJPanelModels.bedroom1.setFocusable(true);
	
		}
		else if(source == HomebuilderJPanelModels.bedroom2)
		{
			storeData.setbedroomPrice(10500 * 2);
			HomebuilderJPanelModels.bedroom2.setFocusable(true);
	
		}
		else if(source == HomebuilderJPanelModels.bedroom3)
		{
			storeData.setbedroomPrice(10500 * 3);
			HomebuilderJPanelModels.bedroom3.setFocusable(true);
	
	
		}
		else if(source == HomebuilderJPanelModels.bedroom4)
		{
			storeData.setbedroomPrice(10500 * 4);
			HomebuilderJPanelModels.bedroom4.setFocusable(true);
	
		}
		
	
	}

}