package Construction_Company_Client_App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class HomebuilderMain extends JFrame{
	
	public static int WIDTH = 400;
	public static int HEIGHT = 400;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				HomebuilderMain frame;
				detailFrame frame2;
								
				try {
					
					frame = new HomebuilderMain();
					frame2 = new detailFrame();
					frame.setVisible(true);
					frame2.setVisible(true);
				
					frame2.setLocation(frame.getX() + 500, frame.getY() - 10);
				
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
		});
		

	}
	
	public HomebuilderMain() throws IOException{
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		setTitle("Build Your Own Home");
		
		HomebuilderJPanel panelTitle = new HomebuilderJPanel();
		HomebuilderJPanelModels panelModels = new HomebuilderJPanelModels();
		HomebuilderJPanelTextArea panelTextarea = new HomebuilderJPanelTextArea();
		JPanel p = new JPanel();
		p.setBackground(Color.decode("#CCA37A"));

		
		add(panelTitle, BorderLayout.NORTH);
		add(panelModels, BorderLayout.WEST);
		add(panelTextarea, BorderLayout.CENTER);
		add(p, BorderLayout.EAST);
		
		
		try {
		      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    } catch (InstantiationException e) {
		      e.printStackTrace();
		    } catch (IllegalAccessException e) {
		      e.printStackTrace();
		    } catch (UnsupportedLookAndFeelException e) {
		      e.printStackTrace();
		    }
		
	}
	
	
}
