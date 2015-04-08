package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modelListener implements ActionListener{
	
		int modelPrice;

		HomebuilderData storeData = new HomebuilderData();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
			
		
		if(source == HomebuilderJPanelModels.modelAspenButton)
		{
			storeData.setmodelPrice(100000);
			HomebuilderJPanelModels.modelAspenButton.setFocusable(true);

		}
		else if(source == HomebuilderJPanelModels.modelBrittanyButton)
		{
			storeData.setmodelPrice(120000);
			HomebuilderJPanelModels.modelBrittanyButton.setFocusable(true);

		}
		else if(source == HomebuilderJPanelModels.modelColonialButton)
		{
			storeData.setmodelPrice(180000);
			HomebuilderJPanelModels.modelColonialButton.setFocusable(true);


		}
		else if(source == HomebuilderJPanelModels.modelDartmoorButton)
		{
			storeData.setmodelPrice(250000);
			HomebuilderJPanelModels.modelDartmoorButton.setFocusable(true);

		}
		
		
	}

}
