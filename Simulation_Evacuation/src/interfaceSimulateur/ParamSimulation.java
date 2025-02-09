public class ParamSimulation {

    private int masseMin;
    private int masseMax;
    private int vitesseMin;
    private int vitesseMax;
    private int rayonMin;
    private int rayonMax;
    private static int nbAgents;
    private static int nbSorties;
    private static int nbObstacles;

    public ParamSimulation() {
        this.masseMin = 0;
        this.masseMax = 100;
        this.vitesseMin = 2;
        this.vitesseMax = 8;
        this.rayonMin = 5;
        this.rayonMax = 50;
        this.nbAgents = 0;
    }

    /** Obtenir la masse minimale
     * @return la masse minimale
     */
    public int getMasseMin() {
        return masseMin;
    }

    /** Obtenir la masse maximale
     * @return la masse maximale
     */
    public int getMasseMax() {
        return masseMax;
    }

    /** Obtenir la vitesse minimale
     * @return la vitesse minimale
     */
    public int getVitesseMin() {
        return vitesseMin;
    }

    /** Obtenir la vitesse maximale
     * @return la vitesse maximale
     */
    public int getVitesseMax() {
        return vitesseMax;
    }

    /** Obtenir le rayon minimale
     * @return le rayon minimale
     */
    public int getRayonMin() {
        return rayonMin;
    }

    /** Obtenir le rayon maximale
     * @return le rayon maximale
     */
    public int getRayonMax() {
        return rayonMax;
    }

    /** Obtenir le nombre d'agents
     * @return le nombre d'agents
     */
    public static int getNbAgents() {
        return nbAgents;
    }

    /** Obtenir le nombre de sorties
     * @return le nombre de sorties
     */
    public static int getNbSorties() {
        return nbSorties;
    }

    /** Obtenir le nombre d'obstacles
     * @return le nombre d'obstacles
     */
    public static int getNbObstacles() {
        return nbObstacles;
    }

    /** Redéginir la masse minimale
     * @param masseMin
     */
    public void setMasseMin(int masseMin) {
        this.masseMin = masseMin;
    }

    /** Redéfinir la masse maximale
     * @param masseMax
     */
    public void setMasseMax(int masseMax) {
        this.masseMax = masseMax;
    }

    /** Redéfinir la vitesse minimale
     * @param vitesseMin
     */
    public void setVitesseMin(int vitesseMin) {
        this.vitesseMin = vitesseMin;
    }

    /** Redéfinir la vitesse maximale
     * @param vitesseMax
     */
    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    /** Redéfinir le rayon minimale
     * @param rayonMin
     */
    public void setRayonMin(int rayonMin) {
        this.rayonMin = rayonMin;
    }

    /** Redéfinir le rayon maximale
     * @param rayonMax
     */
    public void setRayonMax(int rayonMax) {
        this.rayonMax = rayonMax;
    }

    /** Redéfinir le nombre d'agents
     * @param nbAgents
     */
    public static void setNbAgents(int nbrAgents) {
        nbAgents = nbrAgents;
    }

    /** Redéfinir le nombre de sorties
     * @param nbSorties
     */
    public static void setNbSorties(int nbrSorties) {
        nbSorties = nbrSorties;
    }

    /** Redéfinir le nombre d'obstacles
     * @param nbObstacles
     */
    public static void setNbObstacles(int nbrObstacles) {
        nbObstacles = nbrObstacles;
    }
    
}

