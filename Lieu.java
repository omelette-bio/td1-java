public class Lieu {
    protected String nom;
    protected Personnage[] pnjs;
    protected Lieu[] lieuxVoisins;
    protected int nbMonstres;
             
    public Lieu(String name, Personnage[] pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
    }
    
    public void addVoisin(Lieu[] voisins) {
        this.lieuxVoisins = voisins;
    }

    public boolean noMonsters() {
        return this.nbMonstres == 0;
    }
}
