import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mur extends JFrame implements MouseListener {
	
	private Point premierClic;
    private Point deuxièmeClic;
    private Color couleur;
    private int epaisseur;

    /* Constructeur de la classe Mur */ 
    public Mur() {
    	//Creation d'une fenêtre 
    	super("Mur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 720);
        addMouseListener(this);
        couleur = Color.BLACK;
        epaisseur = 10;
        
        //rendre visible la fenêtre
        setVisible(true);
    }
    
    public void mouseClicked(MouseEvent e) {
        if (premierClic == null) {
            premierClic = e.getPoint();
        } else {
            deuxièmeClic = e.getPoint();
            dessinerMur();
            // après la création d'un mur au remet à zero les clics
            premierClic = null;
            deuxièmeClic = null;
        }
    }
    private void dessinerMur() {
        
    	Graphics g = getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(couleur);
        g2d.setStroke(new BasicStroke(epaisseur));
        g2d.drawLine(premierClic.x, premierClic.y, deuxièmeClic.x, deuxièmeClic.y);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
    public void setCouleur(Color c) {
        couleur = c;
    }

    public void setEpaisseur(int e) {
        epaisseur = e;
    }
    public static void main(String[] args) {
        new Mur();
    }

}
