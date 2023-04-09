import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;
import org.apache.pdfbox.pdmodel.font.PDType1Font;



public class Statistiques {
    
    private int nbAgents;
    private int nbSorties;
    private int nbObstacles;

    private int nbAgentsSortis;

    private int nbAgentsBloques;
    private int nbAgentsMorts;
    private int nbAgentsMortsParPression;

    public Statistiques() {
        this.nbAgents = 0;
        this.nbSorties = 0;
        this.nbObstacles = 0;
        this.nbAgentsSortis = 0;
        this.nbAgentsBloques = 0;
        this.nbAgentsMorts = 0;
        this.nbAgentsMortsParPression = 0;
    }

    public void setNbAgents(int nbAgents) {
        this.nbAgents = nbAgents;
    }

    public void setNbSorties(int nbSorties) {
        this.nbSorties = nbSorties;
    }

    public void setNbObstacles(int nbObstacles) {
        this.nbObstacles = nbObstacles;
    }

    public void setNbAgentsSortis(int nbAgentsSortis) {
        this.nbAgentsSortis = nbAgentsSortis;
    }

    public void genererRapport() {
        //générer un pdf
        PDDocument document = new PDDocument();
        try {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            PDType1Font font = PDType1Font.HELVETICA_BOLD;
            int fontSize = 12;
            contentStream.setFont(font, fontSize);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 700);
            contentStream.showText("Rapport");
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'agents : " + this.nbAgents);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre de sorties : " + this.nbSorties);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'obstacles : " + this.nbObstacles);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'agents sortis : " + this.nbAgentsSortis);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'agents bloqués : " + this.nbAgentsBloques);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'agents morts : " + this.nbAgentsMorts);
            contentStream.newLineAtOffset(0, -30);
            contentStream.showText("Nombre d'agents morts par pression : " + this.nbAgentsMortsParPression);
            contentStream.endText();
            contentStream.close();
            document.save(new File("Rapport.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

