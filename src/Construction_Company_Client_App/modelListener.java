package Construction_Company_Client_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == HomebuilderJPanelModels.modelAspenButton)
		{
			Global.data.setmodelPrice("Aspen");
		}
		if(source == HomebuilderJPanelModels.modelBrittanyButton)
		{
			Global.data.setmodelPrice("Brittany");

		}
		if(source == HomebuilderJPanelModels.modelColonialButton)
		{
			Global.data.setmodelPrice("Colonial");

		}
		if(source == HomebuilderJPanelModels.modelDartmoorButton)
		{
			Global.data.setmodelPrice("Dartmoor");

		}
		

	}

}
