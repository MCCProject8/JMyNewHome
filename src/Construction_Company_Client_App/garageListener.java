package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class garageListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelModels.garage0)
		{
			Global.data.setgaragePrice(0);
			Global.data.setGarageroomAmount(0);
		}
		if(source == HomebuilderJPanelModels.garage1)
		{
			Global.data.setgaragePrice(1);
			Global.data.setGarageroomAmount(1);
		}
		if(source == HomebuilderJPanelModels.garage2)
		{
			Global.data.setgaragePrice(2);
			Global.data.setGarageroomAmount(2);
		}
		if(source == HomebuilderJPanelModels.garage3)
		{
			Global.data.setgaragePrice(3);
			Global.data.setGarageroomAmount(3);
		}

	}

}
