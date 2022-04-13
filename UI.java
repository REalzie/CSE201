import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;


public class UI {
	static JFrame jf = new JFrame("Video Game Catalog");
	public UI() {
		ArrayList<VideoGame> games = new ArrayList<>();
		Main.parseVideoGames(games);
		
		jf.setLayout(new BorderLayout());
		jf.setSize(1400,600);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewGames.viewGames(jf);
		JPanel northPanel = new JPanel();
		Log_In.CreateLogInButton(jf);
		//SearchBar.createSearchButton(jf, northPanel);
		SearchButton.createSearchButton(jf, northPanel);
		CreateAccount.createAccountButton(jf, northPanel);
		Sort.createSortMenu(jf,northPanel);
		jf.setVisible(true);
		
	}

}
