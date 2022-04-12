import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SearchButton {
	
	public static void createSearchButton(JFrame jf, JPanel panel) {
		JTextField searchBar = new JTextField(50);
		panel.add(searchBar);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton searchButton = new JButton("Search");
		searchButton.setSize(20,20);
		panel.add(searchButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a  = searchBar.getText();
				if(a.toLowerCase().equalsIgnoreCase("league of legend")||a.toLowerCase().equalsIgnoreCase("lol")) {
					ViewGames.lol();
				}
				else if(a.toLowerCase().equalsIgnoreCase("hunt:showdown")||a.toLowerCase().equalsIgnoreCase("hunt")) {
					ViewGames.hunt();
				}
				else if(a.toLowerCase().equalsIgnoreCase("csgo")||a.toLowerCase().equalsIgnoreCase("Counter-Strike: Global Offensive")) {
					ViewGames.csgo();
				}
				else if(a.toLowerCase().equalsIgnoreCase("minecraft")||a.toLowerCase().equalsIgnoreCase("mc")) {
					ViewGames.mc();
				}
				
			}
		});
		
	}
}