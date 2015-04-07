package Construction_Company_Client_App;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomebuilderJPanelTextArea extends JPanel{
	
	Fonts font = new Fonts();
	
	public HomebuilderJPanelTextArea(){
		
		JTextArea area = new JTextArea();
		area.setLineWrap(true);
		area.setSize(200,200);
		area.setFont(font.cosmicArea);
		area.setBorder(Borders.blackline);
		area.setText("Enjoy Building Your New Home");
		JScrollPane scroll = new JScrollPane (area, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		add(scroll);
	}

}
