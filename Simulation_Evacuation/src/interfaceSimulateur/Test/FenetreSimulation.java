import java.awt.BorderLayout;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class FenetreSimulation extends JFrame {
    int nbPersonnesCourant = 0;
    public static ParamSimulation parametresSimulation = new ParamSimulation();
    public FenetreSimulation() {
        super("Simulation d'évacuation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1080, 720);
        setLocationRelativeTo(null);

        PanneauSimulation Simulation = new PanneauSimulation();
        JPanel panSimulation = Simulation;
        getContentPane().add(panSimulation, BorderLayout.CENTER);

        JPanel paramSimulation = new PanneauDroite();
        getContentPane().add(paramSimulation, BorderLayout.EAST);

        JSlider sliderNbPersonnes = ((PanneauDroite) paramSimulation).getSliderNbPersonnes();

        Point sortie = new Point(100, 100);
        Simulation.ajouterSortie(sortie);

        // Ajouter un ChangeListener au JSlider pour écouter les changements de valeur
        sliderNbPersonnes.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int nbPersonnes = sliderNbPersonnes.getValue();
                while (nbPersonnesCourant < nbPersonnes) {
                    int x = (int) (Math.random() * panSimulation.getWidth());
                    int y = (int) (Math.random() * panSimulation.getHeight());
                    double vitesse = Math.random() * (parametresSimulation.getVitesseMax() - parametresSimulation.getVitesseMin()) + parametresSimulation.getVitesseMin()+0.01;
                    double masse = Math.random() * (parametresSimulation.getMasseMax() - parametresSimulation.getMasseMin()) + parametresSimulation.getMasseMin();
                    double rayon = (Math.random()*(FenetreSimulation.parametresSimulation.getRayonMin()+FenetreSimulation.parametresSimulation.getRayonMax())/2 + FenetreSimulation.parametresSimulation.getRayonMin())/2;
                    Simulation.ajouterPersonne(new Agent(new Pt(x, y), new Pt(sortie.getX(), sortie.getY()), vitesse, rayon, masse, 0.5));
                    nbPersonnesCourant++;
                }
                
            }
        });

        setVisible(true);
    }
}
