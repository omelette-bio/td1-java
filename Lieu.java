
public class Lieu {
    protected String nom;
    protected Personnage[] pnjs;
    protected Lieu[] lieuxVoisins;
             
    public Lieu(String name, Personnage[] pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
    }
    
    public void addVoisin(Lieu[] voisins) {
        this.lieuxVoisins = voisins;
    }

}
