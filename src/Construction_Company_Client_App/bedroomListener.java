package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bedroomListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelModels.bedroom1)
		{
			Global.data.setbedroomPrice(1);
		}
		if(source == HomebuilderJPanelModels.bedroom2)
		{
			Global.data.setbedroomPrice(2);

		}
		if(source == HomebuilderJPanelModels.bedroom3)
		{
			Global.data.setbedroomPrice(3);

		}
		if(source == HomebuilderJPanelModels.bedroom4)
		{
			Global.data.setbedroomPrice(4);

		}

	}

}
