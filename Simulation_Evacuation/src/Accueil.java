package interface_CrowdSimulator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Accueil extends JPanel {
	public Accueil() {
		super();
		this.elementsdeframe("Mon projet.jpg");

	}
	public void elementsdeframe(String nom_image) {
		try {
			final JLabel titre = new JLabel("Bienvenue sur CrowdSimulator", SwingConstants.CENTER);
			titre.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 32));
			titre.setForeground(new Color(0, 128, 128)); 
			
			
			BufferedImage background = ImageIO.read(new File(nom_image));
			JLabel image = new JLabel(new ImageIcon(background) );
			setLayout(new BorderLayout());
			add(image);
			setLayout(new FlowLayout());
			add(titre);
			
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
}